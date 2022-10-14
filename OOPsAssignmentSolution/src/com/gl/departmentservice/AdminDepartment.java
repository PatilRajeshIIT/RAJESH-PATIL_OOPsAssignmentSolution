package com.gl.departmentservice;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {

	}

	@Override
	public String departmentName() {
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete Your Documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete By EOD ";
	}

}
