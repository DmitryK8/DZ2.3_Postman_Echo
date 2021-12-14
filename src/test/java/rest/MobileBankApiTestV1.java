package rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class MobileBankApiTestV1 {
    void shouldPostmanEcho() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .header("Content-Length", String.valueOf(424))
                .body("data", equalTo("some data"));

    }
}
