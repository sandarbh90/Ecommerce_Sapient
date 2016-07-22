package com.somedomain.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenshot {
	
	static String projectPath = System.getProperty("user.dir");

	
	 public static String takescreenshot(WebDriver driver,String Screenshotname) throws IOException
     {
            TakesScreenshot takescreenshot=(TakesScreenshot)driver;
            File source=takescreenshot.getScreenshotAs(OutputType.FILE);
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            String datetime = formater.format(calendar.getTime());
            FileUtils.copyFile(source, new File("./Screenshot_FailedMethods/"+Screenshotname+"_"+datetime+".png"));
            String destination = projectPath+"./Screenshot_FailedMethods/"+Screenshotname+"_"+datetime+".png";
            System.out.println("Screenshot Taken Successfully!!!!");
			return destination;

     }
	 
	}




