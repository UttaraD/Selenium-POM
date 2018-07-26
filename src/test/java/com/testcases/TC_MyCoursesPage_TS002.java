package com.testcases;

import org.openqa.selenium.support.ui.WebDriverWait;


import com.pageobjects.MyCoursesPage;
import com.utility.log;

import basemethods.basemethods;

public class TC_MyCoursesPage_TS002 {
	
	public static void TS002() throws Exception {

		log.sTestcasestart("TS002");
		
		basemethods.handlingclicks(MyCoursesPage.Coursesdropdown);
		basemethods.Mousehoverwithclick(MyCoursesPage.MyClassroomlink);
		basemethods.Mousehoverwithclick(MyCoursesPage.CourseTypeList);
		basemethods.Mousehoverwithclick(MyCoursesPage.All_coursetypelist);
		basemethods.fetchsize(MyCoursesPage.courseValue);
		basemethods.navigateback();
		
		
		

	}
}
