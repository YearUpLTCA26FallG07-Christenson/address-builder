package com.pluralsight;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String addressStreet, String addressCity, String addressState, String addressZip){
        this.street = addressStreet;
        this.city = addressCity;
        this.state = addressState;
        this.zip = addressZip;
    }

    public String getStreet(){
        return this.street;
    }

    public void setStreet(String newStreet){
       this.street = newStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String newZip) {
        this.zip = newZip;
    }
}
