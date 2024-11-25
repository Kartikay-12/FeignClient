package com.example.demo.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.EO.IEmployeeEO;
import com.example.demo.feign.IFeignClient;

@Component
public class EmpClientBO implements IEmpClientBO {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private IEmployeeEO empEO;
	

//	public EmpClientBO(IFeignClient feignClient,IEmployeeEO empEO) {
//		this.empEO = empEO;
//		this.feignClient=feignClient;
//	}

	@Override
	public EmployeeDto findById(int id) {
		return empEO.findById(id);
	}

	@Override
	public ResponseEntity<EmployeeDto> getEmpByFeign(int id) {

		return empEO.getEmpByFeign(id);
	}

}
