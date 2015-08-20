package com.raghu.examples.dto;

import java.io.Serializable;


public class Employee implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -4353052168060257585L;

    private String name;
    
    private Integer number;
    
    private String age;
    
    private Address address;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Integer getNumber() {
        return number;
    }

    
    public void setNumber(Integer number) {
        this.number = number;
    }

    
    public String getAge() {
        return age;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

    
    public Address getAddress() {
        return address;
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", number=" + number + ", age=" + age + ", address=" + address + "]";
    }
    
    
    
    
    

}
