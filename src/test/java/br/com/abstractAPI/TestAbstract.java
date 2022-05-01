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
        .when()
          .get("https://ipgeolocation.abstractapi.com/v1/?api_key=41576a6b39544ee5b372fefc67fe6a8e&ip_address =166.171.248.255")
        .then()
          .log()
          .body()
          .statusCode(200);
    }
    
    @Test
    public void dadaoAbrstractAPI_QuandoPassarAChavaEIP_entaoDeveRetornarStatus200ComCorpo(){
        given()
          .log()
          .all()
        .when()
          .get("https://ipgeolocation.abstractapi.com/v1/?api_key=41576a6b39544ee5b372fefc67fe6a8e&ip_address =166.171.248.255&fields=country,region,city")
        .then()
          .log()
          .body()
          .statusCode(200);
    }

    @Test
    public void dadaoAbrstractAPI_QuandoPassarAChaveAPIFeriadosEmDataEspecifica_entaoDeveRetornarStatus200(){
        given()
          .log()
          .all()
        .when()
          .get("https://holidays.abstractapi.com/v1/?api_key=712579858aaa4271a644b974f6b91dbe&country=BR&year=2022&month=01&day=01")
        .then()
          .log()
          .body()
          .statusCode(200);
    }

     //@Test Precisa assinar para buscar mes ou ano
    public void dadaoAbrstractAPI_QuandoPassarAChaveAPIFeriadosEmMesEspecifico_entaoDeveRetornarStatus200(){
        given()
          .log()
          .all()
        .when()
          .get("https://holidays.abstractapi.com/v1/?api_key=712579858aaa4271a644b974f6b91dbe&country=BR&year=2022&month=01")
        .then()
          .log()
          .body()
          .statusCode(200);
    }

    //@Test Precisa assinar para buscar mes ou ano
    public void dadaoAbrstractAPI_QuandoPassarAChaveAPIFeriadosEmAnoEspecifico_entaoDeveRetornarStatus200(){
        given()
          .log()
          .all()
        .when()
          .get("https://holidays.abstractapi.com/v1/?api_key=712579858aaa4271a644b974f6b91dbe&country=BR&year=2022")
        .then()
          .log()
          .body()
          .statusCode(200);
    }
   
    @Test
    public void dadaoAbrstractAPI_QuandoPassarAChaveAPIConversao_entaoDeveRetornarStatus200(){
      given()
        .log()
        .all()
      .when()
        .get("https://exchange-rates.abstractapi.com/v1/live?api_key=4a689e048d7248aa8223823fe21ac181&base=USD")
      .then()
        .log()
        .body()
        .statusCode(200);
  }

  @Test
  public void dadaoAbrstractAPI_QuandoPassarAChaveAPIConversaoParaEuroReal_entaoDeveRetornarStatus200(){
    given()
      .log()
      .all()
    .when()
      .get("https://exchange-rates.abstractapi.com/v1/live?api_key=4a689e048d7248aa8223823fe21ac181&base=USD&target=EUR,BRL")
    .then()
      .log()
      .body()
      .statusCode(200);
}


@Test
  public void dadaoAbrstractAPI_QuandoPassarAChaveAPICompany_entaoDeveRetornarStatus200(){
    given()
      .log()
      .all()
    .when()
      .get("https://companyenrichment.abstractapi.com/v1/?api_key=2fc02022d26845ea9253d59a46713591&domain=airbnb.com")
    .then()
      .log()
      .body()
      .statusCode(200);
}


@Test
  public void dadaoAbrstractAPI_QuandoPassarAChaveAPITimezone_entaoDeveRetornarStatus200(){
    given()
      .log()
      .all()
    .when()
      .get("https://timezone.abstractapi.com/v1/current_time?api_key=119056bcc8914a33bdcd7896152aef20&location=Brasilia")
    .then()
      .log()
      .body()
      .statusCode(200);
}

//Erro @Test
  public void dadaoAbrstractAPI_QuandoPassarAChaveAPIAvatar_entaoDeveRetornarStatus200(){
    given()
      .log()
      .all()
    .when()
      .get("https://avatars.abstractapi.com/v1/?apikey=dfb29de9cac7463d8543784d3a64165b&image_size=200&image_format=png&char_limit=2&background_color=335eea&font_color=ffffff&is_rounded=false"+
      "&is_uppercase=true"+
      "&is_italic=false"+
      "&is_bold=false")
    .then()
      .log()
      .body()
      .statusCode(200);
}

@Test
public void dadaoAbrstractAPI_QuandoPassarAChaveAPIScreen_entaoDeveRetornarStatus200(){
  given()
    .log()
    .all()
  .when()
    .get("https://screenshot.abstractapi.com/v1/"+
    "?api_key=13273f691d6f488881fb5e713438d40c"+
    "&url=https://www.ft.com")
  .then()
    .log()
    .body()
    .statusCode(200);
}

@Test
public void dadaoAbrstractAPI_QuandoPassarAChaveAPIScrap_entaoDeveRetornarStatus200(){
  given()
    .log()
    .all()
  .when()
    .get("https://scrape.abstractapi.com/v1/"+
    "?api_key=ed4c484a3f474b5d82fab425a14ca370"+
    "&url=https://www.apple.com")
  .then()
    .log()
    .body()
    .statusCode(200);
}



}
