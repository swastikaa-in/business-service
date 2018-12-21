package com.demo.businessservice.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.businessservice.service.BusinessService;

import com.demo.businessservice.model.Employee;


import java.util.*;
import java.text.*;


@Service
public class BusinessServiceImpl implements BusinessService {

	

	@Override
	public String sayGreeting(String strGreeting) {
		return "Welcome:" + strGreeting;
	}

	@Override
	public Employee getEmployeeByEmpno(String empno) {
		Date dob = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
        String input =  "1977-00-11";
		
		try {
         dob = ft.parse(input); 
		 System.out.print(input + " Parses as ");
         System.out.println(dob); 
      } catch (ParseException e) { 
         System.out.println("Unparseable using " + ft); 
      }

        
		
		Employee emp=new Employee();
		emp.setEmpno("123");
		emp.setFname("Sridhar");
		emp.setLname("Balasubramanian");
		emp.setSalary(250000.00);
		emp.setDeptName("SALES");
		emp.setDob(dob);
		return emp;
	}

}
