/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.producer.employeeproducer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.producer.employeeproducer.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="firstPageFallback")
    public Employee firstPage() {
        Employee emp = new Employee();
        emp.setName("Aman Adhikari");
        emp.setDesignation("software engineer");
        emp.setEmpId("1");
        emp.setSalary(3000);
        
        if(emp.getName().equalsIgnoreCase("Aman Adhikari"))
        	throw new RuntimeException();
        
        return emp;
    }

    public Employee firstPageFallback() {
    	Employee emp = new Employee();
    	emp.setName("Fallback Name");
    	emp.setDesignation("Fallback Designation");
    	emp.setEmpId("fallback-id-01");
    	emp.setSalary(4000.0 );
    	return emp;
    }
}
