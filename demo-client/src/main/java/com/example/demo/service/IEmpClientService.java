package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.VO.EmpVO;

public interface IEmpClientService {

	ResponseEntity<EmpVO> getEmpById(int id);

}
