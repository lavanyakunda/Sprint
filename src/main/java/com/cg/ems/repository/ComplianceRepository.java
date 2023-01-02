package com.cg.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.StatusReportDto;

import jakarta.persistence.Id;


@Repository
public interface ComplianceRepository extends JpaRepository<ComplianceDto, Integer>{

	
	//@Query("create table sReport")
	//public StatusReportDto createStatusReport(StatusReportDto statusreport);
	@Query("select cd from ComplianceDto cd where cd.userId=:id")
	public List<ComplianceDto> getAllRl(@Param("id") String userId);
	//@Query("select cd from ComplianceDto cd where cd.userId=:id and cd.complianceId=:cid")
	//public List<StatusReportDto> getAllStatusReport(@Param("id") String userId,@Param("cid") int complianceId);

}
