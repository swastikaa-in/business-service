package com.demo.businessservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.businessservice.service.BusinessService;

import com.demo.businessservice.model.Employee;

@RestController
@RequestMapping("/api/business-service/")
public class BusinessController {

	@Autowired
	BusinessService businessService;



    @RequestMapping(value="/tryme-now")
    public void sayHello(){
        System.out.println("Welcome");
    }
	@RequestMapping(value = "v1/{strGreeting}", method = RequestMethod.GET)
	public String sayGreeting(@PathVariable("strGreeting") String strGreeting) {

			return businessService.sayGreeting(strGreeting);

	}

	@RequestMapping(value = "v1/employee/{empno}", method = RequestMethod.GET)
	public Employee getEmployeeByEmpno(@PathVariable("empno") String empno) {

			return businessService.getEmployeeByEmpno(empno);

	}


}
