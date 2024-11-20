package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EO.EmployeeEO;
import com.example.demo.service.IEmpClientService;

@RestController
@RequestMapping("/api")
public class EmpClientController {

	@Autowired
	private IEmpClientService empService;

	@GetMapping("/restController/retrieve/{id}")
	public ResponseEntity<EmployeeEO> retrieveByRestController(@PathVariable("id") int id) {
		// logger.into("Received request to create Employee");
		return empService.getEmpByRest(id);

	}

	@GetMapping("/feign/retrieve/{id}")
	public ResponseEntity<EmployeeEO> retrieveByFeign(@PathVariable("id") int id) {
		return empService.getEmpByFeign(id);
	}
}
