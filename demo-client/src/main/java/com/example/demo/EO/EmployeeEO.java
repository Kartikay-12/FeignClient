package com.example.demo.EO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.dao.IEmpClientRepo;
import com.example.demo.feign.IFeignClient;

@Component
public class EmployeeEO implements IEmployeeEO {

	@Autowired
	IEmpClientRepo empRepo;
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	private IFeignClient feignClient;

	@Override
	public EmployeeDto findById(int id) {
		String url = "http://localhost:8080/api/retrieve/" + id;
		EmployeeDto empDto = restTemplate.getForObject(url, EmployeeDto.class);
		return empDto;
		
	}

	@Override
	public ResponseEntity<EmployeeDto> getEmpByFeign(int id) {

		return feignClient.getEmpByFeign(id);
	}

}