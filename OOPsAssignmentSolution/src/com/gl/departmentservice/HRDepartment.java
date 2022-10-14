package com.gl.departmentservice;

public class HRDepartment extends SuperDepartment {

	public HRDepartment() {

	}

	@Override
	public String departmentName() {
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill Today's Worksheet And Mark Your Attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete By EOD ";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
