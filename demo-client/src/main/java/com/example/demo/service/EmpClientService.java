package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.BO.IEmpClientBO;
import com.example.demo.EO.EmployeeEO;

@Service
public class EmpClientService implements IEmpClientService {

	@Autowired
	private IEmpClientBO empBO;

	@Override
	public ResponseEntity<EmployeeEO> getEmpByRest(int id) {

		return ResponseEntity.ok(empBO.findById(id));

	}

	@Override
	public ResponseEntity<EmployeeEO> getEmpByFeign(int id) {

		return empBO.getEmpByFeign(id);
	}

}
