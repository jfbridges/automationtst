#language: es

@List
Característica:Buscar y seleccionar elemento de la lista
  Yo como QA,
  deseo validar que puede seleccionar una opcion de la lista

  @LST1
  Escenario: Validar que el usuario pueda ver y seleccionar un elemento de la lista
    Dado  EL usuario UsuarioActual abre la aplicacion the app
    Cuando    El usuario ingresa a la opcion list demo
    Cuando    Busca la opcion de la lista
    Cuando    selecciona una opcion valida de la lista
    Entonces  se valida el mensaje de la opcion seleccionada
    Entonces  podra seleccionar la opcion OK
    Cuando    selecciona una opcion valida de la lista
    Entonces  podra cancelar la opcion seleccionada
    Cuando    selecciona una opcion valida de la lista
    Cuando    selecciona el boton mas informacion
    Entonces  podra ver la pantalla con informacion mas detallada