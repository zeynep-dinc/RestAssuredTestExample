import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class PutPatchDeleteRequestExamples {

    @Test
    public void testPut(){
        JSONObject request=new JSONObject();

        request.put("name","Zeynep");
        request.put("job","QA and Test");

        System.out.println(request.toJSONString());

        baseURI="https://reqres.in/api";

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void testPatch(){
        JSONObject request=new JSONObject();

        request.put("name","Zeynep");
        request.put("job","QA and Test");

        System.out.println(request.toJSONString());

        baseURI="https://reqres.in/api";

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("/users/2").
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void testDelete(){
        JSONObject request=new JSONObject();

        request.put("name","Zeynep");
        request.put("job","QA and Test");

        System.out.println(request.toJSONString());

        baseURI="https://reqres.in/api";
        when().
                delete("/users/2").
                then().
                statusCode(204).
                log().all();
    }
}
