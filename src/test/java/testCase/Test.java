package testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector("a.nav-link#login2")).click();
		driver.findElement(By.cssSelector("input.form-control#loginusername")).sendKeys("ridip");
		driver.findElement(By.cssSelector("input.form-control#loginpassword")).sendKeys("rj@123");
		driver.findElement(By.cssSelector("button[onclick='logIn()'].btn.btn-primary")).click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 
	}

}
