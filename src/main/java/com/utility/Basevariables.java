package com.utility;

public class Basevariables {

	public static String chromekey = "webdriver.chrome.driver";
	public static String firefoxkey = "webdriver.gecko.driver";
	public static String chromedriverpath = "C:\\Users\\Uttara\\chromedriver_win32\\chromedriver.exe";
	public static String firefoxdriverpath = "C:\\Users\\Uttara\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	public static final String excelSheetpath = "C:\\Users\\Sravan\\workspace\\edureka_Automation\\test.xlsx";
	public static final String screenshotpath= "C:\\Users\\Sravan\\workspace\\edureka_Automation\\Evidences\\";

	
	public static String Browser = ExcelReadWrite.ReadExcel("TestData", 1, 3);
	public static String URL = ExcelReadWrite.ReadExcel("TestData", 2, 3);
	public static String username = ExcelReadWrite.ReadExcel("TestData", 4, 3);
	public static String password = ExcelReadWrite.ReadExcel("TestData", 5, 3);
	public static String searchBlog = ExcelReadWrite.ReadExcel("TestData", 15, 3);
	public static String linkedinProfile = ExcelReadWrite.ReadExcel("TestData", 30, 3);
	public static String Skills = ExcelReadWrite.ReadExcel("TestData", 31, 3);
	public static String companyName = ExcelReadWrite.ReadExcel("TestData", 27, 3);
	public static String CurrentjobLevel = ExcelReadWrite.ReadExcel("TestData", 28, 3);
	
	

	public static String runMode = "Y";
	public static String testScenarioSheetName = "TestScenario";
	public static int runModecolNo = 2;
	public static int resultcolNo = 3;
	public static final String PassText = "PASS";
	public static final String Failtext = "FAIL";
	






}
