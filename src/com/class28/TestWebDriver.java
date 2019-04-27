package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		WebDriver ww = new ChromeDriver();
		ww.closeBrowser();
		ww.findElement();
		ww.maximizeWindow();
		ww.openBrowser();

		WebDriver www = new FirefoxDriver();
		www.closeBrowser();
		www.findElement();
		www.maximizeWindow();
		www.openBrowser();
	}

}
