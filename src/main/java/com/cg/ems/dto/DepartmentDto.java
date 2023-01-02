package com.cg.ems.dto;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class DepartmentDto {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="depart_Id")
	int departId;
	@Column(name="depart_Name")
	String departName;
	public DepartmentDto() {
		super();
	}
	public DepartmentDto(int departId, String departName) {
		super();
		this.departId = departId;
		this.departName = departName;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	@Override
	public String toString() {
		return "Department [departId=" + departId + ", departName=" + departName + "]";
	}
	
	
	
}
