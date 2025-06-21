Feature: Búsqueda de productos no existentes
  Como usuario del sitio
  Quiero buscar productos
  Para verificar que el sistema maneje búsquedas sin resultados

  @BuscarProductoInexistente
  Scenario: Buscar un producto que no existe
    Given que el usuario está en la página principal
    When busca el producto "papas mágicas voladoras"
    Then debería ver un mensaje que indique que no se encontraron resultados
