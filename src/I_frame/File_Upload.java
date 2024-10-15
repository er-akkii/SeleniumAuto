package I_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class File_Upload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).sendKeys(Keys.ENTER); // .click();

		Actions action = new Actions(driver);
		WebElement market = driver.findElement(By.xpath("//a[text()='Marketing']"));
		action.moveToElement(market).perform();

		driver.findElement(By.linkText("Documents")).click();

		driver.findElement(By.xpath("//img[@title=\"Create Document...\"]")).click();

//			JavascriptExecutor file = (JavascriptExecutor)driver;
//			WebElement FileName = driver.findElement(By.xpath("//td[@class='dvtCellLabel'])[8])"));
//		  
//			file.executeScript("arguments[0].scrollIntoView();",FileName);

		WebElement h = driver.findElement(By.xpath("(//select[@class=\"small\"])[5]"));
		Select flename = new Select(h);
		flename.selectByIndex(0);

		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(
				"C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\myPicture\\_22_mahadev-hd-computer-wallpapers_2791111844.jpg");

		driver.findElement(By.xpath("(//input[@value=\"  Save  \"])[2]")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@name=\"notes_title\"]")).sendKeys("mahakal");

		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();

	}
}
