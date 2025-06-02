B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
' MiTareas - Módulo de Login
' Maneja autenticación y registro de usuarios de forma simple



Sub Process_Globals
	' Variables del proceso
End Sub

Sub Globals
	' Variables globales de la actividad
	Private txtUsuario As EditText
	Private txtPassword As EditText
	Private btnAccion As Button
	Private btnCambiarModo As Button
	Private lblTitulo As Label
	Private lblInstrucciones As Label
	Private pnlLogin As Panel
	Private EsModoRegistro As Boolean = False
End Sub

Sub Activity_Create(FirstTime As Boolean)
	' Crear la actividad de login
	Try
		' Cargar el diseño
		Activity.LoadLayout("login")
        
		' Configurar la interfaz inicial
		ConfigurarInterfaz
        
		' Establecer modo por defecto (login)
		EstablecerModoLogin
        
	Catch
		Log("Error al crear actividad de login: " & LastException.Message)
		Msgbox("Error al cargar pantalla de login", "Error")
	End Try
End Sub

Sub ConfigurarInterfaz
	' Configurar elementos básicos de la interfaz
	Try
		' Configurar campos de texto
		txtUsuario.Hint = "Nombre de usuario"
		txtUsuario.InputType = txtUsuario.INPUT_TYPE_TEXT
        
		txtPassword.Hint = "Contraseña"
		txtPassword.PasswordMode = True
        
		' Establecer título de la actividad
		Activity.Title = "MiTareas - Acceso"
        
	Catch
		Log("Error al configurar interfaz: " & LastException.Message)
	End Try
End Sub

Sub EstablecerModoLogin
	' Configurar interfaz para modo login
	Try
		EsModoRegistro = False
        
		lblTitulo.Text = "Iniciar Sesión"
		lblTitulo.TextSize = 20
		lblTitulo.TextColor = Colors.DarkGray
        
		lblInstrucciones.Text = "Ingrese sus credenciales para acceder"
		lblInstrucciones.TextSize = 14
		lblInstrucciones.TextColor = Colors.Gray
        
		btnAccion.Text = "INICIAR SESIÓN"
		btnCambiarModo.Text = "¿No tienes cuenta? Regístrate"
        
		' Limpiar campos
		txtUsuario.Text = ""
		txtPassword.Text = ""
        
	Catch
		Log("Error al establecer modo login: " & LastException.Message)
	End Try
End Sub

Sub EstablecerModoRegistro
	' Configurar interfaz para modo registro
	Try
		EsModoRegistro = True
        
		lblTitulo.Text = "Registrarse"
		lblTitulo.TextSize = 20
		lblTitulo.TextColor = Colors.DarkGray
        
		lblInstrucciones.Text = "Cree una nueva cuenta para comenzar"
		lblInstrucciones.TextSize = 14
		lblInstrucciones.TextColor = Colors.Gray
        
		btnAccion.Text = "REGISTRARSE"
		btnCambiarModo.Text = "¿Ya tienes cuenta? Inicia sesión"
        
		' Limpiar campos
		txtUsuario.Text = ""
		txtPassword.Text = ""
        
	Catch
		Log("Error al establecer modo registro: " & LastException.Message)
	End Try
End Sub

Sub MostrarModoRegistro(mostrarRegistro As Boolean)
	' Método público para mostrar modo registro (llamado desde Main)
	If mostrarRegistro Then
		EstablecerModoRegistro
	Else
		EstablecerModoLogin
	End If
End Sub

Sub btnAccion_Click
	' Manejar clic en botón principal (Login o Registro)
	Try
		If ValidarCampos() Then
			If EsModoRegistro Then
				ProcesarRegistro
			Else
				ProcesarLogin
			End If
		End If
	Catch
		Log("Error en btnAccion_Click: " & LastException.Message)
		Msgbox("Error al procesar la acción", "Error")
	End Try
End Sub

Sub btnCambiarModo_Click
	' Cambiar entre modo login y registro
	Try
		If EsModoRegistro Then
			EstablecerModoLogin
		Else
			EstablecerModoRegistro
		End If
	Catch
		Log("Error al cambiar modo: " & LastException.Message)
	End Try
End Sub

Sub ValidarCampos() As Boolean
	' Validar que los campos no estén vacíos
	Try
		Dim usuario As String = txtUsuario.Text.Trim
		Dim password As String = txtPassword.Text.Trim
        
		If usuario.Length = 0 Then
			Msgbox("Por favor ingrese un nombre de usuario", "Validación")
			txtUsuario.RequestFocus
			Return False
		End If
        
		If password.Length = 0 Then
			Msgbox("Por favor ingrese una contraseña", "Validación")
			txtPassword.RequestFocus
			Return False
		End If
        
		If usuario.Length < 3 Then
			Msgbox("El nombre de usuario debe tener al menos 3 caracteres", "Validación")
			txtUsuario.RequestFocus
			Return False
		End If
        
		If password.Length < 4 Then
			Msgbox("La contraseña debe tener al menos 4 caracteres", "Validación")
			txtPassword.RequestFocus
			Return False
		End If
        
		Return True
        
	Catch
		Log("Error al validar campos: " & LastException.Message)
		Return False
	End Try
End Sub

Sub ProcesarLogin
	' Procesar inicio de sesión
	Try
		Dim usuario As String = txtUsuario.Text.Trim
		Dim password As String = txtPassword.Text.Trim
        
		' Mostrar indicador de progreso
		ProgressDialogShow("Validando credenciales...")
        
		' Validar con base de datos
		Dim userId As Int = DatabaseHelper.ValidarUsuario(usuario, password)
        
		ProgressDialogHide
        
		If userId > 0 Then
			' Login exitoso
			CallSub3(Main, "EstablecerUsuario", userId, usuario)
            
			Msgbox("¡Bienvenido " & usuario & "!", "Acceso Exitoso")
            
			' Ir a pantalla de tareas
			StartActivity(Tareas)
			Activity.Finish
            
		Else
			' Login fallido
			Msgbox("Usuario o contraseña incorrectos", "Error de Acceso")
			txtPassword.Text = ""
			txtUsuario.RequestFocus
		End If
        
	Catch
		ProgressDialogHide
		Log("Error al procesar login: " & LastException.Message)
		Msgbox("Error al validar credenciales", "Error")
	End Try
End Sub

Sub ProcesarRegistro
	' Procesar registro de nuevo usuario
	Try
		Dim usuario As String = txtUsuario.Text.Trim
		Dim password As String = txtPassword.Text.Trim
        
		' Mostrar indicador de progreso
		ProgressDialogShow("Registrando usuario...")
        
		' Registrar en base de datos
		Dim exito As Boolean = DatabaseHelper.RegistrarUsuario(usuario, password)
        
		ProgressDialogHide
        
		If exito Then
			' Registro exitoso
			Msgbox("Usuario registrado exitosamente. Ahora puede iniciar sesión.", "Registro Exitoso")
            
			' Cambiar a modo login
			EstablecerModoLogin
			txtUsuario.Text = usuario
			txtPassword.RequestFocus
            
		Else
			' Registro fallido (el usuario ya existe o error)
			txtUsuario.RequestFocus
		End If
        
	Catch
		ProgressDialogHide
		Log("Error al procesar registro: " & LastException.Message)
		Msgbox("Error al registrar usuario", "Error")
	End Try
End Sub

Sub Activity_Resume
	' Reanudar actividad
	' Enfocar campo de usuario si está vacío
	If txtUsuario.Text.Trim.Length = 0 Then
		txtUsuario.RequestFocus
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	' Pausar actividad
	' No hay acciones específicas
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	' Manejar presión de teclas
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		' Volver a pantalla principal
		StartActivity(Main)
		Activity.Finish
		Return True
	End If
	Return False
End Sub

Sub txtPassword_EnterPressed
	' Procesar Enter en campo de contraseña
	btnAccion_Click
End Sub

Sub txtUsuario_EnterPressed
	' Mover foco al campo de contraseña
	txtPassword.RequestFocus
End Sub