import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class testswager {

    @Test
    public void test_pet(){
        baseURI="https://petstore.swagger.io/v2/store/";
        Response response=get("inventory");
        System.out.println(response.getStatusCode());
        response.prettyPrint();
//        String id=response.body().path("id[1]").toString();
//        get(id).prettyPrint();
    }
}
