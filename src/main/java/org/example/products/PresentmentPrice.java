package org.example.products;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresentmentPrice {

    public Price price;
    public Object compare_at_price;
}
