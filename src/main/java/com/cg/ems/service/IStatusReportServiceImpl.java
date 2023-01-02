package com.cg.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.repository.StatusReportRepository;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ComplianceIdExistsException;
import com.cg.ems.exception.StatusIdExistsException;
@Service 
public class IStatusReportServiceImpl implements IStatusReportService{
	@Autowired
	StatusReportRepository sRepository;
	@Override
	public void createStatusReport(StatusReportDto statusreport) throws StatusIdExistsException {
		
		Optional<StatusReportDto> cd = sRepository.findById(statusreport.getStatusId());
		if(cd.isPresent()) {
			throw new StatusIdExistsException("statusId exists in the table");
		}
		sRepository.save(statusreport);
		
	}

	@Override
	public List<StatusReportDto> getAllStatusReport(String userId, int complianceId) {
		// TODO Auto-generated method stub
		return sRepository.getAllStatusReport(userId, complianceId);
	}

}
