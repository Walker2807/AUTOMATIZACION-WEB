package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.CheckoutPage;
import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Pages.MenClothesPage;
import com.nttdata.testing.Tasks.*;
import com.nttdata.testing.questions.RegisterQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import com.nttdata.testing.Tasks.SeleccionarProductoTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.nttdata.testing.questions.RegisterQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class MenClothesStepDefinition {

    @Given("el {actor} inicia sesion con email {string} y contrasenia {string}")
    public void elUsuarioIniciaSesionConEmailYContrasenia(Actor actor, String email, String contrasenia) {
        actor.attemptsTo(NavigateTo.theHomePage());
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_IN));
        theActorInTheSpotlight().attemptsTo(LoginTask.withData(email, contrasenia));

        //theActorInTheSpotlight().should(seeThat("El mensaje de registro correcto", RegisterQuestion.visibleEn(AccountPage.LBL_MY_ACCOUNT), equalTo("My Account")));
    }
    @And("selecciona la opcion Jackets en el menu de hombre")
    public void seleccionaOpcionJackets() {
        theActorInTheSpotlight().attemptsTo(SeleccionarJacketsTask.ejecutar());
    }

    @And("selecciona un producto de la lista de Jackets")
    public void seleccionaUnProductoDeJackets() {
        theActorInTheSpotlight().attemptsTo(SeleccionarProductoTask.ejecutar());
    }

    @And("selecciona talla, color, cantidad {string} y agrega al carrito")
    public void seleccionaTallaColorCantidadYAgrega(String cantidad) {
        theActorInTheSpotlight().attemptsTo(AgregarAlCarritoTask.conCantidad(cantidad));
    }

    @Then("se muestra la página del producto con el botón para agregar al carrito")
    public void seMuestraPaginaProducto() {
        theActorInTheSpotlight().should(
                seeThat("El botón Add to Cart es visible",
                        RegisterQuestion.visibleEn(MenClothesPage.BOTON_AGREGAR_CARRITO))
        );
    }

    @And("ir al carrito y proceder a comprar")
    public void irAlCarritoYProceder() {
        theActorInTheSpotlight().attemptsTo(IrAlCarritoYComprarTask.ejecutar());
    }

    @And("llenar los datos del formulario de compra")
    public void llenarFormularioCompra() {
        theActorInTheSpotlight().attemptsTo(LlenarFormularioCompraTask.ejecutar());
    }

    @And("click en Place Order para realizar la compra")
    public void realizarCompra() {
        theActorInTheSpotlight().attemptsTo(RealizarCompraTask.ejecutar());
    }

    @Then("validar que se haya efectuado la compra")
    public void validarCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat("Mensaje de confirmación visible",
                        RegisterQuestion.visibleEn(CheckoutPage.CONFIRMATION_MESSAGE))
        );
    }
}
