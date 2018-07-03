/**
 * 
 */
package com.sanya.boot.h2dbmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanya.boot.h2dbmicroservice.entity.Employee;
import com.sanya.boot.h2dbmicroservice.repository.H2DBRepository;

/**
 * @author Sanya_s
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	H2DBRepository h2DBRepository;

	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return h2DBRepository.findAll();
	}
	
	@PostMapping("/employees/add")
	public String addEmployee(@RequestBody() final Employee employee){
		Employee newEmployee = h2DBRepository.save(employee);
		return "employee added with Id :"+newEmployee.getEmpId();
	}
	
}
