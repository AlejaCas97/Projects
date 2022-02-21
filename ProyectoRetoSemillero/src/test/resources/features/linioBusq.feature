#language: en
Feature: Busqueda exitosa de tres productos y validar el último

  Scenario: Buscar en linio
    Given  que me encuentro en el buscador de linio
    When hace la busqueda de los 3 productos
    Then valida el ultimo producto
