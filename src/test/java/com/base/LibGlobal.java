package com.base;



	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LibGlobal {
		public static WebDriver driver;

		public void getDriver(String browserName, int time) {
			try {
				if (browserName.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
					driver.manage().window().maximize();
				} else if (browserName.equalsIgnoreCase("ff")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
				} else if (browserName.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
					driver.manage().window().maximize();
				}
			} catch (Exception e) {
				System.out.println("Exception Catch :" + e);
			}

		}

		public void getLaunch(String url) {
			try {

				driver.get(url);

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public void enterText(WebElement element, String data) {

			try {
				if (element.isEnabled()) {
					element.sendKeys(data);
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public void buttonCLick(WebElement element) {
			try {
				element.click();

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public void selectByVissibleText(WebElement element, String data) {

			try {
				Select select = new Select(element);
				select.selectByVisibleText(data);
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public void moveToElement(WebElement target) {
			Actions ac = new Actions(driver);
			ac.moveToElement(target).perform();

		}

		public String getTextFromPage(WebElement element) {
			String text = element.getText();

			return text;

		}

		public String getPrtWinId() {
			String prtWindow = driver.getWindowHandle();

			return prtWindow;

		}

		public Set<String> getAllWinId() {
			Set<String> windowHandles = driver.getWindowHandles();

			return windowHandles;

		}

		public void switchToChildWindow() {
			Set<String> allWinId = getAllWinId();
			for (String string : allWinId) {
				if (!getPrtWinId().equals(string)) {
					driver.switchTo().window(string);
				}
			}

		}
	

}
