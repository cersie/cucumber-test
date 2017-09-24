import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import org.junit.Before;

public class APITest {

    @Before
    public void setupBase() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void verifyEndPointIsWorking() {
        given().when().get("/api/users").then().statusCode(200);
    }

    @Test
    public void verifyListUsers() {
        given().
        when().
            get("/api/users").
        then().
            body("page", equalTo(1)).
            body("data.id", hasItems(1,2,3)).
            statusCode(200);
    }
}
  