package com.cg.ems.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="compliance")
public class ComplianceDto {
	@Id
	@Column(name="complianceid")
	int complianceId;
	@Column(name="rltype")
	String rlType;
	@Column(name="details")
	String details;
	@Temporal(TemporalType.DATE)
	LocalDate createDate;
	@Column(name="empcount")
	int empCount;
	@Column(name="stscount")
	int stsCount;
	@Column(name="status")
	String status;
	@Column(name="userid")
	String userId;
	@OneToOne(cascade = CascadeType.ALL)
	DepartmentDto department;
	public ComplianceDto() {
		super();
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public ComplianceDto(int complianceId, String rlType, String details, LocalDate createDate, int empCount,
			int stsCount, String status, DepartmentDto department,String userId) {
		super();
		this.complianceId = complianceId;
		this.rlType = rlType;
		this.details = details;
		this.createDate = createDate;
		this.empCount = empCount;
		this.stsCount = stsCount;
		this.status = status;
		this.department = department;
		this.userId=userId;
	}
	public int getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(int complianceId) {
		this.complianceId = complianceId;
	}
	public String getRlType() {
		return rlType;
	}
	public void setRlType(String rlType) {
		this.rlType = rlType;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public int getStsCount() {
		return stsCount;
	}
	public void setStsCount(int stsCount) {
		this.stsCount = stsCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ComplianceDto [complianceId=" + complianceId + ", rlType=" + rlType + ", details=" + details
				+ ", createDate=" + createDate + ", empCount=" + empCount + ", stsCount=" + stsCount + ", status="
				+ status + ", userId=" + userId + ", department=" + department + "]";
	}
		 
}
