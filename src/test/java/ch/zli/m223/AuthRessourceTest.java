package ch.zli.m223;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.gradle.internal.impldep.javax.annotation.meta.When;

/* 
 * @author Andelo Batinic
 * @version 28.09 2022
 * Test for auth
*/

@QuarkusTest
public class AuthRessourceTest {

    @Test
    public void testPostLogin() {
        given()
            .contentType(ContentType.JSON)
            .when()
                .post("http://localhost:8080/login?email=and%40bat.com&password=and")
            .then()
            .statusCode(404);
    }

    @Test
    public void testPostRegister() {
        given()
        .body("{\"vorname\":\"andelo\",\"nachname\":\"batinic\", \"email\":\"andelo@gmail.com\", \"password\":\"123kk\"}")
        .contentType(ContentType.JSON)
        .when()
            .post("http://localhost:8080/auth/register")
            .then()
            .statusCode(200);
    }
}
