package org.example;

import io.restassured.http.ContentType;
import org.example.products.CreateProductVariant;
import org.example.products.CreateProductVariantRequest;
import org.example.products.CreateVariantResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.example.AppConstants.BASE_URL;
import static org.testng.Assert.assertEquals;

public class ProductsTest {


    @Test
    public void shouldCreateNewVariantByProductId() {
        CreateProductVariantRequest createProductVariantRequest =
                new CreateProductVariantRequest(new CreateProductVariant("ogrki kiszone 1", "15.90"));
        CreateVariantResponse response = given().contentType(ContentType.JSON)
                .body(createProductVariantRequest)
                .when()
                .post(BASE_URL + "/admin/api/2021-04/products/6739902857372/variants.json")
                .then()
                .extract().as(CreateVariantResponse.class);

        assertEquals(response.getVariant().getTitle(), "ogrki kiszone 1");
    }
}
