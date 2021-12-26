package com.adactin.baseClass;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

	public class BaseClass {

		public static WebDriver driver;
		public static WebDriver openbrowser(String browsername) {
			try {
			    if (browsername.equalsIgnoreCase("chrome")) {
			    	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				else if (browsername.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver",
							System.getProperty("user.dir")+("\\edge\\msedgedriver.exe"));
					driver=new EdgeDriver();
				}
			    else if (browsername.equalsIgnoreCase("firefox")) {
			    	System.setProperty("webdriver.gecko.driver",
			    			System.getProperty("user.dir")+("\\firefox\\geckodriver.exe"));
			    	driver=new FirefoxDriver();
					
				}
				else {
					System.out.println("======browser launch=======");
				}
				} catch (Exception e) {
				e.printStackTrace();
				}
	      		driver.manage().window().maximize();
	      		return driver;
		}
		public static void geturl(String url) {
			driver.get(url);

		}
		public static void sendkeys(WebElement element, String value) {
			element.sendKeys(value);
		}

		public static void close() {
			driver.close();
		}

		public static void quit() {
			driver.quit();
		}
		
		public static void navigate(String to) {
			driver.navigate().to(to);
		}

		public static void navigateback() {
			driver.navigate().back();
		}

		public static void navigateforward() {
			driver.navigate().forward();
		}

		public static void navigaterefresh() {
			driver.navigate().refresh();
		}

		public static void alertaccept() {
			driver.switchTo().alert().accept();
		}

		public static void alertdismiss() {
			driver.switchTo().alert().dismiss();
		}

		public static void alertwithtext(String text) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
		}

		public static void clickelement(WebElement element) {
			element.click();
		}

		public static void sleep() throws InterruptedException {
			Thread.sleep(2000);
		}

		public static void findkeys(By element) {
			element.findElement(driver).click();
		}
		public static void rightclick(WebElement element) {
			Actions a =new Actions(driver);
			a.contextClick(element).perform();
		}

		public static void doubleclick(WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element);
		}	
		public static void mouseover(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}

		public static void draganddrop(WebElement element2, WebElement element1) {
			Actions ac =new Actions(driver);
			ac.dragAndDrop(element2,element1).perform();
		}

		public static void checkbox(WebElement element) {
			element.click();			
		}
		
		public static void gettitle() {
			System.out.println("page title ="+driver.getTitle());
		}
		
		public static void getcurrenturl() {
			System.out.println("page url ="+driver.getCurrentUrl());
		}	
		
		public static void gettext(WebElement text) {
			System.out.println(text.getText());
		}
		
		public static void Getattribute(WebElement attribute,String url){
			System.out.println("attribute:"+attribute.getAttribute(url));	
		}
		
		public static void screenshot() throws Exception {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File saveFile = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Adactin_Hotel_project\\\\Failed Scenario\\\\img.png");
			Files.copy(screenshotAs, saveFile);

		}

		public static void scrolldown(WebElement scrolldown) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",scrolldown);
		}
		
		public static void scrollup(WebElement scrollup) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",scrollup);
		}
		
		public static void frames(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public static void robotClass(WebElement newwindow) throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		}
		
		public static void dropDown(WebElement dropdown, String value) {
			Select s = new Select(dropdown);
			s. selectByValue(value);
		}
		
		public static void isenable(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} 
		
		public static void isdisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		}
		
		public static void isselect(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
		
		public static void getoptions(WebElement element) {
			Select s = new Select(element); 
			java.util.List<WebElement> op = s.getOptions();
			int size = op .size();
			for (int i = 0; i < size; i++) {
				String option = op.get(i).getText();
				System.out.println(option);
			}
		}
		
		public static void get1stselectoption(WebElement element) {
			Select se = new Select(element);
			WebElement firstSelectedOption = se.getFirstSelectedOption();
			String foption = firstSelectedOption.getText();
			System.out.println(foption);
		}
		
		public static void getallselectoption(WebElement element) {
			Select sel = new Select(element);
			java.util.List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
			String alloption = ((WebElement) allSelectedOptions).getText();
			System.out.println(alloption);
		}
		
		public static void waitClass() {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		public static void windowshandeling(WebElement element) {
			Actions a = new Actions(driver);
			a.contextClick(element).perform();

		}
		public static void waitforvisibilityofelment(WebElement element) {

			try {
				WebDriverWait wb = new WebDriverWait(driver, 30);
				wb.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		public static void radiobutton(WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}


