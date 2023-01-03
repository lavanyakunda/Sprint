package com.cg.ems.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class EMSExceptionHandler {
	
	//login
	@ExceptionHandler(UserException.class)
	public @ResponseBody EMSErrorInfo userIdException(UserException ce,HttpServletRequest req) {
		String msg=ce.getMessage();
		String uri= req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//Department
	@ExceptionHandler(DepartmentException.class)
	public @ResponseBody EMSErrorInfo eepartIdException(DepartmentException ce, HttpServletRequest req) {
		String msg=ce.getMessage();
		String uri=req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//employee
	@ExceptionHandler(EmployeeException.class)
	public @ResponseBody EMSErrorInfo employeeException(EmployeeException ce, HttpServletRequest req) {
		String msg=ce.getMessage();
		String uri=req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//compliance
	@ExceptionHandler(ComplianceIdExistsException.class)
	public @ResponseBody EMSErrorInfo complianceIdExistsException(ComplianceIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	//compliance
	@ExceptionHandler(RlNotExistsException.class)
	public @ResponseBody EMSErrorInfo slNotExistsException(RlNotExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//status report
	@ExceptionHandler(StatusIdExistsException.class)
	public @ResponseBody EMSErrorInfo statusIdExistsException(StatusIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//status report
	@ExceptionHandler(ReportNotExistsException.class)
	public @ResponseBody EMSErrorInfo reportNotExistsException(ReportNotExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//compliance
	@ExceptionHandler(RlNotExistsWithIdException.class)
	public @ResponseBody EMSErrorInfo rlNotExistsWithIdException(RlNotExistsWithIdException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	

}
