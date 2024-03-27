#language: es

  @Login
  Característica:Login
    Yo como QA,
    deseo validar el login de la app the app con un usuario valido y no valido

  @LG1
  Escenario: Validar acceso de un usuario no autorizado en el app the app
    Dado  EL usuario UsuarioActual abre la aplicacion the app
    Cuando  El usuario ingresa a la opcion login
    Cuando Diligencia los campos usuario y password
   Entonces  Es validado como usuario no autorizado



