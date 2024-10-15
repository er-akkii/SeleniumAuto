package v_TigerProgram;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vTigerTreeSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name"));
		driver.findElement(By.name("user_name")).sendKeys("admin");

		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys("admin");

		driver.findElement(By.name("Login")).click();

		Actions action = new Actions(driver);
		WebElement marketing = driver.findElement(By.xpath("//a[text()='Marketing']"));
		action.moveToElement(marketing).build().perform();
		Thread.sleep(2000);

//			driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Leads']")).click();

//			driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Accounts']")).click();
		//
//			List<WebElement> accountNo = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
//			TreeSet<String> account = new TreeSet();
//			for (int i = 0; i < accountNo.size(); i++) {
//				WebElement accountNoGet = accountNo.get(i);
//				String accountNoText = accountNoGet.getText();
//				account.add(accountNoText);
//				System.out.println("Account Text - " + accountNoText);
//			}
		//
//			for (String string : account) {
//				System.out.println(string + "-");
//				
//			}
		driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Leads']")).click();
		List<WebElement> accountNo = driver.findElements(By.xpath("//td[contains(text(),'LEA')]"));
		TreeSet<String> account = new TreeSet();
		for (int i = 0; i < accountNo.size(); i++) {
			WebElement accountNoGet = accountNo.get(i);
			String accountNoText = accountNoGet.getText();
			account.add(accountNoText);
			System.out.println("Account Text - " + accountNoText);
		}

		for (String string : account) {
			System.out.println(string + "-");

		}
	}
}
