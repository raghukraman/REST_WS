package com.raghu.examples.dto;

import java.util.Arrays;


public class SearchCriteria {
    
    /**
     * 
     */
    private static final long serialVersionUID = -6218970698738121299L;

    private Employee employee;
    
    private String[] city;
    

    public Employee getEmployee() {
        return employee;
    }

    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    public String[] getCity() {
        return city;
    }

    
    public void setCity(String[] city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "SearchCriteria [employee=" + employee + ", city=" + Arrays.toString(city) + "]";
    }
    
    

}
