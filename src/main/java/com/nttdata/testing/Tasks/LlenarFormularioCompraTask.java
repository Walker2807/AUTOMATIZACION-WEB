package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormularioCompraTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.SHIPPING_METHOD),
                Click.on(CheckoutPage.NEXT_BUTTON)
        );
    }

    public static LlenarFormularioCompraTask ejecutar() {
        return instrumented(LlenarFormularioCompraTask.class);
    }
}
