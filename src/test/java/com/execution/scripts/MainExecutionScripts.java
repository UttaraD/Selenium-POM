package com.execution.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.Basevariables;
import com.utility.ExcelReadWrite;

import basemethods.basemethods;

import com.testcases.*;

public class MainExecutionScripts {

	public static boolean bValue;

	@BeforeMethod
	public static void preRequiste() throws Exception {
		ExcelReadWrite.OpenExcel(Basevariables.excelSheetpath);
		DOMConfigurator.configure("log4j.xml");
	}

	@Test(priority = 1)
	public static void beforetest() {
		basemethods.selectbrowser(Basevariables.Browser);
		basemethods.openurl(Basevariables.URL);
	}

	@Test(priority = 2)
	public static void logintest() throws Exception {
		if (ExcelReadWrite.ReadExcel(Basevariables.testScenarioSheetName, 1, Basevariables.runModecolNo)
				.equalsIgnoreCase(Basevariables.runMode)) {
			bValue = true;
			TC_Login_TS001.TS001();
			if (bValue == false) {
				ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 1, Basevariables.resultcolNo,
						Basevariables.Failtext);
			} else {
				ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 1, Basevariables.resultcolNo,
						Basevariables.PassText);
			}
		}
	}

	@Test(priority = 4)
public static void logoutTest() throws Exception {

	if (ExcelReadWrite.ReadExcel(Basevariables.testScenarioSheetName, 5, Basevariables.runModecolNo)
			.equalsIgnoreCase(Basevariables.runMode)) {
		bValue = true;
		TC_Logout_TS00.TS00();
		if (bValue == false) {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 5, Basevariables.resultcolNo,
					Basevariables.Failtext);
		} else {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 5, Basevariables.resultcolNo,
					Basevariables.PassText);
		}

	}
}


@Test(priority = 3)
public static void MyCoursesPageTest() throws Exception {

	if (ExcelReadWrite.ReadExcel(Basevariables.testScenarioSheetName, 2, Basevariables.runModecolNo)
			.equalsIgnoreCase(Basevariables.runMode)) {
		bValue = true;
		TC_MyCoursesPage_TS002.TS002();
		if (bValue == false) {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 2, Basevariables.resultcolNo,
					Basevariables.Failtext);
		} else {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 2, Basevariables.resultcolNo,
					Basevariables.PassText);
		}

	}

}
@Test(priority = 5)
public static void blogsTest() throws Exception {

	if (ExcelReadWrite.ReadExcel(Basevariables.testScenarioSheetName, 3, Basevariables.runModecolNo)
			.equalsIgnoreCase(Basevariables.runMode)) {
		bValue = true;
		TC_BlogsPage_TS003.TS003();
		if (bValue == false) {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 3, Basevariables.resultcolNo,
					Basevariables.Failtext);
		} else {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 3, Basevariables.resultcolNo,
					Basevariables.PassText);
		}

	}
}
@Test(priority = 6)
public static void EditProfessionalPageTest() throws Exception {

	if (ExcelReadWrite.ReadExcel(Basevariables.testScenarioSheetName, 4, Basevariables.runModecolNo)
			.equalsIgnoreCase(Basevariables.runMode)) {
		bValue = true;
		TC_MyProfilePage_TS004.TS004();
		if (bValue == false) {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 4, Basevariables.resultcolNo,
					Basevariables.Failtext);
		} else {
			ExcelReadWrite.writetoExcel(Basevariables.testScenarioSheetName, 4, Basevariables.resultcolNo,
					Basevariables.PassText);
		}

	}
}
}


	