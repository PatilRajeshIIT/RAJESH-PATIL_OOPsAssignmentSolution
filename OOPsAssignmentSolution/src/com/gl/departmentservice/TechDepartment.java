package com.gl.departmentservice;

public class TechDepartment extends SuperDepartment {

	public TechDepartment() {

	}

	@Override
	public String departmentName() {
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete Coding Of Module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
