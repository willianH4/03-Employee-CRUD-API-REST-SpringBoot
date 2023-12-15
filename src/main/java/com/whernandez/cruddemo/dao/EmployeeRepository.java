package com.whernandez.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whernandez.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
