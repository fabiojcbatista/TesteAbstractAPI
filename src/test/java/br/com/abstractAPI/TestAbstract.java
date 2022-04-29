package br.com.abstractAPI;
import org.junit.Test;
import io.restassured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Assert;
import static io.restassured.RestAssured.given;


public class TestAbstract {
    @Test
    public void dadaoAbrstractAPI_QuandoPassarAChavaEIP_entaoDeveRetornarStatus200(){
        given()
          .log()
          .all()
          .headers("api_key","41576a6b39544ee5b372fefc67fe6a8e")
        .when()
          .get("https://ipgeolocation.abstractapi.com/v1/?api_key=41576a6b39544ee5b372fefc67fe6a8e&ip_address =166.171.248.255")
        .then()
          .log()
          .body()
          .statusCode(200);
    }
    
}
