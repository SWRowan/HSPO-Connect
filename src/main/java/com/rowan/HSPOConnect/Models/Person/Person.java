package com.rowan.HSPOConnect.Models.Person;

import lombok.Data;

@Data
public abstract class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String personNumber;

}
