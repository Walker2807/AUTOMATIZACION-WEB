package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.MenClothesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAlCarritoYComprarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenClothesPage.ICONO_CARRITO),
                WaitUntil.the(MenClothesPage.BOTON_IR_AL_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MenClothesPage.BOTON_IR_AL_CARRITO)
        );
    }

    public static IrAlCarritoYComprarTask ejecutar() {
        return instrumented(IrAlCarritoYComprarTask.class);
    }
}

