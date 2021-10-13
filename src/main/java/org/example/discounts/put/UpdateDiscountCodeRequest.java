package org.example.discounts.put;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDiscountCodeRequest {

    private DiscountCodeToBeUpdated discount_code;
}
