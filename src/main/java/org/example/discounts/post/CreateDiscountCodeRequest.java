package org.example.discounts.post;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDiscountCodeRequest {

    private CreateDiscountCode discount_code;
}
