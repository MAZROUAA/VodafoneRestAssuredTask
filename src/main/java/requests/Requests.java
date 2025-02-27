package requests;

import helpers.Helpers;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import requestModels.CreateAuthRequest;
import requestModels.createBookRequest.BookingDatesRequest;
import requestModels.createBookRequest.CreateBookRequest;

import java.io.IOException;

public class Requests {

    public  static Response CreateAuthReq(String username, String password) throws IOException {
        CreateAuthRequest CreateAuthreq =new CreateAuthRequest();
        CreateAuthreq.username=username;
        CreateAuthreq.password=password;
        Helpers HelperObj=new Helpers("src/main/resources/CreateAuthData.json");

        Response CreateAuthRes = RestAssured.given().log().all().contentType("application/json")
                .body(CreateAuthreq).post(HelperObj.getValue("url"));

        return CreateAuthRes;
    }

    public  static Response CreateBookReq(String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) throws IOException {
        CreateBookRequest CreateBookreq =new CreateBookRequest();
        BookingDatesRequest BookingDatesreq =new BookingDatesRequest();


        CreateBookreq.setFirstname(firstname);
        CreateBookreq.setLastname(lastname);
        CreateBookreq.setTotalprice(totalprice);
        CreateBookreq.setDepositpaid(depositpaid);

        BookingDatesreq.setCheckin(checkin);
        BookingDatesreq.setCheckout(checkout);
        CreateBookreq.setBookingdates(BookingDatesreq);
        CreateBookreq.setAdditionalneeds(additionalneeds);

        Helpers HelperObj=new Helpers("src/main/resources/CreateBookRequestData.json");

        Response CreatBookRes = RestAssured.given().log().all().contentType("application/json")
                .body(CreateBookreq).post(HelperObj.getValue("url"));

        return CreatBookRes;
    }
}
