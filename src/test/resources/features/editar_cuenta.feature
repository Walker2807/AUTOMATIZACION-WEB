@editarCuenta
Feature: Edición de información de cuenta

  Scenario: Editar nombre y apellido del usuario
    Given el usuario ha iniciado sesión
    When el usuario edita su nombre a "Carlos" y apellido a "Ramírez"
    Then debería ver un mensaje de confirmación
