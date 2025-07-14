#Author: DiegoCarvajal
  #Language: en

Feature: Realizar el inicio de sesion en la pagina de CitaSalud
  Como paciente de CitaSalud necesito ingresar mis credenciales
  para acceder al sistema de citas oficial de CitaSalud

  Scenario: Realizar inicio de sesion con credenciales correctas
    Given que me encuentro en la pagina principal de CitaSalud
    When ingreso las credenciales correctas
    Then puedo ver el registro de mis actividades como usuario

  Scenario: Realizar inicio de sesion sin alguna credencial
    Given que me encuentro en la pagina principal de CitaSalud
    When ingreso solo una de las credenciales
    Then puedo ver alerta pidiendo que use todos los campos

  Scenario: Realizar inicio de sesion con credenciales incorrectas
    Given que me encuentro en la pagina principal de CitaSalud
    When ingreso las credenciales incorrectas
    Then puedo ver alerta indicando que los datos son incorrectos