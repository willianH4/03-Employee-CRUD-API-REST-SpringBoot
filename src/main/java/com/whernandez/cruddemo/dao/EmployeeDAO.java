package com.whernandez.cruddemo.dao;

import java.util.List;

import com.whernandez.cruddemo.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	
}
