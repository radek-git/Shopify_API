package org.example;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.example.AppConstants.*;
import static org.testng.Assert.assertEquals;

public class GetProductsTest {


    @Test
    public void shouldGetProducts() {
        ProductsResponse response = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL+"/admin/api/2021-04/products.json")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract().as(ProductsResponse.class);

        assertEquals(response.getProducts().get(0).getTitle(), "makrela");
        assertEquals(response.getProducts().get(1).getTitle(), "śledź");
        assertEquals(response.getProducts().get(2).getTitle(), "szprotka");
        assertEquals(response.getProducts().get(0).getVariants().get(0).getInventoryQuantity().intValue(), 96);
        assertEquals(response.getProducts().get(1).getVariants().get(0).getInventoryQuantity().intValue(), 4);
        assertEquals(response.getProducts().get(2).getVariants().get(0).getInventoryQuantity().intValue(), 12);

//        Long productId = response.getProducts().get(0).getId();
    }


    @Test
    public void shouldGetNumberOfProducts() {
        CountResponse response = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/products/count.json")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract().as(CountResponse.class);

        assertEquals(response.getCount(), 3);
    }


    @Test
    public void shouldRetrieveProductById() {
        Long productId = 6671158018206L;

        ProductResponse productResponse = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/admin/api/2021-04/products/" + productId + ".json")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract().as(ProductResponse.class);

        assertEquals(productResponse.getProduct().getTitle(), "makrela");
        assertEquals(productResponse.getProduct().getVendor(), "sklep-z-ryba");
    }

}
