package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.EO.EmployeeEO;

public interface IEmpClientService {

	ResponseEntity<EmployeeEO> getEmpByRest(int id);

	ResponseEntity<EmployeeEO> getEmpByFeign(int id);

}
