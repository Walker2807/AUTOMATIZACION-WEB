package com.nttdata.testing.stepDefinition;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import com.nttdata.testing.Tasks.EditarNombreCuentaTask;

public class EditarCuentaStepDefinition {

    @When("el usuario edita su nombre a {string} y apellido a {string}")
    public void editarNombreApellido(String nombre, String apellido) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditarNombreCuentaTask.conDatos(nombre, apellido)
        );
    }
}
