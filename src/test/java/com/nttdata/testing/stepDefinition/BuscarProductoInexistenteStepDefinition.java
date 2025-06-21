package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.questions.ValidarMensajeBusquedaFallida;
import com.nttdata.testing.Tasks.BuscarProductoInexistenteTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class BuscarProductoInexistenteStepDefinition {

    @Dado("que el usuario está en la página principal")
    public void que_el_usuario_esta_en_la_pagina_principal() {
        // si tienes navegación a la página, agrégala aquí
    }

    @Cuando("busca el producto {string}")
    public void busca_el_producto(String producto) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(BuscarProductoInexistenteTask.conNombre(producto));
    }

    @Entonces("debería ver un mensaje que indique que no se encontraron resultados")
    public void deberia_ver_mensaje_sin_resultados() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(seeThat(
                "Mensaje sin resultados visible",
                ValidarMensajeBusquedaFallida.esVisible(),
                is(true)
        ));
    }
}
