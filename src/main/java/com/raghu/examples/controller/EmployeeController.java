package com.raghu.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.examples.dto.Employee;
import com.raghu.examples.dto.SearchCriteria;
import com.raghu.examples.service.IEmployeeService;



@RestController
@RequestMapping("/data")
public class EmployeeController {
    
    @Autowired
    IEmployeeService service;
    
    @RequestMapping(value="/employee", method = RequestMethod.POST, consumes="application/json",produces="application/json")
    public Employee[] getPersonDetail(@RequestBody SearchCriteria se) {
        System.out.println("SearchCriteria :=" + se);
        Employee[] emps = service.getEmployee(se);
        System.out.println("employee := " + emps);
        return emps;
    }

}
