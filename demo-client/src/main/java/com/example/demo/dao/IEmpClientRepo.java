package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dto.EmployeeDto;

public interface IEmpClientRepo extends JpaRepository<EmployeeDto, Integer> {

}
