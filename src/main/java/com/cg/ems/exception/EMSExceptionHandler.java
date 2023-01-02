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
	//compliance
	@ExceptionHandler(ComplianceIdExistsException.class)
	public @ResponseBody EMSErrorInfo ComplianceIdExistsException(ComplianceIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		EMSErrorInfo emserrorinfo = new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	
	@ExceptionHandler(RlNotExistsException.class)
	public @ResponseBody EMSErrorInfo RlNotExistsException(RlNotExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		EMSErrorInfo emserrorinfo = new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	@ExceptionHandler(StatusIdExistsException.class)
	public @ResponseBody EMSErrorInfo StatusIdExistsException(StatusIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		EMSErrorInfo emserrorinfo = new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	

}
