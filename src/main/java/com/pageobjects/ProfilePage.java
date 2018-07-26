package com.pageobjects;

public class ProfilePage {

	
	public static String UserProfile = "xpath://li[@class='dropdown userdrop hidden-sm hidden-xs']";
	public static String UserProfileLogOut = "xpath://span[@class='user_name']";
	public static String MyProfile = "linkText:My Profile";
	public static String EditProfDetails = "id:professional_details";
	public static String CompanyName="name:companyName";
	public static String CurrentJobLevel= "name:currentjob";
	public static String Industry = "name:currentIndustry";
	public static String LinkedinProfile= "name:linkedinLink";
	public static String Skills= "name:userSkill";
	public static String NextBtn= "xpath://button[@class='btn pull-right onboarding-primary-button']";
	public static String UploadBtn= "xpath://input[@id='resume']";
	public static String UploadCloseIcon = "xpath://i[@class='icon-close_ico']";
	public static String jobsInterested = "name:interestedJob";
	public static String employmentTypes = "name:elementType";
	public static String currentlyBasedCountry = "xpath://button[@class='btn btn-default current-place-dropdown dropdown-toggle']";
	public static String searchCountry = "xpath://input[@class='country-search']";
	//public static String selectCountry = "xpath://div[@class='ps-content']";
	
	public static String selectCountry = "xpath://form//div[@class='input-group']/div/ul[@role='menu']/perfect-scrollbar//a[.='United States']";
	//div[@id='onboarding']//app-onboarding-career-interests/accordion[@role='tablist']/accordion-group/div/div[@role='tabpanel']
	public static String currentlyBasedCity="xpath://input[@name='currentCity']";
	public static String lastCTC = "xpath://select[@name='lastDrawnSalary']";
	public static String relocateNo = "xpath://input[@name='preferredlocation' and @value='false']";
	//public static String preferredLocationCountry = "xpath://button[@class='btn btn-default current-place-dropdown dropdown-toggle']";
	//public static String preferredLocationcity =  "xpath://input[@name='preferredCity']";
	public static String Next2Btn= "xpath://button[@class='btn onboarding-primary-button pull-right']";
	public static String addAnotherDegree = "xpath://div[@id='education-container']/button[@class='btn add-another-item']";
	public static String degreeName = "id:degree-name";
	public static String degreeInstituteName = "id:company-name";
	public static String degreeStartMonth = "name:start_month";
	public static String degreeStartYear = "xpath:/html//div[@id='degree-0']/div[3]/div[2]/select";
	public static String degreeEndMonth = "xpath:/html//div[@id='degree-0']/div[3]/div[5]/select";
	public static String degreeEndYear = "xpath:/html//div[@id='degree-0']/div[3]/div[6]/select";
	public static String checkMark = "xpath://span[@class='checkmark']";
	public static String addAnotherCertification = "xpath://div[@id='certificate-container']/button[@class='btn add-another-item']";
	public static String certification = "id:certificate-name";
	public static String instituteName = "id:institute-name";
	public static String CourseStartMonth = "xpath:/html//div[@id='certificate-0']/div[3]/div[1]/select";
	public static String CourseStartYear = "xpath:/html//div[@id='certificate-0']/div[3]/div[2]/select";
	public static String CourseEndMonth = "xpath:/html//div[@id='certificate-0']/div[3]/div[5]/select";
	public static String CourseEndYear = "xpath:/html//div[@id='certificate-0']/div[3]/div[6]/select";
	//public static String SaveBtn = "xpath://button[@class='btn pull-right onboarding-primary-button']";
	public static String SaveBtn ="xpath:/html//div[@id='onboarding']//app-onboarding-other-details/accordion[@role='tablist']/accordion-group//div[@role='tabpanel']//form/div/button[@type='submit']";
			
	

}
