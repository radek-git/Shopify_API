
package org.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "product_id",
    "title",
    "price",
    "sku",
    "position",
    "inventory_policy",
    "compare_at_price",
    "fulfillment_service",
    "inventory_management",
    "option1",
    "option2",
    "option3",
    "created_at",
    "updated_at",
    "taxable",
    "barcode",
    "grams",
    "image_id",
    "weight",
    "weight_unit",
    "inventory_item_id",
    "inventory_quantity",
    "old_inventory_quantity",
    "requires_shipping",
    "admin_graphql_api_id"
})
public class Variant {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("inventory_policy")
    private String inventoryPolicy;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("inventory_management")
    private String inventoryManagement;
    @JsonProperty("option1")
    private String option1;
    @JsonProperty("option2")
    private Object option2;
    @JsonProperty("option3")
    private Object option3;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("taxable")
    private Boolean taxable;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("grams")
    private Integer grams;
    @JsonProperty("image_id")
    private Object imageId;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
    @JsonProperty("inventory_quantity")
    private Integer inventoryQuantity;
    @JsonProperty("old_inventory_quantity")
    private Integer oldInventoryQuantity;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("product_id")
    public Long getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("inventory_policy")
    public String getInventoryPolicy() {
        return inventoryPolicy;
    }

    @JsonProperty("inventory_policy")
    public void setInventoryPolicy(String inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
    }

    @JsonProperty("compare_at_price")
    public Object getCompareAtPrice() {
        return compareAtPrice;
    }

    @JsonProperty("compare_at_price")
    public void setCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    @JsonProperty("fulfillment_service")
    public String getFulfillmentService() {
        return fulfillmentService;
    }

    @JsonProperty("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    @JsonProperty("inventory_management")
    public String getInventoryManagement() {
        return inventoryManagement;
    }

    @JsonProperty("inventory_management")
    public void setInventoryManagement(String inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    @JsonProperty("option1")
    public String getOption1() {
        return option1;
    }

    @JsonProperty("option1")
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    @JsonProperty("option2")
    public Object getOption2() {
        return option2;
    }

    @JsonProperty("option2")
    public void setOption2(Object option2) {
        this.option2 = option2;
    }

    @JsonProperty("option3")
    public Object getOption3() {
        return option3;
    }

    @JsonProperty("option3")
    public void setOption3(Object option3) {
        this.option3 = option3;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("taxable")
    public Boolean getTaxable() {
        return taxable;
    }

    @JsonProperty("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("grams")
    public Integer getGrams() {
        return grams;
    }

    @JsonProperty("grams")
    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    @JsonProperty("image_id")
    public Object getImageId() {
        return imageId;
    }

    @JsonProperty("image_id")
    public void setImageId(Object imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("weight_unit")
    public String getWeightUnit() {
        return weightUnit;
    }

    @JsonProperty("weight_unit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @JsonProperty("inventory_item_id")
    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    @JsonProperty("inventory_item_id")
    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @JsonProperty("inventory_quantity")
    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    @JsonProperty("inventory_quantity")
    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @JsonProperty("old_inventory_quantity")
    public Integer getOldInventoryQuantity() {
        return oldInventoryQuantity;
    }

    @JsonProperty("old_inventory_quantity")
    public void setOldInventoryQuantity(Integer oldInventoryQuantity) {
        this.oldInventoryQuantity = oldInventoryQuantity;
    }

    @JsonProperty("requires_shipping")
    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    @JsonProperty("requires_shipping")
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    @JsonProperty("admin_graphql_api_id")
    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    @JsonProperty("admin_graphql_api_id")
    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
