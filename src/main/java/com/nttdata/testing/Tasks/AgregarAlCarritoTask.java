package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.MenClothesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarritoTask implements Task {

    private final String cantidad;

    public AgregarAlCarritoTask(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenClothesPage.TALLA_L),
                Click.on(MenClothesPage.COLOR_BLUE),
                Enter.theValue(cantidad).into(MenClothesPage.INPUT_CANTIDAD),
                Click.on(MenClothesPage.BOTON_AGREGAR_CARRITO)
        );
    }

    public static AgregarAlCarritoTask conCantidad(String cantidad) {
        return instrumented(AgregarAlCarritoTask.class, cantidad);
    }
}
