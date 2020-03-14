package com.flipkart.FOP;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

		public static WebDriver driver;
		public String browser = "chrome";

		public BasePage() {
			if (driver == null) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"F:\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
					driver = new FirefoxDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("http://automationpractice.com/index.php");
			}
		}

		public boolean elementFound(WebElement women) {
			boolean res = false;
			try {
				res = women.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		public boolean elementFound1(WebElement dresses) {
			boolean res = false;
			try {
				res = dresses.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		public boolean elementFound2(WebElement tshirt) {
			boolean res = false;
			try {
				res = tshirt.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		
		public boolean elementFound3(WebElement clck1) {
			boolean res = false;
			try {
				res = clck1.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		public boolean checksize(WebElement medium) {
			boolean res = false;
			try {
				res =medium.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		public void productcounts(int count,int count1)
		{
           if(count1==count)
           {
        	   System.out.println("image count and product counts are equal");
           }
           else
           {
        	   System.out.println("not equal");
           }
		}
		public void clickable(WebElement clck1)
		{
			clck1.click();
		}
		
		
	public void setText(WebElement element, String name) {
			if (name != null) {
				element.click();
			element.clear();
			element.sendKeys(name);			}
}

		public void getTxtAttribute(WebElement element) {
			System.out.println("Popup Text=" +element.getAttribute("value"));
		}
		
//
//		public String selectFromDropDown(WebElement element, String option) {
//			Select obj = new Select(element);
//			obj.selectByValue(option);
//			return obj.getFirstSelectedOption().getText();
//		}
		
		public void scrolldown(WebElement ele)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
	        
	        js.executeScript("arguments[0].scrollIntoView(true)",ele);
		}
//
//		public boolean isElementVisible(WebElement element) {
//			try {
//				WebDriverWait wait = new WebDriverWait(driver, 90);
//				wait.until(ExpectedConditions.visibilityOf(element));
//				return true;
//			} catch (Exception e) {
//				return false;
//			}
//		}
//
		public void getTitlte() {
			System.out.println("Title is="+driver.getTitle());
			
	}	
		public void mouseover(WebElement ele1)
		{
			Actions ac=new Actions(driver);
			ac.moveToElement(ele1).build().perform();
			ac.doubleClick(ele1).build().perform();
			
			
			
		}
//		public String geturl(String url)
//		{
//			return driver.getCurrentUrl();
//		}
//		
//		public void quitDriver() {
//			driver.quit();
//		}
	
}



