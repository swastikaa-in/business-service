package com.demo.businessservice.service;

import com.demo.businessservice.model.Employee;

public interface BusinessService {

	public String sayGreeting(String strGreeting);
	public Employee getEmployeeByEmpno(String empno);
}
