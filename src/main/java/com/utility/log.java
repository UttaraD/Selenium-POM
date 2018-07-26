package com.utility;

import org.apache.log4j.Logger;

public class log {

	private static Logger log = Logger.getLogger(new Object ().getClass().getName());
	
	public static void sTestcasestart(String testcaseName) {
		log.info("++++++++++++++++++++++");
		log.info("++++++++++++++++++++++");
		log.info("+++++++" + testcaseName +  "++++++++");
		log.info("++++++++++++++++++++++");
		log.info("++++++++++++++++++++++");
	}

	public static void sendcase() {
		log.info("++++++++++++++++++++++");
		log.info("++++++++END+++++++");
	}
	
	public static void info(String message) {
		log.info(message);
	}
	
	public static void error(String message) {
		log.error(message);
	}
	
}
	

