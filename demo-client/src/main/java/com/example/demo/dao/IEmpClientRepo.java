package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.EO.EmployeeEO;

public interface IEmpClientRepo extends JpaRepository<EmployeeEO, Integer> {

}
