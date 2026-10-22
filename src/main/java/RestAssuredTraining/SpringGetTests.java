package RestAssuredTraining;
import static io.restassured.RestAssured.*;

public class SpringGetTests {
    public static void main(String[] args) {
        for (int i = 0; i < 90; i++) {
        given().baseUri("http://localhost:8080")
                .when()
                .get("/hello?name=Roman&age=" + i)
                .then()
                .log().body()
                .statusCode(200);
    }
    }
}
