package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    public String address1;
    public String city;
    public String province;
    public String phone;
    public String zip;
    public String last_name;
    public String first_name;
    public String country;
}
