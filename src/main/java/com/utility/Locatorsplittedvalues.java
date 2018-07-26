package com.utility;

import org.openqa.selenium.By;

public class Locatorsplittedvalues {

	public static By locatorVariables(String loc_vari){
		
		String LocatorType=loc_vari.split(":")[0];
		System.out.println(LocatorType);
		
		String LocatorValue= loc_vari.split(":")[1];
		System.out.println(LocatorValue);
		
		if(LocatorType.equalsIgnoreCase("xpath")){
			return By.xpath(LocatorValue);
			}
		else if (LocatorType.equalsIgnoreCase("id")){
			return By.id(LocatorValue);
			}
	
	else if (LocatorType.equalsIgnoreCase("name")) {
		return By.name(LocatorValue);
	} 
	else if (LocatorType.equalsIgnoreCase("linktext")) {
		return By.linkText(LocatorValue);   
	} 
	else if (LocatorType.equalsIgnoreCase("partiallinktext")) {
		return By.partialLinkText(LocatorValue);
	} 
	else if (LocatorType.equalsIgnoreCase("Cssselector")) {
		return By.cssSelector(LocatorValue);
	}
	return null; 
		
		
		
	}
	
	
}
