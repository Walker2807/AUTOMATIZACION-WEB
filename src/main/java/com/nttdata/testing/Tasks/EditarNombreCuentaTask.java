package com.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.nttdata.testing.Pages.AccountPage.*;


public class EditarNombreCuentaTask implements Task {

    private final String nuevoNombre;
    private final String nuevoApellido;

    public EditarNombreCuentaTask(String nuevoNombre, String nuevoApellido) {
        this.nuevoNombre = nuevoNombre;
        this.nuevoApellido = nuevoApellido;
    }

    public static EditarNombreCuentaTask conDatos(String nombre, String apellido) {
        return instrumented(EditarNombreCuentaTask.class, nombre, apellido);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FIRST_NAME_FIELD),
                Enter.theValue(nuevoNombre).into(FIRST_NAME_FIELD),
                Clear.field(LAST_NAME_FIELD),
                Enter.theValue(nuevoApellido).into(LAST_NAME_FIELD),
                Click.on(SAVE_BUTTON)
        );
    }
}
