package json.gson;

import com.google.gson.annotations.Expose;

public class Person {
    @Expose
    private String firstName;

    @Expose
    private String lastName;

    private MaritalStatus maritalStatus;

    public Person(String firstName, String lastName, MaritalStatus maritalStatus) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
    }

    public Person() {
    }
}