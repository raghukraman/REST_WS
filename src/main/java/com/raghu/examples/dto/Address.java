package com.raghu.examples.dto;

import java.io.Serializable;


public class Address implements Serializable{
    
    private static final long serialVersionUID = -5727060737690659841L;

    private String streetAddress;
    
    private String address1;
    
    private String address2;
    
    private Integer doorNumber;
    
    private String city;
    
    private String country;

    
    public String getStreetAddress() {
        return streetAddress;
    }

    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    
    public String getAddress1() {
        return address1;
    }

    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    
    public String getAddress2() {
        return address2;
    }

    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    
    public Integer getDoorNumber() {
        return doorNumber;
    }

    
    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    
    public String getCity() {
        return city;
    }

    
    public void setCity(String city) {
        this.city = city;
    }

    
    public String getCountry() {
        return country;
    }

    
    public void setCountry(String country) {
        this.country = country;
    }
    
    
    

}
