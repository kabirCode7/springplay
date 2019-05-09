package com.jekinstest.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class GetEmployeeRestService {
	 @GetMapping(path="/", produces = "application/json")
	    public String getEmployees()
	    {	System.out.println("for sonarQube test");
	        return "hello world";
	    }
}
