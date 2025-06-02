B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
' MiTareas - Módulo de Gestión de Tareas
' Pantalla principal para gestionar tareas personales



Sub Process_Globals
	' Variables del proceso
End Sub

Sub Globals
	' Variables globales de la actividad
	Private lvTareas As ListView
	Private btnAgregarTarea As Button
	Private btnCerrarSesion As Button
	Private lblBienvenida As Label
	Private lblEstadisticas As Label
	Private pnlHeader As Panel
	Private pnlBotones As Panel
    
	' Variables para gestión de tareas
	Private ListaTareas As List
	Private TareaSeleccionada As Int = -1
End Sub

Sub Activity_Create(FirstTime As Boolean)
	' Crear la actividad de tareas
	Try
		' Verificar que hay usuario logueado
		If Main.ObtenerUsuarioActual = -1 Then
			Msgbox("Debe iniciar sesión primero", "Error")
			StartActivity(Main)
			Activity.Finish
			Return
		End If
        
		' Cargar el diseño
		Activity.LoadLayout("Tareas")
        
		' Configurar la interfaz
		ConfigurarInterfaz
        
		' Cargar tareas del usuario
		CargarTareas
        
	Catch
		Log("Error al crear actividad de tareas: " & LastException.Message)
		Msgbox("Error al cargar pantalla de tareas", "Error")
	End Try
End Sub

Sub ConfigurarInterfaz
	' Configurar elementos de la interfaz
	Try
		' Establecer título de la actividad
		Activity.Title = "MiTareas - Gestión"
        
		' Configurar etiqueta de bienvenida
		lblBienvenida.Text = "¡Hola " & Main.ObtenerNombreUsuario & "!"
		lblBienvenida.TextSize = 18
		lblBienvenida.TextColor = Colors.DarkGray
        
		' Configurar botones
		btnAgregarTarea.Text = "NUEVA TAREA"
		btnCerrarSesion.Text = "CERRAR SESIÓN"
        
		' Configurar ListView
		lvTareas.SingleLineLayout.Label.TextSize = 16
		lvTareas.SingleLineLayout.Label.TextColor = Colors.Black
        
	Catch
		Log("Error al configurar interfaz: " & LastException.Message)
	End Try
End Sub

Sub CargarTareas
	' Cargar y mostrar tareas del usuario actual
	Try
		' Limpiar lista actual
		lvTareas.Clear
        
		' Obtener tareas de la base de datos
		ListaTareas = DatabaseHelper.ObtenerTareas(Main.ObtenerUsuarioActual)
        
		If ListaTareas.Size = 0 Then
			' No hay tareas
			lvTareas.AddSingleLine("No hay tareas. ¡Agrega tu primera tarea!")
			lblEstadisticas.Text = "Sin tareas registradas"
		Else
			' Mostrar tareas en la lista
			For i = 0 To ListaTareas.Size - 1
				Dim tarea As Map = ListaTareas.Get(i)
				Dim textoTarea As String = FormatearTareaParaLista(tarea)
				lvTareas.AddSingleLine(textoTarea)
			Next
            
			' Actualizar estadísticas
			ActualizarEstadisticas
		End If
        
	Catch
		Log("Error al cargar tareas: " & LastException.Message)
		Msgbox("Error al cargar las tareas", "Error")
	End Try
End Sub

Sub FormatearTareaParaLista(tarea As Map) As String
	' Formatear tarea para mostrar en la lista
	Try
		Dim titulo As String = tarea.Get("titulo")
		Dim estado As String = tarea.Get("estado")
		Dim fechaLimite As String = tarea.Get("fecha_limite")
        
		Dim icono As String
		If estado = "finalizada" Then
			icono = "✓ "
		Else
			icono = "• "
		End If
        
		Dim textoFecha As String = ""
		If fechaLimite <> "" And fechaLimite <> Null Then
			textoFecha = " (Hasta: " & fechaLimite & ")"
		End If
        
		Return icono & titulo & textoFecha
        
	Catch
		Log("Error al formatear tarea: " & LastException.Message)
		Return "Error en tarea"
	End Try
End Sub

Sub ActualizarEstadisticas
	' Actualizar estadísticas de tareas
	Try
		Dim totalTareas As Int = ListaTareas.Size
		Dim tareasCompletadas As Int = 0
		Dim tareasPendientes As Int = 0
        
		For i = 0 To ListaTareas.Size - 1
			Dim tarea As Map = ListaTareas.Get(i)
			Dim estado As String = tarea.Get("estado")
            
			If estado = "finalizada" Then
				tareasCompletadas = tareasCompletadas + 1
			Else
				tareasPendientes = tareasPendientes + 1
			End If
		Next
        
		lblEstadisticas.Text = "Total: " & totalTareas & " | Completadas: " & tareasCompletadas & " | Pendientes: " & tareasPendientes
		lblEstadisticas.TextSize = 12
		lblEstadisticas.TextColor = Colors.Gray
        
	Catch
		Log("Error al actualizar estadísticas: " & LastException.Message)
	End Try
End Sub

Sub btnAgregarTarea_Click
	' Mostrar diálogo para agregar nueva tarea
	Try
		MostrarDialogoTarea(-1, "", "", "", "pendiente")
	Catch
		Log("Error al mostrar diálogo de nueva tarea: " & LastException.Message)
	End Try
End Sub

Sub btnCerrarSesion_Click
	' Cerrar sesión del usuario
	Try
		Dim respuesta As Int = Msgbox2("¿Está seguro que desea cerrar sesión?", "Cerrar Sesión", "Sí", "", "No", Null)
		If respuesta = DialogResponse.POSITIVE Then
			CallSub(Main, "CerrarSesion")
			StartActivity(Main)
			Activity.Finish
		End If
	Catch
		Log("Error al cerrar sesión: " & LastException.Message)
	End Try
End Sub

Sub lvTareas_ItemClick (Position As Int, Value As Object)
	' Manejar clic en item de lista de tareas
	Try
		If ListaTareas.Size > 0 And Position < ListaTareas.Size Then
			Dim tarea As Map = ListaTareas.Get(Position)
			MostrarOpcionesTarea(tarea)
		End If
	Catch
		Log("Error al hacer clic en tarea: " & LastException.Message)
	End Try
End Sub

Sub MostrarOpcionesTarea(tarea As Map)
	' Mostrar opciones para una tarea seleccionada
	Try
		Dim titulo As String = tarea.Get("titulo")
		Dim estado As String = tarea.Get("estado")
		Dim tareaId As Int = tarea.Get("id")
        
		Dim opciones As List
		opciones.Initialize
		opciones.Add("Ver/Editar")
        
		If estado = "pendiente" Then
			opciones.Add("Marcar como Finalizada")
		End If
        
		opciones.Add("Eliminar")
		opciones.Add("Cancelar")
        
		Dim respuesta As Int = InputList(opciones, "Opciones para: " & titulo, -1)
        
		Select respuesta
			Case 0 ' Ver/Editar
				MostrarDialogoTarea(tareaId, titulo, tarea.Get("descripcion"), tarea.Get("fecha_limite"), estado)
			Case 1 ' Marcar como finalizada o Eliminar (depende del estado)
				If estado = "pendiente" Then
					MarcarTareaComoFinalizada(tareaId)
				Else
					EliminarTarea(tareaId)
				End If
			Case 2 ' Eliminar o Cancelar (depende del estado)
				If estado = "pendiente" Then
					EliminarTarea(tareaId)
				End If
				' Si es "Cancelar", no hacer nada
		End Select
        
	Catch
		Log("Error al mostrar opciones de tarea: " & LastException.Message)
	End Try
End Sub

Sub MostrarDialogoTarea(tareaId As Int, titulo As String, descripcion As String, fechaLimite As String, estado As String)
	' Mostrar diálogo para crear/editar tarea
	Try
		Dim esNuevaTarea As Boolean = (tareaId = -1)
        
		' Solicitar título
		Dim nuevoTitulo As String = InputDialog("Ingrese el título de la tarea:", "Título", titulo, False)
		If nuevoTitulo = "" Then Return ' Usuario canceló
        
		' Solicitar descripción
		Dim nuevaDescripcion As String = InputDialog("Ingrese la descripción (opcional):", "Descripción", descripcion, False)
        
		' Solicitar fecha límite
		Dim nuevaFechaLimite As String = InputDialog("Ingrese fecha límite (YYYY-MM-DD) - opcional:", "Fecha Límite", fechaLimite, False)
        
		' Validar fecha si se ingresó
		If nuevaFechaLimite <> "" And Not(ValidarFecha(nuevaFechaLimite)) Then
			Msgbox("Formato de fecha inválido. Use YYYY-MM-DD", "Error")
			Return
		End If
        
		' Guardar tarea
		Dim exito As Boolean
		If esNuevaTarea Then
			exito = DatabaseHelper.CrearTarea(Main.ObtenerUsuarioActual, nuevoTitulo, nuevaDescripcion, nuevaFechaLimite)
		Else
			exito = DatabaseHelper.ActualizarTarea(tareaId, nuevoTitulo, nuevaDescripcion, estado, nuevaFechaLimite)
		End If
        
		If exito Then
			If esNuevaTarea Then
				ToastMessageShow("Tarea creada exitosamente", False)
			Else
				ToastMessageShow("Tarea actualizada exitosamente", False)
			End If
			CargarTareas ' Recargar lista
		End If
        
	Catch
		Log("Error en diálogo de tarea: " & LastException.Message)
		Msgbox("Error al procesar la tarea", "Error")
	End Try
End Sub

Sub ValidarFecha(fecha As String) As Boolean
	' Validar formato de fecha básico (YYYY-MM-DD)
	Try
		If fecha.Length <> 10 Then Return False
		If fecha.CharAt(4) <> "-" Or fecha.CharAt(7) <> "-" Then Return False
        
		Dim partes() As String = Regex.Split("-", fecha)
		If partes.Length <> 3 Then Return False
        
		Dim año As Int = partes(0)
		Dim mes As Int = partes(1)
		Dim dia As Int = partes(2)
        
		If año < 2020 Or año > 2030 Then Return False
		If mes < 1 Or mes > 12 Then Return False
		If dia < 1 Or dia > 31 Then Return False
        
		Return True
	Catch
		Return False
	End Try
End Sub

Sub MarcarTareaComoFinalizada(tareaId As Int)
	' Marcar una tarea como finalizada
	Try
		Dim exito As Boolean = DatabaseHelper.MarcarComoFinalizada(tareaId)
		If exito Then
			ToastMessageShow("Tarea marcada como finalizada", False)
			CargarTareas ' Recargar lista
		End If
	Catch
		Log("Error al marcar tarea como finalizada: " & LastException.Message)
	End Try
End Sub

Sub EliminarTarea(tareaId As Int)
	' Eliminar una tarea
	Try
		Dim respuesta As Int = Msgbox2("¿Está seguro que desea eliminar esta tarea?", "Eliminar Tarea", "Sí", "", "No", Null)
		If respuesta = DialogResponse.POSITIVE Then
			Dim exito As Boolean = DatabaseHelper.EliminarTarea(tareaId)
			If exito Then
				ToastMessageShow("Tarea eliminada", False)
				CargarTareas ' Recargar lista
			End If
		End If
	Catch
		Log("Error al eliminar tarea: " & LastException.Message)
	End Try
End Sub

Sub Activity_Resume
	' Reanudar actividad
	' Recargar tareas por si fueron modificadas
	CargarTareas
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	' Pausar actividad
	' No hay acciones específicas
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	' Manejar presión de teclas
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		' Confirmar salida
		Dim respuesta As Int = Msgbox2("¿Desea cerrar sesión y salir?", "Salir", "Sí", "", "No", Null)
		If respuesta = DialogResponse.POSITIVE Then
			CallSub(Main, "CerrarSesion")
			ExitApplication
		End If
		Return True
	End If
	Return False
End Sub