package com.example.demo.MapStruct;

import org.mapstruct.Mapper;
import com.example.demo.EO.Employee;
import com.example.demo.VO.EmpVO;

public interface EmpClientMapper {

	@Mapper(componentModel="spring")
	public interface EmpMapper {
		Employee toEntity(EmpVO empVo);
		EmpVO toVo(Employee empEO);
	}
}
