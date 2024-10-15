package v_TigerProgram;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class WindowHandling {
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.name("Login")).click();
			driver.findElement(By.xpath("//a[text()='Marketing']")).click();
			driver.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
			driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
//			driver.findElement(By.linkText("Feedback")).click();
//			driver.findElement(By.linkText("Help")).click();
	//
//			driver.findElement(By.linkText("About Us")).click();
//			String mainWindow = driver.getWindowHandle();
//			System.out.println(mainWindow);
//			
//			Set<String> totalWindow = driver.getWindowHandles();
//			for (String string : totalWindow) {
////		    	 System.out.println(totalWindow);
//				driver.switchTo().window(string);
//				String title = driver.getTitle();
////				System.out.println(title);
////				if(title.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
////					break;
////				}
//				if (title.equalsIgnoreCase("")) {
	//
//					driver.findElement(By.xpath("//textarea[@class='small']"))
//							.sendKeys("Hii i am akshay kumar yadav from Bhadohi");
//					driver.findElement(By.xpath("//input[@value='Send']")).click();
//				}
//			}
////		     driver.close();
////		     driver.findElement(By.name("close")).click();
////		     System.out.println(b);
	////	
		}
	}
