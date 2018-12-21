package com.demo.businessservice.model;

import java.util.Date;
import lombok.Data;


@Data
public class Employee {
	
	String empno;
	String fname;
	String lname;
	Double salary;
	String deptName;
	Date dob;
}