package v_TigerProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Mode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito");
		opt.addArguments("");
//			opt.setHeadless(true);

		opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://localhost:8888/");
		driver.navigate().forward();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).sendKeys(Keys.ENTER); // .click();
//			

	}

}
