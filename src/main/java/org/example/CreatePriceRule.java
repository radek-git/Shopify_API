package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePriceRule {

    public String title;
    public String target_type;
    public String target_selection;
    public String allocation_method;
    public String value_type;
    public String value;
    public String customer_selection;
    public String starts_at;
}
