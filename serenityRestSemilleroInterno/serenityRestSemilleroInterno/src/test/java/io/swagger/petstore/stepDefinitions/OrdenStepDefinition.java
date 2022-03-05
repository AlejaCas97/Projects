package io.swagger.petstore.stepDefinitions;


import cucumber.api.java.es.*;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class OrdenStepDefinition {

    @Steps
    PetstoreSteps petstoreSteps = new PetstoreSteps();

    /*No es necesario el metodo Dado o Given, porque para automatizar servicios
     *no se requiere levantar un navegador web
     */

    @Cuando("^creo y consulto una orden$")
    public void creoYConsultoUnaOrden() {
        petstoreSteps.consultarOrden9();
        petstoreSteps.eliminarOrden9();
        petstoreSteps.consultarOrden9();
        petstoreSteps.crearOrden7();
        petstoreSteps.consultarOrden7();

    }

    @Entonces("^luego la elimino$")
    public void luegoLaElimino() {

    }


}
