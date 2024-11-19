package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.EO.Employee;

public interface IEmpClientRepo extends JpaRepository<Employee, Integer> {

}
