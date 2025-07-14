#Author: DiegoCarvajal
  #Language: en

Feature: Realizar el registro de nuevo usuario en la pagina de CitaSalud
  Como paciente de CitaSalud necesito ingresar mis datos personales
  para quedar registrado en el sistema de citas oficial de CitaSalud

  Scenario: Realizar registro con datos correctas
    Given que estoy en la pagina principal de CitaSalud
    When ingreso los datos correctos
    Then se crea un nuevo usuario

  Scenario: Realizar registro con usuario ya creado
    Given que me encuentro en la pagina principal de CitaSalud
    When ingreso los datos de un usuario existente
    Then veo una alerta indicando que error hay

  Scenario: Realizar registro con datos faltantes
    Given que me encuentro en la pagina principal de CitaSalud
    When no ingreso todos los datos solicitados
    Then veo una alerta indicando que faltan llenarlos