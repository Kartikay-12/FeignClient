package com.example.demo.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.EO.EmployeeEO;
import com.example.demo.feign.IFeignClient;

@Component
public class EmpClientBO implements IEmpClientBO {

	@Autowired
	RestTemplate restTemplate;
	IFeignClient feignClient;
	
	 public EmpClientBO(IFeignClient feignClient) {
	        this.feignClient = feignClient;
	    }
	
	@Override
	public EmployeeEO findById(int id) {
		String url = "http://localhost:8080/api/retrieve/"+id;
		EmployeeEO empEo =
				restTemplate.getForObject(url,EmployeeEO.class);
		return empEo;
		
	}
	@Override
	public ResponseEntity<EmployeeEO> getEmpByFeign(int id) {
		
		return feignClient.getEmpByFeign(id);
	}
	
	

}
