package com.example.demo.EO;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.Dto.EmployeeDto;

@Component
public class EmployeeEO implements IEmployeeEO{

	@Override
	public EmployeeDto findById(EmployeeDto empDto) {
		
		return empDto;
	}

	@Override
	public ResponseEntity<EmployeeDto> getEmpByFeign(ResponseEntity<EmployeeDto> empByFeign) {
		
		return empByFeign;
	}
	
	
	
}