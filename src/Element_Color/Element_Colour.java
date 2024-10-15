package Element_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Element_Colour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\3D Objects\\Practice File\\SeleniumAutomation\\driverEXE\\chromedriver.exe");
		ChromeDriver vtiger = new ChromeDriver();

		vtiger.get("http://localhost:8888/"); 
		vtiger.findElement(By.name("user_name")).sendKeys("admin");
		vtiger.findElement(By.name("user_password")).sendKeys("admin");

		vtiger.findElement(By.name("Login")).sendKeys(Keys.ENTER);

		Actions mouseOver = new Actions(vtiger);
		WebElement mouseover = vtiger.findElement(By.xpath("//a[text()='Marketing']"));
		mouseOver.moveToElement(mouseover).build().perform();
		vtiger.findElement(By.xpath("(//a[text()='Leads'])[3]")).click();

		String colorOfDeletButton = vtiger.findElement(By.xpath("//input[@value='Delete']"))
				.getCssValue("background-color");
		System.out.println("color is = " + colorOfDeletButton);

		vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("color");
		String h = Color.fromString(colorOfDeletButton).asHex();
		System.out.println(h);

		if (h.equals("#ff0000")) {
			System.out.println("color is matched");
		} else {
			System.out.println("color is not match");
		}
		String fontWeight = vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("font-weight");
		System.out.println(fontWeight + " = Font-weight");

		String backgroundImage = vtiger.findElement(By.xpath("//input[@value='Delete']"))
				.getCssValue("background-image");
		System.out.println(backgroundImage + " = backgroundImage");
		//
//			String fontFamily = vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("font-family");
//			System.out.println(fontFamily + " = font family");
		//
//			String fontSize = vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("font-size");
//			System.out.println(fontSize + " = font-size");
		//
//			String cutedColor = vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("color");
//			System.out.println(cutedColor + " = Cuted-Color");
		//
//			String appearance = vtiger.findElement(By.xpath("//input[@value='Delete']")).getCssValue("appearance");
//			System.out.println(appearance + " = appearance");
		//
//			System.err.println(" Next Program...........");
//			
//			String sendSMSButton = vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]"))
//					.getCssValue("background-color");
//			System.out.println("background-color color is = " + colorOfDeletButton);
		//
//			vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]")).getCssValue("color");
//			String sendSMSButtonColou = Color.fromString(colorOfDeletButton).asHex();
//			System.out.println(sendSMSButtonColou);
		//
//			if (sendSMSButtonColou.equals("#ff0000")) {
//				System.out.println("color is matched");
//			} else {
//				System.out.println("color is not match");
//			}
//			String sendSMSButtonWeight = vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]")).getCssValue("font-weight");
//			System.out.println(sendSMSButtonWeight + " = Font-weight");
		//
//			String sendSMSButtonbackgroundImage = vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]"))
//					.getCssValue("background-image");
//			System.out.println(sendSMSButtonbackgroundImage + " = backgroundImage");
		//
//			String sendSMSButtonfontFamily = vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]")).getCssValue("font-family");
//			System.out.println(sendSMSButtonfontFamily + " = font family");
		//
//			String sendSMSButtonfontSize = vtiger.findElement(By.xpath("(//input[@class='crmbutton small edit'])[7]")).getCssValue("font-size");
//			System.out.println(sendSMSButtonfontSize + " = font-size");
		//

	}
}
