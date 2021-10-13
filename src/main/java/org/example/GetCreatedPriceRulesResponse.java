package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCreatedPriceRulesResponse {

    private List<CreatedPriceRule> price_rules;
}
