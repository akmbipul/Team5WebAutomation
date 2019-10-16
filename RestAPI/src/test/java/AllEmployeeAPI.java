import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AllEmployeeAPI {


public String baseUrl= "http://info.venturepulse.org:8080/service-webapp";


    @Test
    public void callAllEmployeeResources() {
        Response response = given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

}
