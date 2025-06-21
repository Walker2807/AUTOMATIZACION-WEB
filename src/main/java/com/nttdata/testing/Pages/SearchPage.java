package com.nttdata.testing.Pages;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SearchPage {

    public static final Target INPUT_BUSQUEDA = Target.the("Caja de búsqueda")
            .located(By.id("search"));

    public static final Target BOTON_BUSCAR = Target.the("Botón de búsqueda")
            .located(By.cssSelector("button.action.search"));

    public static final Target MENSAJE_NO_RESULTADOS = Target.the("Mensaje sin resultados")
            .located(By.cssSelector(".message.notice"));
}
