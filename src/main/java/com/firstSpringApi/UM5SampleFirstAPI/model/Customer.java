package com.firstSpringApi.UM5SampleFirstAPI.model;

import lombok.Data;


@Data
public class Customer {

    private String firstName;
    private String lastName;
    private String city;
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
