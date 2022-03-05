package io.swagger.petstore.steps;

import io.restassured.RestAssured;
import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearOrden7(){
        SerenityRest.given().baseUri(dataInyection.getUrlStorePost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarOrden9(){
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void consultarOrden7(){
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete7()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarOrden9() {
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    //Pet
    @Step
    public void crearMascota() {
        SerenityRest.given().baseUri(dataInyection.getUrlPetPost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPet()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    //User
    public void crearUsuario() {
        SerenityRest.given().baseUri(dataInyection.getUrlUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUser()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    public void consultarUsuario() {
        SerenityRest.given().baseUri(dataInyection.getUrlUserGet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUser()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    public void eliminarUsuario() {
        SerenityRest.given().baseUri(dataInyection.getUrlUserDelete()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUser()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
}
