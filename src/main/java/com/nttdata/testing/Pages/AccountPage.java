package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountPage extends PageObject {

    public static final Target LBL_MY_ACCOUNT = Target.the("Boton crear usuario")
            .located(By.xpath("//span[text()='My Account']"));

    public static final Target FIRST_NAME_FIELD = Target.the("campo de nombre")
            .located(By.id("firstname"));

    public static final Target LAST_NAME_FIELD = Target.the("campo de apellido")
            .located(By.id("lastname"));

    public static final Target SAVE_BUTTON = Target.the("botón de guardar cambios")
            .located(By.cssSelector("button[title='Save']"));

}
