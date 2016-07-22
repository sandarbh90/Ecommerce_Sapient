package com.somedomain.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	public WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	private int x;
	static String[][] myArray;
	
	public WebDriver openFirefoxBrowser(WebDriver driver){
		driver = new FirefoxDriver();
		return driver;
	}
	
	
	public void fnInput(WebDriver driver, WebElement element, String data)
	{
		element.sendKeys(data);
	}
	
	public void fnClick(WebDriver driver, WebElement element)
	{
		element.click();
	}
	
	public String getText(WebDriver driver, WebElement element)
	{
		return element.getText();
	}
	
	public void clearTextBox(WebDriver driver, WebElement element) {
		element.clear();
	}
	
	public void selectDropDown(WebDriver driver,WebElement element,String Value)
	{
		Select select = new Select(element);
		select.selectByValue(Value);
	}
	
	public void scrollToBottom(WebDriver driver){
		((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
	}
	
	public void mouseHover(WebDriver driver, WebElement Mainelement , WebElement SubElement) {
		Actions action = new Actions(driver);
		action.moveToElement(Mainelement).moveToElement(SubElement).click().build().perform();
	}
	
	public void slider(WebDriver driver,WebElement element, int numberOfPixels) {
		Actions moveSlider = new Actions(driver);
		moveSlider.moveToElement(element).clickAndHold().moveByOffset(0,numberOfPixels).release().perform();
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public HashMap<String,String> getDataFromCsv(String MethodName,String FileName)
	{

		Scanner sc = null;
		int row = 0;
		int rows = 0;
		int col = 0;
		int cols = 0;
		String InputLine = null;
		
		String fileLocation = projectPath+"\\src\\test\\resources\\com\\somedomain\\DataSheets\\"+FileName;
		HashMap<String,String> map = new HashMap<String, String>();
		try{
			
			// Storing data into array from a csv file
			
			sc = new Scanner(new BufferedReader(new FileReader(fileLocation)));
			myArray = new String[10][10];
			while(sc.hasNextLine())
			{
				InputLine = sc.nextLine();
				String[] readLine = InputLine.split(",");
				
				for(x=0; x<readLine.length;x++)
				{
					
					myArray[row][x] = readLine[x];
				}
				row++;
			}
			
			// Storing data into hashmap from array
			rows = myArray.length;
			cols = myArray[0].length;
			
			for(int i=0 ;i<rows ; i++)
			{
				for(int j=0;j<3;j++)
				{
					// Storing data into Key value pair as per the method called
					if(myArray[i][j].equalsIgnoreCase(MethodName))
					{
						map.put(myArray[i][1],myArray[i][2]);
					}
				}
			}
		}
		catch(Exception e)
		{
			String errorMessage = e.getLocalizedMessage();
			System.out.println(errorMessage);
		}
		sc.close();
		return map;
	}
	
	public String TakeScreenshot(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = projectPath+"\\Screenshot_FailedMethods\\Method_"+name+".png";
		FileUtils.copyFile(source, new File(projectPath+"\\Screenshot_FailedMethods\\Method_"+name+".png"));
		return destination;
	}
}
