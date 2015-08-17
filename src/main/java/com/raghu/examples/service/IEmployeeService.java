package com.raghu.examples.service;

import com.raghu.examples.dto.Employee;
import com.raghu.examples.dto.SearchCriteria;


public interface IEmployeeService {
    
    public Employee[]  getEmployee(SearchCriteria e);

}
