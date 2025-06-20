package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.MenClothesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProductoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MenClothesPage.PRODUCTO_JACKSHIRT, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(MenClothesPage.PRODUCTO_JACKSHIRT),
                Click.on(MenClothesPage.PRODUCTO_JACKSHIRT)
        );
    }

    public static SeleccionarProductoTask ejecutar() {
        return instrumented(SeleccionarProductoTask.class);
    }
}
