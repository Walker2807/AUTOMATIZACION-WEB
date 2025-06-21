package com.nttdata.testing.questions;

import com.nttdata.testing.Pages.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMensajeBusquedaFallida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SearchPage.MENSAJE_NO_RESULTADOS.resolveFor(actor).isVisible();
    }

    public static ValidarMensajeBusquedaFallida esVisible() {
        return new ValidarMensajeBusquedaFallida();
    }
}
