package v_TigerProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerBy_JavaScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgramming\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com:/");
//			driver.navigate().to("http://localhost:8888/");

//			driver.navigate().to("https://www.youtube.com:/");
//			
//			List<WebElement> youTube = driver.findElements(By.xpath("//a[@class=\"yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer\"]"));
//			for (int i = 0; i < youTube.size(); i++) {
//				youTube = driver.findElements(By.xpath("//a[@class=\"yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer\"]"));
//				WebElement youTubeGet = youTube.get(i);
//				String youTubeText = youTubeGet.getText();
//				Thread.sleep(1000);
//				System.out.println(youTubeText);
//				youTubeGet.click();
//			}
//			Thread.sleep(2000);
//			driver.navigate().back();

		JavascriptExecutor script = (JavascriptExecutor) driver;

//			WebElement name = driver.findElement(By.name("user_name"));
//			script.executeScript("arguments[0].value='admin'", name);
//		//	name="user_password"
//		    WebElement password = driver.findElement(By.name("user_password"));
//			script.executeScript("arguments[0].value='admin'", password);
//			WebElement colour = driver.findElement(By.xpath("//select[@name='login_theme']"));

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		script.executeScript("arguments[0].value='nameakshay2002@gmail.com'", email);

		WebElement emailPassword = driver.findElement(By.xpath("//input[@type='password']"));
		script.executeScript("arguments[0].value=''", emailPassword);
		// button[@name='login']
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		script.executeScript("arguments[0].click()", loginButton);

	}

}