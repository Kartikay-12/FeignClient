package com.example.demo.EO;

import org.springframework.http.ResponseEntity;

import com.example.demo.Dto.EmployeeDto;

public interface IEmployeeEO {

	EmployeeDto findById(int id);

	ResponseEntity<EmployeeDto> getEmpByFeign(int id);

	

}
