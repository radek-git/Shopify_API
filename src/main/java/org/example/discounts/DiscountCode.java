package org.example.discounts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountCode {

    public String id;
    public String price_rule_id;
    public String code;
    public int usage_count;
    public String created_at;
    public String updated_at;

}
