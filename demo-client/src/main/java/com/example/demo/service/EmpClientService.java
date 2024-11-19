package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.demo.BO.IEmpClientBO;
import com.example.demo.VO.EmpVO;

public class EmpClientService implements IEmpClientService {
	
	@Autowired
	private IEmpClientBO empBO;

	@Override
	public ResponseEntity<EmpVO> getEmpById(int id) {
		return null;
		
		
	}

}
