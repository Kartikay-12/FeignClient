package com.example.demo.BO;

import org.springframework.http.ResponseEntity;

import com.example.demo.Dto.EmployeeDto;

public interface IEmpClientBO {


	EmployeeDto findById(int id);

	ResponseEntity<EmployeeDto> getEmpByFeign(int id);

}
