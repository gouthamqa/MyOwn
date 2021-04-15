package PageObjectMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class LoginPage {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	static String userName, password;

	static public String intializeDriver(String address) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		driver.get(address);
		return address;
	}

	static public void loginDetails(String userName, String password) {
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
