package com.raghu.examples.service;

import org.springframework.stereotype.Component;

import com.raghu.examples.dto.Address;
import com.raghu.examples.dto.Employee;
import com.raghu.examples.dto.SearchCriteria;

@Component
public class EmployeeService implements IEmployeeService {

    public Employee[] getEmployee(SearchCriteria e) {
        Employee[] emps = new Employee[2]; 
      if (e != null && e.getCity() != null && e.getCity()[0].equals("Bangalore")) {
          Employee emp1 = new Employee();
          emp1.setName("Raghu");
          Address add = new Address();
          add.setStreetAddress("12th Main");
          add.setAddress1("Marathahalli");
          add.setCity("Bangalore");
          add.setCountry("India");
          emp1.setAge("35");
          emp1.setNumber(3777);
          emp1.setAddress(add);
          emps[0]=emp1;
          
          Employee emp2= new Employee();
          emp2.setName("Anil");
          emp1.setAge("35");
          emp1.setNumber(4444);
          emp2.setAddress(add);
          emps[1]=emp2;
                       
      } else {
          Employee emp1 = new Employee();
          emp1.setName("Ramesh");
          Address add = new Address();
          add.setStreetAddress("14th Main");
          add.setAddress1("Jafferkhanpet");
          add.setCity("Chennai");
          add.setCountry("India");
          emp1.setAge("30");
          emp1.setNumber(4434);
          emp1.setAddress(add);
          emps[0]=emp1;
          
          Employee emp2= new Employee();
          emp2.setName("Santhanam");
          emp2.setAge("25");
          emp2.setNumber(4444);
          emp2.setAddress(add);
          emps[1]=emp2;
      }
      return emps;
    }

}
