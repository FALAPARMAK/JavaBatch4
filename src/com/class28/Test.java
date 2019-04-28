package com.class28;

public class Test {
	
	public static void main(String[] args) {
		
	
WebDriver driver=new ChromeDriver() ;
driver.closeBrowser();
driver.openBrowser();
driver.maximizeWindow();
driver.findElement();
driver.takesScreenShot();
driver.execute();

TakesScreenshot.m1();// access static method in static way by using class name/interface where method is defined
System.out.println(TakesScreenshot.fileExtension);
	}

}
