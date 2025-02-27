import helpers.Helpers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import responseModels.CreateAuthResponse;

import java.io.IOException;

public class CreateAuthTest {


    @Test
    public void AuthCreationtest() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        Helpers helperObj = new Helpers("src/main/resources/CreateAuthData.json");
        Response CreateAuthres = requests.Requests.CreateAuthReq(helperObj.getValue("username"), helperObj.getValue("password"));

        CreateAuthResponse CreateAuthresObj= CreateAuthres.as(CreateAuthResponse.class);

        softAssert.assertNotNull(CreateAuthres);

        softAssert.assertEquals(CreateAuthres.statusCode(),200);
        softAssert.assertAll();
        System.out.println(CreateAuthresObj.token);


    }


}
