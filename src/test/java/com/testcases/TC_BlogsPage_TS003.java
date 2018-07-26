package com.testcases;

import com.pageobjects.BlogsPage;
import com.utility.log;

import basemethods.basemethods;

public class TC_BlogsPage_TS003 {

	public static void TS003() throws Exception {
		log.sTestcasestart("TS003");
		TC_Login_TS001.TS001();
		basemethods.Mousehoverwithclick(BlogsPage.communitylink);
		basemethods.Mousehoverwithclick(BlogsPage.Bloglink);
		basemethods.windowHandling();

	}

}
