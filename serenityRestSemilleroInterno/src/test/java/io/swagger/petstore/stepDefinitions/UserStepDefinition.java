package io.swagger.petstore.stepDefinitions;


import cucumber.api.java.es.*;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinition {

    @Steps
    PetstoreSteps petstoreSteps = new PetstoreSteps();

    /*No es necesario el metodo Dado o Given, porque para automatizar servicios
     *no se requiere levantar un navegador web
     */

    @Cuando("^creo y consulto un usuario$")
    public void creoYConsultoUnaOrden() {
        petstoreSteps.consultarUsuario();
        petstoreSteps.crearMascota();
        petstoreSteps.eliminarUsuario();
        petstoreSteps.consultarUsuario();

    }

    @Entonces("^luego elimino$")
    public void luegoElimino() {

    }


}
