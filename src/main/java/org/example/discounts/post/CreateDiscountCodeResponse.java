package org.example.discounts.post;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.discounts.DiscountCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDiscountCodeResponse {
    private DiscountCode discount_code;
}
