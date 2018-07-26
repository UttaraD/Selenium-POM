package com.utility;

	import java.io.File;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import com.google.common.io.Files;

	public class TakingScreenshots {		
		public static void screenshots(TakesScreenshot ts, String screenshotName) throws Exception {
			
			DateFormat df = new SimpleDateFormat("ddMMyy@hh_mm_ss");
			Date d = new Date();
			File filebrs = new File(Basevariables.screenshotpath+screenshotName+df.format(d)+".jpeg");
			File fileSRC = ts.getScreenshotAs(OutputType.FILE);
			Files.move(fileSRC, filebrs);
		}
	}


