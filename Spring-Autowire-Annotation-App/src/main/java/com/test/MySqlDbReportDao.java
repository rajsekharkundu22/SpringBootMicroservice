package com.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySqlDbReportDao implements ReportDao{

	public void getData() {
		System.out.println("Getting data from MySql Database");
		
	}

}
