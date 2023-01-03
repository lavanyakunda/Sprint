package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.cg.ems.dto.EmployeeDto;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.repository.IEmployeeRepository;


@Service
public class IEmployeeServiceImpl {
	@Autowired 
	IEmployeeRepository repo;
	
	
	public List<EmployeeDto>getAllEmployees(){
		List<EmployeeDto> emp=repo.findAll();
		return emp;
	}
	
	
	public EmployeeDto addEmployee( EmployeeDto emp) {
		return repo.save(emp);
		//return emp;
	}
	
	
	public EmployeeDto getEmployeeById(int id) throws EmployeeException {
		if(repo.existsById(id)) {
			return repo.findById(id).get();
		}
		else {
			throw new EmployeeException("Employee not found");
		}
	}
		
	
	public EmployeeDto updateEmployee( EmployeeDto emp) {
		repo.save(emp);
		return emp;
	}
	
	public void deleteEmployee(int id) {
		this.repo.deleteById(id);
			
	}
	public int getEmployeeCount() {
		int EmpCount=0;
		EmpCount=(int)repo.count();
		return EmpCount;
		
	}
		

}
