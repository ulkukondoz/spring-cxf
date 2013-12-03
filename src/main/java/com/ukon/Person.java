package com.ukon;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 03/12/2013
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String emial;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String emial) {
        this.emial = emial;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
}
