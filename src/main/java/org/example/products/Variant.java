package org.example.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Variant {


    public String id;
    public String product_id;
    public String title;
    public String price;
    public String sku;
    public int position;
    public String inventory_policy;
    public Object compare_at_price;
    public String fulfillment_service;
    public String inventory_management;
    public String option1;
    public Object option2;
    public Object option3;
    public String created_at;
    public String updated_at;
    public boolean taxable;
    public Object barcode;
    public int grams;
    public Object image_id;
    public double weight;
    public String weight_unit;
    public String inventory_item_id;
    public int inventory_quantity;
    public int old_inventory_quantity;
    public List<PresentmentPrice> presentment_prices;
    public boolean requires_shipping;
    public String admin_graphql_api_id;
}
