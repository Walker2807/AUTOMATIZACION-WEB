package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.SearchPage;
import com.nttdata.testing.Tasks.BuscarProductoInexistenteTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProductoInexistenteTask implements Task {

    private final String nombreProducto;

    public BuscarProductoInexistenteTask(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreProducto).into(SearchPage.INPUT_BUSQUEDA),
                Click.on(SearchPage.BOTON_BUSCAR)
        );
    }

    public static BuscarProductoInexistenteTask conNombre(String nombre) {
        return instrumented(BuscarProductoInexistenteTask.class, nombre);
    }
}
