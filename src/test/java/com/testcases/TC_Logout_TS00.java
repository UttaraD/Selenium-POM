package com.testcases;

import com.pageobjects.LogoutPage;
import com.utility.log;

import basemethods.basemethods;

public class TC_Logout_TS00 {
	

	public static void TS00() throws Exception {
		log.sTestcasestart("TS00");
		basemethods.handlingclicks(LogoutPage.useraccount);
		basemethods.handlingclicks(LogoutPage.Logout);
		

	}
}
