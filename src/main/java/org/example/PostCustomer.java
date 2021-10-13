package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCustomer {

    public String first_name;
    public String last_name;
    public String email;
    public String phone;
    public boolean verified_email;
    public List<Address> addresses;
}
