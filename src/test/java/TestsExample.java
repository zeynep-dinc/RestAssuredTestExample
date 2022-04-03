

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsExample {

    @Test
    public void test1(){
        Response response=get("https://reqres.in/api/users?page=2");

        System.out.println("Status Code:\t"+response.getStatusCode());
        System.out.println("Pretty getBody:\t"+response.getBody().asString());
        System.out.println("getStatus line:\t"+response.getStatusLine());
        System.out.println("Header content-type:\t"+response.getHeader("content-type"));
        System.out.println("ResponseTime:\t"+response.getTime());


        Assert.assertEquals(response.statusCode(),200);
        //        System.out.println(RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").asPrettyString());
    }

    @Test
    public void test2(){
        baseURI="https://reqres.in/api/";
      //  given().get("users?page=2").then().statusCode(200).body("id[1]",equals("") )
    }
}
