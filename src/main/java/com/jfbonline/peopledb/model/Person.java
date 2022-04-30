package com.jfbonline.peopledb.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private ZonedDateTime dob;
    private Long id;

    public Person(String firstName, String lastName, ZonedDateTime dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ZonedDateTime getDob() {
        return dob;
    }

    public void setDob(ZonedDateTime dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        // dob.withZoneSameInstant(ZoneId.of("+0")).equals(person.dob.withZoneSameInstant(ZoneId.of("+0")))
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob, id);
    }
}
