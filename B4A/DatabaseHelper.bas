B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
' MiTareas - Database Helper Module
' Módulo para gestión de base de datos SQLite simplificada
' Sin servicios web, solo SQLite local

Sub Process_Globals
	Private SQL1 As SQL
	Private IsInitialized As Boolean
End Sub

Sub Initialize
	' Inicializar la base de datos
	Try
		If Not(IsInitialized) Then
			' Verificar si existe la base de datos
			If File.Exists(File.DirInternal, "mitareas.db") = False Then
				' Crear base de datos desde cero
				CreateDatabase
			Else
				' Conectar a base de datos existente
				SQL1.Initialize(File.DirInternal, "mitareas.db", False)
			End If
			IsInitialized = True
			Log("Base de datos inicializada correctamente")
		End If
	Catch
		Log("Error al inicializar base de datos: " & LastException.Message)
		Msgbox("Error al acceder a la base de datos", "Error")
	End Try
End Sub

Sub CreateDatabase
	' Crear la base de datos y tablas
	Try
		SQL1.Initialize(File.DirInternal, "mitareas.db", True)
        
		' Crear tabla de usuarios
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS usuarios (" & _
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " & _
            "usuario TEXT NOT NULL UNIQUE, " & _
            "password TEXT NOT NULL, " & _
            "fecha_registro TEXT NOT NULL)")
        
		' Crear tabla de tareas
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS tareas (" & _
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " & _
            "usuario_id INTEGER NOT NULL, " & _
            "titulo TEXT NOT NULL, " & _
            "descripcion TEXT, " & _
            "estado TEXT DEFAULT 'pendiente', " & _
            "fecha_limite TEXT, " & _
            "fecha_creacion TEXT NOT NULL, " & _
            "FOREIGN KEY(usuario_id) REFERENCES usuarios(id))")
        
		' Insertar usuario de prueba
		Dim password As String = "123456" ' En producción usar hash
		SQL1.ExecNonQuery2("INSERT INTO usuarios (usuario, password, fecha_registro) VALUES (?, ?, ?)", _
            Array As Object("admin", password, DateTime.Date(DateTime.Now)))
        
		Log("Base de datos creada exitosamente")
	Catch
		Log("Error al crear base de datos: " & LastException.Message)
		Msgbox("Error al crear la base de datos", "Error")
	End Try
End Sub

Sub ValidarUsuario(usuario As String, password As String) As Int
	' Validar credenciales de usuario
	' Retorna: ID del usuario si es válido, -1 si no es válido
	Try
		If Not(IsInitialized) Then Initialize
        
		Dim cursor As Cursor = SQL1.ExecQuery2("SELECT id FROM usuarios WHERE usuario = ? AND password = ?", _
            Array As String(usuario, password))
        
		If cursor.RowCount > 0 Then
			cursor.Position = 0
			Dim userId As Int = cursor.GetInt("id")
			cursor.Close
			Return userId
		Else
			cursor.Close
			Return -1
		End If
	Catch
		Log("Error al validar usuario: " & LastException.Message)
		Return -1
	End Try
End Sub

Sub RegistrarUsuario(usuario As String, password As String) As Boolean
	' Registrar nuevo usuario
	' Retorna: True si se registró correctamente, False si hay error
	Try
		If Not(IsInitialized) Then Initialize
        
		' Verificar si el usuario ya existe
		Dim cursor As Cursor = SQL1.ExecQuery2("SELECT id FROM usuarios WHERE usuario = ?", _
            Array As String(usuario))
        
		If cursor.RowCount > 0 Then
			cursor.Close
			Msgbox("El usuario ya existe", "Error")
			Return False
		End If
		cursor.Close
        
		' Insertar nuevo usuario
		SQL1.ExecNonQuery2("INSERT INTO usuarios (usuario, password, fecha_registro) VALUES (?, ?, ?)", _
            Array As Object(usuario, password, DateTime.Date(DateTime.Now)))
        
		Log("Usuario registrado: " & usuario)
		Return True
	Catch
		Log("Error al registrar usuario: " & LastException.Message)
		Msgbox("Error al registrar usuario", "Error")
		Return False
	End Try
End Sub

Sub ObtenerTareas(usuarioId As Int) As List
	' Obtener todas las tareas de un usuario
	' Actualiza automáticamente tareas vencidas
	Try
		If Not(IsInitialized) Then Initialize
        
		' Actualizar tareas vencidas primero
		ActualizarTareasVencidas(usuarioId)
        
		Dim Tareas As List
		Tareas.Initialize
        
		Dim cursor As Cursor = SQL1.ExecQuery2("SELECT * FROM tareas WHERE usuario_id = ? ORDER BY fecha_creacion DESC", _
            Array As String(usuarioId))
        
		For i = 0 To cursor.RowCount - 1
			cursor.Position = i
			Dim tarea As Map
			tarea.Initialize
			tarea.Put("id", cursor.GetInt("id"))
			tarea.Put("titulo", cursor.GetString("titulo"))
			tarea.Put("descripcion", cursor.GetString("descripcion"))
			tarea.Put("estado", cursor.GetString("estado"))
			tarea.Put("fecha_limite", cursor.GetString("fecha_limite"))
			tarea.Put("fecha_creacion", cursor.GetString("fecha_creacion"))
			Tareas.Add(tarea)
		Next
        
		cursor.Close
		Return Tareas
	Catch
		Log("Error al obtener tareas: " & LastException.Message)
		Dim emptyList As List
		emptyList.Initialize
		Return emptyList
	End Try
End Sub

Sub CrearTarea(usuarioId As Int, titulo As String, descripcion As String, fechaLimite As String) As Boolean
	' Crear nueva tarea
	Try
		If Not(IsInitialized) Then Initialize
        
		SQL1.ExecNonQuery2("INSERT INTO tareas (usuario_id, titulo, descripcion, estado, fecha_limite, fecha_creacion) VALUES (?, ?, ?, ?, ?, ?)", _
            Array As Object(usuarioId, titulo, descripcion, "pendiente", fechaLimite, DateTime.Date(DateTime.Now)))
        
		Log("Tarea creada: " & titulo)
		Return True
	Catch
		Log("Error al crear tarea: " & LastException.Message)
		Msgbox("Error al crear tarea", "Error")
		Return False
	End Try
End Sub

Sub ActualizarTarea(tareaId As Int, titulo As String, descripcion As String, estado As String, fechaLimite As String) As Boolean
	' Actualizar tarea existente
	Try
		If Not(IsInitialized) Then Initialize
        
		SQL1.ExecNonQuery2("UPDATE tareas SET titulo = ?, descripcion = ?, estado = ?, fecha_limite = ? WHERE id = ?", _
            Array As Object(titulo, descripcion, estado, fechaLimite, tareaId))
        
		Log("Tarea actualizada: " & titulo)
		Return True
	Catch
		Log("Error al actualizar tarea: " & LastException.Message)
		Msgbox("Error al actualizar tarea", "Error")
		Return False
	End Try
End Sub

Sub EliminarTarea(tareaId As Int) As Boolean
	' Eliminar tarea
	Try
		If Not(IsInitialized) Then Initialize
        
		SQL1.ExecNonQuery2("DELETE FROM tareas WHERE id = ?", Array As Object(tareaId))
        
		Log("Tarea eliminada: " & tareaId)
		Return True
	Catch
		Log("Error al eliminar tarea: " & LastException.Message)
		Msgbox("Error al eliminar tarea", "Error")
		Return False
	End Try
End Sub

Sub MarcarComoFinalizada(tareaId As Int) As Boolean
	' Marcar tarea como finalizada
	Try
		If Not(IsInitialized) Then Initialize
        
		SQL1.ExecNonQuery2("UPDATE tareas SET estado = 'finalizada' WHERE id = ?", Array As Object(tareaId))
        
		Log("Tarea marcada como finalizada: " & tareaId)
		Return True
	Catch
		Log("Error al finalizar tarea: " & LastException.Message)
		Msgbox("Error al finalizar tarea", "Error")
		Return False
	End Try
End Sub

Sub ActualizarTareasVencidas(usuarioId As Int)
	' Actualizar automáticamente tareas vencidas
	Try
		If Not(IsInitialized) Then Initialize
        
		Dim fechaHoy As String = DateTime.Date(DateTime.Now)
        
		SQL1.ExecNonQuery2("UPDATE tareas SET estado = 'finalizada' WHERE usuario_id = ? AND estado = 'pendiente' AND fecha_limite < ? AND fecha_limite != ''", _
            Array As Object(usuarioId, fechaHoy))
        
		Log("Tareas vencidas actualizadas para usuario: " & usuarioId)
	Catch
		Log("Error al actualizar tareas vencidas: " & LastException.Message)
	End Try
End Sub

Sub GetDatabase As SQL
	' Obtener instancia de la base de datos
	If Not(IsInitialized) Then Initialize
	Return SQL1
End Sub