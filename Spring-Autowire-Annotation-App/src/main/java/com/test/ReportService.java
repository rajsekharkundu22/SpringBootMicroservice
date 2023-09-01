package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	//Autowire in variable level
	//@Autowired
	//@Qualifier("OracleDbReportDao")
	//private ReportDao reportDao;
	
	/*
	 * //Autowire in setter level private ReportDao reportDao;
	 * 
	 * @Autowired public void setReport(ReportDao reportDao) {
	 * this.reportDao=reportDao; }
	 */
	
	//Autowire in constructor level
	private ReportDao reportDao;
	@Autowired
	public ReportService(ReportDao reportDao) {
		this.reportDao=reportDao;
	}
	
	
	public void generateReport() {
		reportDao.getData();
		System.out.println("Report generated");
	}

}
