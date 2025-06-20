package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarJacketsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(HomePage.MENU_MEN),
                MoveMouse.to(HomePage.MENU_TOPS),
                Click.on(HomePage.MENU_JACKETS)
        );
    }

    public static SeleccionarJacketsTask ejecutar() {
        return instrumented(SeleccionarJacketsTask.class);
    }
}
