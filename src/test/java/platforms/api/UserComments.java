package platforms.api;

import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.Assert;
import static io.restassured.RestAssured.given;
import utils.Utils;

public class UserComments extends Utils {

    private static Logger log = Logger.getLogger(UserComments.class);

    private static String baseUrl = getConfigPropertyValue("./Framework.properties", "baseUrl");

    private static  String userResource = "/users";
    private static  String postsResource = "/posts/";
    private static  String commentsResource = "/comments";
    private static  String usernameProperty = "username";

    public static Response response1,response2;

    public static int id;

    public  static void getUsername(String username){
        System.out.println("url= "+baseUrl);
        response1=   given().queryParam(usernameProperty,username).when().get(baseUrl+userResource);
        System.out.println("results"+  response1.asString());

        try
        {
            id = response1.jsonPath().get("[0].id");
        }
        catch (NullPointerException e)
        {
            Assert.fail("User doesnt exist");
        }
        Assert.assertEquals(username, response1.jsonPath().get("[0].username"));

    }

    public static Response getComments(){

        response2 = given().when().get(baseUrl+postsResource+id+commentsResource);
        System.out.println(response2.asString());

        int arraySize = response2.body().jsonPath().getList("$").size();

        String emailRegX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$";

        for(int i = 0; i < arraySize; i++){
            String email = response2.jsonPath().get("["+i+"].email");
            System.out.println(email + arraySize);
            Assert.assertTrue(email.matches(emailRegX));
        }

        return response2;
   }

}
