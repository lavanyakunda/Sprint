package com.cg.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.DepartmentDto;

import jakarta.persistence.Id;
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentDto, Integer>{

}
