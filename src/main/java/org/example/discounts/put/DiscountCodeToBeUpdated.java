package org.example.discounts.put;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiscountCodeToBeUpdated {

    public String id;
    public String code;
}
