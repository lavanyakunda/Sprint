package com.cg.ems.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.EmployeeDto;




@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeDto,Integer> {

}
