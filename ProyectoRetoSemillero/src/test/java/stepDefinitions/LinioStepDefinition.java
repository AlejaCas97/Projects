package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageObjects.LinioPages;
import steps.LinioStep;

import java.awt.*;

public class LinioStepDefinition {

    @Steps
    LinioStep step = new LinioStep();

    @Given("^que me encuentro en el buscador de linio$")
    public void queMeEncuentroEnElBuscadorDeLinio() { SeleniumWebDriver.chromeDrive("https://www.linio.com.co/"); }

    @When("^hace la busqueda de los 3 productos$")
    public void haceLaBusquedaDeLos3Productos() throws AWTException {
        step.esperarYCerrarAnuncios();
        step.buscar();
        step.seleccionarPrimerProducto();
        step.seleecionarSegundoProducto();
        step.BuscarYValidarTercerProducto();
    }

    @Then("^valida el ultimo producto$")
    public void validaElUltimoProducto() {
        step.validar(LinioPages.getLblProducto(),"HP 15.6 AMD Ryzen 5 8GB RAM 256GB SSD HS:8471300000");
        step.validar(LinioPages.getLblValorProducto(),"$2.236.990");
    }
}
