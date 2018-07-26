package com.testcases;

import com.pageobjects.LogoutPage;
import com.pageobjects.ProfilePage;
import com.utility.Basevariables;
import com.utility.ExcelReadWrite;
import com.utility.log;

import basemethods.basemethods;

public class TC_MyProfilePage_TS004 {

	public static void TS004() throws Exception {
		log.sTestcasestart("TS004");
		basemethods.handlingclicks(ProfilePage.UserProfile);
		basemethods.handlingclicks(ProfilePage.MyProfile);
		basemethods.handlingclicks(ProfilePage.EditProfDetails);
		basemethods.clearElements(ProfilePage.CompanyName);
		basemethods.handlingtextboxes(ProfilePage.CompanyName, Basevariables.companyName);
		basemethods.handlingdropdowns(ProfilePage.CurrentJobLevel, Basevariables.CurrentjobLevel);
		basemethods.handlingdropdowns(ProfilePage.Industry, ExcelReadWrite.ReadExcel("TestData", 29, 3));
		basemethods.handlingtextboxes(ProfilePage.LinkedinProfile, Basevariables.linkedinProfile);
		basemethods.clearElements(ProfilePage.Skills);
		basemethods.handlingtextboxes(ProfilePage.Skills, Basevariables.Skills);

		String locvalues = null;
		if (locvalues == ProfilePage.UploadBtn) {

			basemethods.handlingclicks(ProfilePage.UploadBtn);

			Runtime.getRuntime().exec("C:\\Users\\Sravan\\workspace\\AutoIT\\EdurekaScript.exe");
		} else {
			basemethods.handlingclicks(ProfilePage.UploadCloseIcon);

			basemethods.handlingclicks(ProfilePage.UploadBtn);

			Runtime.getRuntime().exec("C:\\Users\\Sravan\\workspace\\AutoIT\\EdurekaScript.exe");

		}
		Thread.sleep(5000);

		basemethods.handlingclicks(ProfilePage.NextBtn);
		basemethods.handlingdropdowns(ProfilePage.jobsInterested, ExcelReadWrite.ReadExcel("TestData", 34, 3));
		basemethods.handlingdropdowns(ProfilePage.employmentTypes, ExcelReadWrite.ReadExcel("TestData", 35, 3));
		basemethods.handlingclicks(ProfilePage.currentlyBasedCountry);
		basemethods.clearElements(ProfilePage.searchCountry);
		basemethods.handlingtextboxes(ProfilePage.searchCountry, ExcelReadWrite.ReadExcel("TestData", 36, 3));
		basemethods.handlingclicks(ProfilePage.selectCountry);

		basemethods.clearElements(ProfilePage.currentlyBasedCity);
		basemethods.handlingtextboxes(ProfilePage.currentlyBasedCity, ExcelReadWrite.ReadExcel("TestData", 37, 3));
		basemethods.handlingdropdowns(ProfilePage.lastCTC, ExcelReadWrite.ReadExcel("TestData", 38, 3));
		basemethods.handlingclicks(ProfilePage.relocateNo);
		Thread.sleep(5000);
		basemethods.handlingclicks(ProfilePage.Next2Btn);

		basemethods.handlingclicks(ProfilePage.addAnotherDegree);
		basemethods.clearElements(ProfilePage.degreeName);
		basemethods.handlingtextboxes(ProfilePage.degreeName, ExcelReadWrite.ReadExcel("TestData", 41, 3));
		basemethods.clearElements(ProfilePage.degreeInstituteName);
		basemethods.handlingtextboxes(ProfilePage.degreeInstituteName, ExcelReadWrite.ReadExcel("TestData", 42, 3));
		basemethods.handlingdropdowns(ProfilePage.degreeStartMonth, ExcelReadWrite.ReadExcel("TestData", 43, 3));
		basemethods.handlingdropdowns(ProfilePage.degreeStartYear, ExcelReadWrite.ReadExcel("TestData", 44, 3));
		basemethods.handlingdropdowns(ProfilePage.degreeEndMonth, ExcelReadWrite.ReadExcel("TestData", 45, 3));
		basemethods.handlingdropdowns(ProfilePage.degreeEndYear, ExcelReadWrite.ReadExcel("TestData", 46, 3));
		basemethods.handlingclicks(ProfilePage.checkMark);
		basemethods.handlingclicks(ProfilePage.addAnotherCertification);
		basemethods.clearElements(ProfilePage.certification);
		basemethods.handlingtextboxes(ProfilePage.certification, ExcelReadWrite.ReadExcel("TestData", 47, 3));
		basemethods.clearElements(ProfilePage.instituteName);
		basemethods.handlingtextboxes(ProfilePage.instituteName, ExcelReadWrite.ReadExcel("TestData", 48, 3));
		basemethods.handlingdropdowns(ProfilePage.CourseStartMonth, ExcelReadWrite.ReadExcel("TestData", 49, 3));
		basemethods.handlingdropdowns(ProfilePage.CourseStartYear, ExcelReadWrite.ReadExcel("TestData", 50, 3));
		basemethods.handlingdropdowns(ProfilePage.CourseEndMonth, ExcelReadWrite.ReadExcel("TestData", 51, 3));
		basemethods.handlingdropdowns(ProfilePage.CourseEndYear, ExcelReadWrite.ReadExcel("TestData", 52, 3));

		Thread.sleep(5000);
		basemethods.handlingclicks(ProfilePage.SaveBtn);
		basemethods.handlingclicks(ProfilePage.UserProfileLogOut);
		basemethods.handlingclicks(LogoutPage.Logout);

	}

}
