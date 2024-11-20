package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.EO.EmployeeEO;

@FeignClient(name="demoproject",url="http://localhost:8080")
public interface IFeignClient {

	@GetMapping("api/retrieve/{id}")
	public ResponseEntity<EmployeeEO> getEmpByFeign(@PathVariable("id")int id);
	
}
