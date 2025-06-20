@NavegarJackets
Feature: Navegar al listado de Jackets para hombre

  Como usuario registrado
  Quiero poder acceder a la categoría de Jackets desde el menú de navegación
  Para poder ver las opciones disponibles de chaquetas para hombre

  Scenario: Usuario navega al listado de jackets
    Given el usuario inicia sesion con email "abc12344@hotmail.com" y contrasenia "Password123&"
    And selecciona la opcion Jackets en el menu de hombre
    And selecciona un producto de la lista de Jackets
    And selecciona talla, color, cantidad "2" y agrega al carrito
    Then se muestra la página del producto con el botón para agregar al carrito
    And ir al carrito y proceder a comprar
    And llenar los datos del formulario de compra
    And click en Place Order para realizar la compra
    Then validar que se haya efectuado la compra

