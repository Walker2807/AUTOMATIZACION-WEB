package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarCompraTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPage.PLACE_ORDER, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(CheckoutPage.PLACE_ORDER)
        );
    }

    public static RealizarCompraTask ejecutar() {
        return instrumented(RealizarCompraTask.class);
    }
}
