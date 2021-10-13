package org.example.discounts.put;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.discounts.DiscountCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDiscountCodeResponse {

    private DiscountCode discount_code;
}
