package com.test;

import org.springframework.stereotype.Repository;

@Repository("OracleDbReportDao")
public class OracleDbReportDao implements ReportDao{

	public void getData() {
		System.out.println("Getting data from Oracle database");
		
	}

}
