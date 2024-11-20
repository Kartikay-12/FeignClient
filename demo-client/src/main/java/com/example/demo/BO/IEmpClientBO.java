package com.example.demo.BO;

import org.springframework.http.ResponseEntity;

import com.example.demo.EO.EmployeeEO;
import com.example.demo.VO.EmpVO;

public interface IEmpClientBO {


	EmployeeEO findById(int id);

	ResponseEntity<EmployeeEO> getEmpByFeign(int id);

}
