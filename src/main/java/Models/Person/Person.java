package Models.Person;

import lombok.Data;

@Data
public abstract class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

}
