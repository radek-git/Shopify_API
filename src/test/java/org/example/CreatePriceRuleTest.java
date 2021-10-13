package org.example;

import io.restassured.http.ContentType;
import org.example.discounts.post.CreateDiscountCodeResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.example.AppConstants.BASE_URL;

public class CreatePriceRuleTest {


    private String id;

//    @Test
//    public void shouldCreatePriceRule() {
//        CreatePriceRule priceRuleRequest = new CreatePriceRule(
//                "lato2022",
//                "line_item",
//                "all",
//                "across",
//                "fixed_amount",
//                "-15.0",
//                "all",
//                "2021-06-19T17:59:10Z");
//
//        CreatePriceRuleRequest priceRule = new CreatePriceRuleRequest(priceRuleRequest);
//        given().contentType(ContentType.JSON)
//                .body(priceRule)
//                .when()
//                .post(BASE_URL + "/admin/api/2021-04/price_rules.json")
////                .prettyPrint();
//                .then()
//                .statusCode(HttpStatus.SC_CREATED)
//                .and()
//                .extract().as(CreatePriceRuleResponse.class);
//
//
//    }
//
//
//
//
//    @Test
//    public void shouldGetListOfPriceRulesTest() {
//        GetCreatedPriceRulesResponse response = given().contentType(ContentType.JSON)
//                .when()
//                .get(BASE_URL + "/admin/api/2021-04/price_rules.json")
//                .then()
//                .extract().as(GetCreatedPriceRulesResponse.class);
//
//        System.out.println(response.getPrice_rules().size());
//    }

    @Test(priority = 0)
    public void shouldGetListOfPriceRulesLimit4Test() {
        GetCreatedPriceRulesResponse response = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/price_rules.json?limit=4")
                .then()
                .extract().as(GetCreatedPriceRulesResponse.class);

        System.out.println(response.getPrice_rules().size());

        response.getPrice_rules().forEach(createdPriceRule -> System.out.println(createdPriceRule.id));
        System.out.println();

        id = response.getPrice_rules().get(response.getPrice_rules().size() - 1).getId();
        System.out.println(id);
    }


    @Test(priority = 1)
    public void shouldGetElementsOfListSince4thElementTest() {
        GetCreatedPriceRulesResponse response = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/price_rules.json?limit=4&since_id=" + id)
                .then()
                .extract().as(GetCreatedPriceRulesResponse.class);

        System.out.println(response.getPrice_rules().size());

        response.getPrice_rules().forEach(createdPriceRule -> System.out.println(createdPriceRule.id));
        System.out.println();
    }


    @Test
    public void shouldGetPriceRuleById() {


        given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/price_rules/933451006108.json")
//                .prettyPrint();
                .then()
                .extract().as(CreateDiscountCodeResponse.class);

    }

}
