package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenClothesPage extends PageObject {

    // Producto específico (Jackshirt)
    public static final Target PRODUCTO_JACKSHIRT = Target.the("Primer producto de la lista de Jackets")
            .located(By.xpath("(//a[@class='product-item-link'])[1]"));

    // Selección de talla
    public static final Target TALLA_L = Target.the("Talla L")
            .located(By.xpath("//div[@option-label='L']"));

    // Selección de color
    public static final Target COLOR_BLUE = Target.the("Color Blue")
            .located(By.xpath("//div[@option-label='Blue']"));

    // Campo de cantidad
    public static final Target INPUT_CANTIDAD = Target.the("Campo de cantidad")
            .located(By.id("qty"));

    // Botón para agregar al carrito
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Botón Add to Cart")
            .located(By.xpath("//button[@title='Add to Cart']"));

    public static final Target ICONO_CARRITO = Target.the("Ícono del carrito")
            .located(By.cssSelector("a.action.showcart"));

    public static final Target BOTON_IR_AL_CARRITO = Target.the("Botón para ver el carrito")
            .located(By.cssSelector("a.action.viewcart"));

    public static final Target BOTON_PROCEDER_COMPRA = Target.the("Botón Proceed to Checkout")
            .located(By.cssSelector("button.action.primary.checkout"));


}


