package io.swagger.petstore.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker = new Faker(new Locale("en-US"));

    private String urlStorePost, urlPet, urlUser, urlStoreGetDelete7, urlStoreGetDelete9;
    private String bodyPet, bodyOrder9,bodyOrder7, bodyUser, headers;

    //Pet
    private String urlPetPost, urlPetGetDelete, urlUserGet, urlUserDelete;

    private final int STATUSCODE;

    //url de consumos: https://petstore.swagger.io/#/
    public DataInyection() {
        this.urlStorePost = "https://petstore.swagger.io/v2/store/order";
        this.urlStoreGetDelete7 = "https://petstore.swagger.io/v2/store/order/7";
        this.urlStoreGetDelete9 = "https://petstore.swagger.io/v2/store/order/9";
        this.headers = "application/json";
        this.bodyOrder9 = "{\n" +
                "  \"id\": 9,\n" +
                "  \"petId\": 9,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";
        this.bodyOrder7= "{\n" +
                "  \"id\": 4,\n" +
                "  \"petId\": 4,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";


        this.urlPetPost = "https://petstore.swagger.io/v2/pet";
        this.urlPetGetDelete = "https://petstore.swagger.io/v2/pet/1";
        this.bodyPet = "{\n" +
                "\"id\": 1,\n" +
                "\"category\": {\n" +
                "\"id\": 1,\n\" +\n" +
                "\"name\": \"golden\",\n" +
                "\"}\",+\n" +
                "\"name\": \"peppa\",\n" +
                "\"photoUrls\": [\n" +
                "\"string\" \n" +
                "\"]\" ,\n" +
                "\"tags\": [\n" +
                "\"{\",+\n" +
                "\"id\": 2,\n\" +\n" +
                "\"name\": \"olaf\",\n" +
                "\"}\" +\n" +
                "\"]\",+\n" +
                "\"status\": \"available\",\n" +
                "\"}" ;

        this.urlUser = "https://petstore.swagger.io/v2/user";
        this.urlUserGet = "https://petstore.swagger.io/v2/user/login?username=paramirez&password=Paula123";
        this.urlUserDelete = "https://petstore.swagger.io/v2/user/paramirez";
        this.bodyUser = "{\n" +
                "  \"id\": 1,\n" +
                "  \"username\": \"paramirez\",\n" +
                "  \"firstName\": \"Paula\",\n" +
                "  \"lastName\": \"Ramirez\",\n" +
                "  \"email\": \"pramirez@gmail.com\",\n" +
                "  \"password\": \"Paula123\",\n" +
                "  \"phone\": \"3124663712\",\n" +
                "  \"userStatus\": 2,\n" +
                "}";

        this.STATUSCODE = 200;
    }

    public String getUrlPet() {
        return urlPet;
    }

    public String getUrlUser() {
        return urlUser;
    }

    public String getUrlStorePost() {
        return urlStorePost;
    }

    public String getUrlStoreGetDelete7() {
        return urlStoreGetDelete7;
    }

    public String getUrlStoreGetDelete9() {
        return urlStoreGetDelete9;
    }

    public String getBodyOrder9() {
        return bodyOrder9;
    }

    public String getBodyOrder7() {
        return bodyOrder7;
    }

    public String getHeaders() {
        return headers;
    }

    public String getBodyPet() {
        return bodyPet;
    }


    public String getBodyUser() {
        return bodyUser;
    }

    public int getSTATUSCODE() {
        return STATUSCODE;
    }

    public String getUrlPetPost() {
        return urlPetPost;
    }

    public String getUrlPetGetDelete() {
        return urlPetGetDelete;
    }

    public String getUrlUserGet() {
        return urlUserGet;
    }

    public String getUrlUserDelete() {
        return urlUserDelete;
    }
}
