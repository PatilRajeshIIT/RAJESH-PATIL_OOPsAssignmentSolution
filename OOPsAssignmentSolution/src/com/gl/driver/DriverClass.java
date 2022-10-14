package com.gl.driver;

import java.util.Scanner;
import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HRDepartment;
import com.gl.departmentservice.SuperDepartment;
import com.gl.departmentservice.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {

		// GET DEPARTMENT NAME FROM USER

		int option;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter Department Number From The Following : ");
			System.out.println(" 1. Super Department");
			System.out.println(" 2. Admin Department");
			System.out.println(" 3. HR Department");
			System.out.println(" 4. Tech Department");
			option = sc.nextInt();
		}

		if (option == 1) {

			// TO DISPLAY SUPER DEPARTMENT FUNCTIONALITIES.

			SuperDepartment superdeptname = new SuperDepartment();							/* Displays department name */
			String superdeptnameprint = superdeptname.departmentName();
			System.out.println("Welcome To " + superdeptnameprint);

			SuperDepartment supergetwork = new SuperDepartment();							/* Displays todays work */
			String supergetworkprint = supergetwork.getTodaysWork();
			System.out.println(supergetworkprint);

			SuperDepartment superworkdeadline = new SuperDepartment();						/* Displays work deadline */
			String superworkdeadlineprint = superworkdeadline.getWorkDeadline();
			System.out.println(superworkdeadlineprint);

			SuperDepartment superholiday = new SuperDepartment();							/* Displays holiday */
			String superholidayprint = superholiday.isTodayAHoliday();
			System.out.println(superholidayprint);

		} else if (option == 2) {

			// TO DISPLAY ADMIN DEPARTMENT FUNCTIONALITIES.

			AdminDepartment admindeptname = new AdminDepartment();							/* Displays department name */
			String admindeptnameprint = admindeptname.departmentName();
			System.out.println("Welcome To " + admindeptnameprint);

			AdminDepartment admingetwork = new AdminDepartment();							/* Displays todays work */
			String admingetworkprint = admingetwork.getTodaysWork();
			System.out.println(admingetworkprint);

			SuperDepartment adminworkdeadline = new AdminDepartment();						/* Displays work deadline */
			String adminworkdeadlineprint = adminworkdeadline.getWorkDeadline();
			System.out.println(adminworkdeadlineprint);

			SuperDepartment adminholiday = new AdminDepartment();							/* Displays holiday */
			String adminholidayprint = adminholiday.isTodayAHoliday();
			System.out.println(adminholidayprint);

		} else if (option == 3) {

			// TO DISPLAY HR DEPARTMENT FUNCTIONALITIES.

			HRDepartment hrdeptname = new HRDepartment();									/* Displays department name */
			String hrdeptnameprint = hrdeptname.departmentName();
			System.out.println("Welcome To " + hrdeptnameprint);

			HRDepartment hractivity = new HRDepartment();									/* Displays activity */
			String hractivityprint = hractivity.doActivity();
			System.out.println(hractivityprint);

			HRDepartment hrgetwork = new HRDepartment();									/* Displays todays work */
			String hrgetworkprint = hrgetwork.getTodaysWork();
			System.out.println(hrgetworkprint);

			SuperDepartment hrworkdeadline = new HRDepartment();							/* Displays work deadline */
			String hrworkdeadlineprint = hrworkdeadline.getWorkDeadline();
			System.out.println(hrworkdeadlineprint);

			SuperDepartment hrholiday = new HRDepartment();									/* Displays holiday */
			String hrholidayprint = hrholiday.isTodayAHoliday();
			System.out.println(hrholidayprint);

		} else if (option == 4) {

			// TO DISPLAY TECH DEPARTMENT FUNCTIONALITIES.

			TechDepartment techdeptname = new TechDepartment();								/* Displays department name */
			String techdeptnameprint = techdeptname.departmentName();
			System.out.println("Welcome To " + techdeptnameprint);

			TechDepartment techgetwork = new TechDepartment();								/* Displays todays work */
			String techgetworkprint = techgetwork.getTodaysWork();
			System.out.println(techgetworkprint);

			SuperDepartment techworkdeadline = new TechDepartment();						/* Displays work deadline */
			String techworkdeadlineprint = techworkdeadline.getWorkDeadline();
			System.out.println(techworkdeadlineprint);

			TechDepartment techstackinfo = new TechDepartment();							/* Displays stack information */
			String techstackinfoprint = techstackinfo.getTechStackInformation();
			System.out.println(techstackinfoprint);

			SuperDepartment techholiday = new TechDepartment();								/* Displays holiday */
			String techholidayprint = techholiday.isTodayAHoliday();
			System.out.println(techholidayprint);

		} else {
			System.out.println("Please Enter Valid Department Number.");
		}

	}
}
