package I_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).sendKeys(Keys.ENTER); // .click();
		Thread.sleep(3000);
		JavascriptExecutor b = (JavascriptExecutor) driver;
		// b.executeScript("window.scrollBy(0,500);", "");

		WebElement f = driver.findElement(By.xpath("//b[contains(text(),'Recent')]"));
//		b.executeScript("arguments[0].scrollIntoView();", f);;;;;;;;;
	}
}
