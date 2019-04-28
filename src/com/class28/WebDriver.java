package com.class28;

public interface WebDriver extends TakesScreenshot, Execute {
//	Create a WebDriver Interface that will have the following unimplemented 
//	behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//	Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
//
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	public void findElement();
	
	
	
}
class ChromeDriver extends Browser implements WebDriver,Report{

	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver opening Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver closing Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("ChromeDriver maximizing Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("ChromeDriver find element");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh comedriver");
		
	}

	@Override
	public void takesScreenShot() {
		System.out.println("Taking screen shot");
		
	}

	@Override
	public void execute() {
		System.out.println("Ececuting code in ChomeDriver");
		
	}

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		
	}
	
}
class FirefoxDriver extends Browser implements WebDriver,Report{

	@Override
	public void openBrowser() {
		System.out.println("FirefoxDriver open Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirefoxDriver close Browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FirefoxDriver maximize window");
		
	}

	@Override
	public void findElement() {
		System.out.println("FirefoxDriver find element");
		
	}

	@Override
	public void takesScreenShot() {
		System.out.println("Take screenshot");
		
	}

	@Override
	public void execute() {
		System.out.println("Ececuting code in Firefox");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report fromFirefox ");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh firefox");
		
	}
	
}
