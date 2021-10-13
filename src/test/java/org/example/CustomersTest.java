package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.example.AppConstants.BASE_URL;
import static org.testng.Assert.assertEquals;

public class CustomersTest {

    private String customerId;




//    @Test(priority = 0)
//    public void shouldPostCustomerTest() {
//        List<Address> addresses = new ArrayList<>();
//        Address address = new Address("a1", "city", "province", "phone", "zip", "lastName",
//                "firstName", "Poland");
//        addresses.add(address);
//        PostCustomer customer = new PostCustomer("Anna", "Grzywa", "qwe@as.pl", "258963214",
//                true, addresses);
//
//        PostCustomerRequest postCustomerRequest = new PostCustomerRequest(customer);
//
//        given().contentType(ContentType.JSON)
//                .body(postCustomerRequest)
//                .when()
//                .post(BASE_URL + "/admin/api/2021-04/customers.json")
//                .prettyPrint();
//    }

    @Test(priority = 1)
    public void shouldGetAllCustomers() {
        GetCustomersResponse response = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/customers.json")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(GetCustomersResponse.class);


        System.out.println(response.getCustomers().size());
        assertEquals(response.getCustomers().size(), 1);
        assertEquals(response.getCustomers().get(0).getEmail(), "klint.istlud7+shopify2_anna_grzywa@gmail.com");
        customerId = response.getCustomers().get(0).getId();
        System.out.println(customerId);
    }

    @Test(priority = 2)
    public void shouldCreateActivationUrl() {
        Response response = given().contentType(ContentType.JSON)
                .when()
                .post(BASE_URL + "/admin/api/2021-04/customers/" + customerId + "/account_activation_url.json");
        response.prettyPrint();

        AccountActivationUrlResponse urlResponse = response
                .then()
                .extract().as(AccountActivationUrlResponse.class);

        System.out.println(urlResponse.getAccount_activation_url());
    }

    @Test(priority = 3)
    public void shouldSendInvitationOnEmail() {
        given().contentType(ContentType.JSON)
                .when()
                .post(BASE_URL + "/admin/api/2021-04/customers/" + customerId + "/send_invite.json")
                .prettyPrint();
    }

}
