import helpers.Helpers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import requestModels.createBookRequest.CreateBookRequest;
import responseModels.CreateAuthResponse;
import responseModels.createBookResponse.CreateBookResponse;

import java.io.IOException;

public class CreateBookTest {

    @Test
    public void BookCreationtest() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        Helpers helperObj = new Helpers("src/main/resources/CreateBookRequestData.json");
        Response CreateBookres = requests.Requests.CreateBookReq(helperObj.getValue("firstname"), helperObj.getValue("lastname"),
                Integer.parseInt(helperObj.getValue("totalprice")), Boolean.parseBoolean(helperObj.getValue("depositpaid")),
                helperObj.getValue("checkin"), helperObj.getValue("checkout"), helperObj.getValue("additionalneeds"));

        CreateBookResponse CreateBookresObj= CreateBookres.as(CreateBookResponse.class);


        softAssert.assertEquals(CreateBookres.statusCode(),200);

        softAssert.assertNotNull(CreateBookresObj.getBookingid());
        softAssert.assertEquals(CreateBookresObj.getBooking().getFirstname(),"Jim");
        softAssert.assertEquals(CreateBookresObj.getBooking().getLastname(),"Brown");
        softAssert.assertEquals(CreateBookresObj.getBooking().getTotalprice().toString(),"111");
        softAssert.assertEquals(CreateBookresObj.getBooking().getDepositpaid().toString(),"true");
        softAssert.assertEquals(CreateBookresObj.getBooking().getBookingdates().getCheckin(),"2018-01-01");
        softAssert.assertEquals(CreateBookresObj.getBooking().getBookingdates().getCheckout(),"2019-01-01");
        softAssert.assertEquals(CreateBookresObj.getBooking().getAdditionalneeds(),"Breakfast");

        softAssert.assertAll();





    }
}
