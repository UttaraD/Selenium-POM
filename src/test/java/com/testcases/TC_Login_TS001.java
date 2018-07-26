package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pageobjects.LoginPage;
import com.pageobjects.MyCoursesPage;
import com.utility.Basevariables;
import com.utility.Locatorsplittedvalues;

import basemethods.basemethods;
import com.utility.log;

public class TC_Login_TS001 {
	
	
	public static WebDriver driver;
	
	
	public static void TS001() throws Exception{
		log.sTestcasestart("TS001");
		
		
	/*	String locvalue = null;
		if(locvalue==LoginPage.popUpMsg){
			basemethods.handlingclicks(LoginPage.popUpMsgCancel);
			basemethods.handlingclicks(LoginPage.Signin);
		}
		else{
			basemethods.handlingclicks(LoginPage.Signin);
		}*/
			
		basemethods.handlingclicks(LoginPage.Signin);
		basemethods.handlingtextboxes(LoginPage.Email, Basevariables.username);
		basemethods.handlingtextboxes(LoginPage.password, Basevariables.password);
		basemethods.handlingclicks(LoginPage.Loginbtn);
		
		
		
		
		
	
	
	
	
	
	}
	
	
}
