#Author: DiegoCarvajal
  #Language: en

Feature: Consultar la pagina principal de la U de A
  Como estudiante de la U de A necesito buscar la homepage de la U en el motor de busqueda de Google
  para ingresar desde el link al sitio oficial

  Scenario: Buscar la pagina oficial de la U de A en el motor de Google
    Given que me encuentro en la pagina principal de google
    When escribe la palabra U de A
    Then puedo ver el link de la pagina oficial de la U de A