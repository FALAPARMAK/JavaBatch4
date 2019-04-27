package com.class28;

public interface WebDriver {
//	Create a WebDriver Interface that will have the following unimplemented 
//	behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//	Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
//
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
	
	
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver open Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver close Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("ChromeDriver maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("ChromeDriver find element");
		
	}
	
}
class FirefoxDriver implements WebDriver{

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
	
}