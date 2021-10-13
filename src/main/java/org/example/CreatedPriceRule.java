package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedPriceRule {
    public String id;
    public String value_type;
    public String value;
    public String customer_selection;
    public String target_type;
    public String target_selection;
    public String allocation_method;
    public Object allocation_limit;
    public boolean once_per_customer;
    public Object usage_limit;
    public String starts_at;
    public Object ends_at;
    public String created_at;
    public String updated_at;
    public List<Long> entitled_product_ids;
    public List<Long> entitled_variant_ids;
    public List<Long> entitled_collection_ids;
    public List<Long> entitled_country_ids;
    public List<Long> prerequisite_product_ids;
    public List<Long> prerequisite_variant_ids;
    public List<Long> prerequisite_collection_ids;
    public List<Long> prerequisite_saved_search_ids;
    public List<Long> prerequisite_customer_ids;
    public Object prerequisite_subtotal_range;
    public Object prerequisite_quantity_range;
    public Object prerequisite_shipping_price_range;
    public PrerequisiteToEntitlementQuantityRatio prerequisite_to_entitlement_quantity_ratio;
    public PrerequisiteToEntitlementPurchase prerequisite_to_entitlement_purchase;
    public String title;
    public String admin_graphql_api_id;
}
