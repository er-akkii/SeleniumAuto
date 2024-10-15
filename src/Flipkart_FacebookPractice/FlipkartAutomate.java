package Flipkart_FacebookPractice;

	import java.util.List;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FlipkartAutomate {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https:www.flipkart.com:/");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung phone");
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
			Thread.sleep(3000);
			
			List<WebElement> priceMobile ;//= driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//			List<WebElement> setPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//			System.out.println(priceMobile.size());
//			for (int i = 0; i < priceMobile.size(); i++) {
//				WebElement setPriceGet = setPrice.get(i);
	//
//				WebElement t=priceMobile.get(i);
//				String b= setPriceGet.getText();
//				String txt = t.getText();
//				System.out.println(txt+" - "+b);
////				System.out.println("Mobile Price - "+txt);
//			}
			
			priceMobile = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		TreeSet<String> mobilePrice = new TreeSet<String>();  
		for (int i = 0; i < priceMobile.size(); i++) {
			WebElement priceGet = priceMobile.get(i);
			String priceMobileText = priceGet.getText();
			mobilePrice.add(priceMobileText);
			System.out.println("Mobile Price - "+priceMobileText);
		}
			for (String string : mobilePrice) {
				System.out.println(string);
			 
				
			}	
		}

	}
