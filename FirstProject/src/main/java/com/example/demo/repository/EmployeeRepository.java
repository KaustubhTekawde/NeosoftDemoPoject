package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.apache.el.parser.JJTELParserState;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository :: no need to write this annotation here beacause
//Spring-data-Jpa dependency take care to add JpaRepository internally
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    // all crud methods
}
