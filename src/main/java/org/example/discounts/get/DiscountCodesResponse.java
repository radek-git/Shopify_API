package org.example.discounts.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.discounts.DiscountCode;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountCodesResponse {

    private List<DiscountCode> discount_codes;
}
