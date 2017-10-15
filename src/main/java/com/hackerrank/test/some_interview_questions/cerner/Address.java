package com.hackerrank.test.some_interview_questions.cerner;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Address {

    private String country;
    private String state;
    private String address;
    private int zipcode;

    Address(String country, String state, String address, int zipcode) {
        this.country = country;
        this.address = state;
        this.address = address;
        this.zipcode = zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getZipcode() {
        return zipcode;
    }

}
