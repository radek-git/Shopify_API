package org.example;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.example.discounts.post.CreateDiscountCode;
import org.example.discounts.post.CreateDiscountCodeRequest;
import org.example.discounts.post.CreateDiscountCodeResponse;
import org.example.discounts.put.DiscountCodeToBeUpdated;
import org.example.discounts.put.UpdateDiscountCodeRequest;
import org.example.discounts.put.UpdateDiscountCodeResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.example.AppConstants.BASE_URL;

public class CreateDiscountCodeTest {


    private String id;


    @Test(priority = 0)
    public void shouldCreateDiscountCode() {
        CreateDiscountCodeResponse response = given().contentType(ContentType.JSON)
                .body(new CreateDiscountCodeRequest(new CreateDiscountCode("11223")))
                .when()
                .post(BASE_URL + "/admin/api/2021-04/price_rules/933451268252/discount_codes.json")
                .then()
                .extract().as(CreateDiscountCodeResponse.class);
//

        assert response.getDiscount_code().code.equals("11223");
//        System.out.println(response.getDiscount_code().getCode());

        id = response.getDiscount_code().getId();
    }



//    @Test
//    public void shouldGetAllCodesByPriceRuleId() {
//        DiscountCodesResponse response = given().contentType(ContentType.JSON)
//                .when()
//                .get(BASE_URL + "/admin/api/2021-04/price_rules/933451268252/discount_codes.json")
//                .then()
//                .statusCode(HttpStatus.SC_OK)
//                .and()
//                .extract().as(DiscountCodesResponse.class);
//
//        assertTrue(response.getDiscount_codes().stream().anyMatch(discountCode -> discountCode.getCode().equals("lato2021")));
//        assertTrue(response.getDiscount_codes().stream().anyMatch(discountCode -> discountCode.getCode().equals("DUPA123")));
//        assertTrue(response.getDiscount_codes().stream().anyMatch(discountCode -> discountCode.getCode().equals("DUPA124")));
//        assertTrue(response.getDiscount_codes().stream().anyMatch(discountCode -> discountCode.getCode().equals("DUP124")));
//
//    }


    @Test(priority = 1)
    public void shouldUpdateDiscountCodeByIdAndPriceRuleId() {
        UpdateDiscountCodeRequest updateDiscountCodeRequest = new UpdateDiscountCodeRequest(new DiscountCodeToBeUpdated(id, "1123"));
        given().contentType(ContentType.JSON)
                .body(updateDiscountCodeRequest)
                .when()
                .put(BASE_URL + "/admin/api/2021-04/price_rules/933451268252/discount_codes/" + id + ".json")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract().as(UpdateDiscountCodeResponse.class);
    }


    @Test(priority = 2)
    public void shouldDeleteDiscountCodeByIdAndPriceRuleId() {
        given().contentType(ContentType.JSON)
                .when()
                .delete(BASE_URL + "/admin/api/2021-04/price_rules/933451268252/discount_codes/" + id + ".json")
                .then()
                .statusCode(HttpStatus.SC_NO_CONTENT);
    }


}
