package com.example.demo.EO;

import org.springframework.http.ResponseEntity;

import com.example.demo.Dto.EmployeeDto;

public interface IEmployeeEO {

	EmployeeDto findById(EmployeeDto empDto);

	ResponseEntity<EmployeeDto> getEmpByFeign(ResponseEntity<EmployeeDto> empByFeign);

}
