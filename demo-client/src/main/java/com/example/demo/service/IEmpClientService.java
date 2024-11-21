package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.Dto.EmployeeDto;

public interface IEmpClientService {

	ResponseEntity<EmployeeDto> getEmpByRest(int id);

	ResponseEntity<EmployeeDto> getEmpByFeign(int id);

}
