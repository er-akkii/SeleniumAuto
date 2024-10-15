package Flipkart_FacebookPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Automate_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");

		ChromeDriver flipkart = new ChromeDriver();
		flipkart.get("https:www.flipkart.com");

		flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	     flipkart.manage().window().maximize();

		// flipkart.findElement(By.xpath("(//img[@class='_396cs4
		// _3exPp9'])[3]")).click();

//	     WebElement lowbuget = flipkart.findElement(By.xpath("//select[@class='_2YxCDZ']"));
//	     Select low = new Select(lowbuget);
//	     low.selectByIndex(0);
//	     
//	     WebElement highbuget = flipkart.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
//	     Select high = new Select(highbuget);
//	     low.selectByIndex(2);

		List<WebElement> TopOffers = flipkart.findElements(By.xpath("//div[@class='xtXmba']"));
		int TopOf = TopOffers.size();
		System.out.println(TopOf);
		for (int i = 0; i < TopOffers.size(); i++) {
			TopOffers = flipkart.findElements(By.xpath("//div[@class='xtXmba']"));
			WebElement TopOffersGet = TopOffers.get(i);
			String TopOffersText = TopOffersGet.getText();
			System.out.println(TopOffersText);
			TopOffersGet.click();
			Thread.sleep(2000);
			if ((TopOffersText.equalsIgnoreCase("Fashion") == false)
					&& (TopOffersText.equalsIgnoreCase("Electronics") == false)
					&& (TopOffersText.equalsIgnoreCase("Home") == false)
					&& (TopOffersText.equalsIgnoreCase("Beauty, Toys & More") == false)) {
				flipkart.navigate().back();
				Thread.sleep(2000);
			}
		}
//			List<WebElement> listofElements = flipkart.findElements(By.xpath("//div[@class='eFQ30H']//a"));
//			int sizelist = listofElements.size();
//			System.out.println(sizelist);
//			for (int i = 0; i < sizelist; i++) {
//				listofElements = flipkart.findElements(By.xpath("//div[@class='eFQ30H']//a"));
//				WebElement flipkarclick = listofElements.get(i);
//				String linktxt = flipkarclick.getText();
//				System.out.println(linktxt);
//				flipkarclick.click();
//				Thread.sleep(2000);
//				if ((linktxt.equalsIgnoreCase("Fashion") == false)
//						&& (linktxt.equalsIgnoreCase("Electronics") == false) && (linktxt.equalsIgnoreCase("Home") == false)
//								&& (linktxt.equalsIgnoreCase("Beauty, Toys & More") == false)) {
//					flipkart.navigate().back();
//					Thread.sleep(2000);
//				}}	
		flipkart.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("bata shoes for men");
		Thread.sleep(5000);

		flipkart.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		List<WebElement> shoesName = flipkart.findElements(By.xpath("//a[contains(@class,'IRpwTa')]"));
		List<WebElement> shoesPrice = flipkart.findElements(By.xpath("//div[@class='_30jeq3']"));

		for (int i = 0; i < shoesPrice.size(); i++) {
			WebElement shoesPraceGet = shoesPrice.get(i);
			WebElement shoesNameGet = shoesName.get(i);
			String shoesNameText = shoesNameGet.getText();
			String shoesPricetext = shoesPraceGet.getText();
			System.out.println("Rs." + shoesPricetext + " = " + shoesNameText + " !");
		}
	}
}
