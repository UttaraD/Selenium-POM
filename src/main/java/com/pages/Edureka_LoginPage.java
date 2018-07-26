package com.pages;

import basemethods.basemethods;

public class Edureka_LoginPage {

	public static void Loginbtn(String locvalues) throws Exception {
		basemethods.handlingclicks(locvalues);
	}

	public static void login(String locvalues, String testData) throws Exception {
		basemethods.handlingtextboxes(locvalues, testData);
	}

	public static void Password(String locvalues, String testData) throws Exception {
		basemethods.handlingtextboxes(locvalues, testData);
	}

	public static void LoginbtninLoginPage(String locvalues) throws Exception {
		basemethods.Mousehoverwithclick(locvalues);
	}
}