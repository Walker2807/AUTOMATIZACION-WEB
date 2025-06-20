package com.nttdata.testing.Pages;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class CheckoutPage {

    // Solo los elementos realmente necesarios para usuarios logueados

    public static final Target SHIPPING_METHOD = Target.the("Shipping Method $5.00")
            .located(By.xpath("//input[@value='flatrate_flatrate']"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.cssSelector("button.continue"));

    public static final Target PLACE_ORDER = Target.the("Place Order button")
            .located(By.cssSelector("button.action.primary.checkout"));

    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message")
            .located(By.cssSelector(".checkout-success p"));
}

