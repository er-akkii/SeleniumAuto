package v_TigerProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_Basic_SizeAndColor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
//			ChromeOptions obj = new ChromeOptions();
//	      obj.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
//	      obj.addArguments("incognito");
//	      Thread.sleep(3000);
//	      obj.addArguments("headless");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");

		WebElement colour = driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select culor = new Select(colour);
//			culor.selectByIndex(3);
		String h = colour.getText();
		System.out.println(h);

		Thread.sleep(1000);

		culor.selectByValue("alphagrey");

		Thread.sleep(1000);

		culor.selectByVisibleText("bluelagoon");
//			driver.manage().window().maximize();                                               //     maximize the page
		Dimension colourBoxsize = driver.findElement(By.xpath("//select[@name='login_theme']")).getSize();
		int hight = colourBoxsize.height;
		int wigth = colourBoxsize.width;
		System.out.println("hight =" + hight + " , " + "wigth =" + wigth);

		Point colourBoxlocation = driver.findElement(By.xpath("//select[@name='login_theme']")).getLocation();
		int x = colourBoxlocation.x;
		int y = colourBoxlocation.y;
		System.out.println("x =" + x + "," + "y =" + y);

		driver.findElement(By.xpath("//input[@name='Login']")).sendKeys(Keys.ENTER); // ************ login
//	      driver.findElement(By.xpath("//input[@name='Login']")).click();                    //*****          click on login buttton

		Thread.sleep(1000);

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,1000);");

//			driver.findElement(By.xpath("//b[contains(text(),'Pending Activities')]")).sendKeys(Keys.PAGE_DOWN); 

		WebElement sroll = driver.findElement(By.xpath("//tr[@id='headerrow_1']"));
		scroll.executeScript("arguments[0].scrollIntoView();", sroll);

		Dimension sizeNoData = driver.findElement(By.xpath("//div[@id='stuff_1']")).getSize();
		int hght = sizeNoData.height;
		int with = sizeNoData.width;
		System.out.println("hght =" + hght + " , " + "with =" + with);

		driver.navigate().refresh();
		Thread.sleep(2000);
////		    
		scroll.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@onclick='fnAddWindow(this,\"addWidgetDropDown\");']")).click();
		Actions drag = new Actions(driver);
		WebElement topAccounts = driver.findElement(By.xpath("//b[contains(text(),'Top Accounts')]"));
		WebElement topPotentials = driver.findElement(By.xpath("//b[contains(text(),'Top Potentials')]"));
		drag.dragAndDrop(topAccounts, topPotentials).build().perform();

		List<WebElement> refresh = driver.findElements(By.xpath("//img[@alt='Refresh']"));
		for (int i = 0; i < refresh.size(); i++) {
			WebElement refreshGet = refresh.get(i);
			String refreshtext = refreshGet.getText();
			System.out.println("refresh text =" + refreshtext);
			refreshGet.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Edit']")).click();

//	    	driver.findElement(By.xpath("//img[@onclick='fnAddWindow(this,\"addWidgetDropDown\");']")).click();
//	    	driver.findElement(By.xpath("//a[@id='addmodule']")).click();
//	        driver.findElement(By.xpath("//input[@id='stufftitle_id']")).sendKeys("DELL-Window-10");
//	    	driver.findElement(By.xpath("//input[@id='savebtn']")).click();

		List<WebElement> LinkOfTop = driver
				.findElements(By.xpath("//table[@class='small showPanelBg']//b[contains(text(),'s')]"));
		for (int k = 0; k < LinkOfTop.size(); k++) {
			WebElement LinkOfTopGet = LinkOfTop.get(k);
			String LinkOfTopText = LinkOfTopGet.getText();
			System.out.println(LinkOfTopText);

		}

		String vtiger5 = driver.findElement(By.xpath("//img[@title='vtiger CRM']")).getText();
		System.out.println(vtiger5);

		String myHomePage = driver.findElement(By.xpath("//td[@class='moduleName']")).getText();
		System.out.println(myHomePage);

		List<WebElement> noDataFound = driver.findElements(By.xpath("//div[text()='No Data Found']"));
		for (int i = 0; i < noDataFound.size(); i++) {
			WebElement noDataFoundGet = noDataFound.get(i);
			String noDataFoundText = noDataFoundGet.getText();
			System.out.println(noDataFoundText);

		}
		List<WebElement> allTagName = driver
				.findElements(By.xpath("//table[@class='small showPanelBg']//b[contains(text(),'s')]"));
		for (int j = 0; j < allTagName.size(); j++) {
			WebElement allTagNameGet = allTagName.get(j);
			String allTagNameText = allTagNameGet.getText();
			System.out.println(allTagNameText);

		}
//	    	driver.findElement(By.xpath("//img[@title='Open Calculator...']")).click();
		Thread.sleep(1000);
		//
//	    	driver.findElement(By.xpath("//input[@value='4']")).click();
//	    	driver.findElement(By.xpath("//input[@value='+']")).click();  //  calculator
//	    	driver.findElement(By.xpath("//input[@value='1']")).click();
//	    	driver.findElement(By.xpath("//input[@value='=']")).click();
//	    	driver.findElement(By.xpath("(//img[@align='absmiddle'])[2]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Calendar']/parent::td[@class='level2UnSelTab']")).click();

		String calendor = driver.findElement(By.xpath("//div[@id='miniCal']")).getText();
		System.out.println(calendor + "hpp");

		String calendortext = driver.findElement(By.xpath("//td[@class='moduleName']")).getText();
		System.out.println(calendortext);

		driver.findElement(By.xpath("//img[@title='Open All Menu...']")).click();
		String allMenuInCalander = driver.findElement(By.xpath("//table[@class='allMnuTable']")).getText();
		System.out.println(allMenuInCalander);

		List<WebElement> dateMonthYear = driver.findElements(By.xpath("//td[contains(@class,'calSel')]//parent::tr"));
		for (int aa = 0; aa < dateMonthYear.size(); aa++) {
//	    		dateMonthYear = driver.findElements(By.xpath("//td[contains(@class,'calUnSel')]"));
			WebElement dateMonthYearGet = dateMonthYear.get(aa);
			String dateMonthYearText = dateMonthYearGet.getText();
			System.out.println(dateMonthYearText);
//				dateMonthYearGet.click();
		}

//	    	WebElement quickSearchBox = driver.findElement(By.xpath("//select[@id='qccombo']"));       // Can't automate it 
//	    	Select quick = new Select (quickSearchBox);   
//	    	quick.selectByIndex(5);

//	    	Actions sendKeys = new Actions(driver);
//	    	WebElement keys = driver.findElement(By.xpath("//input[@id='related_to_display']"));
//	        sendKeys.sendKeys(keys, "Company about-Akshay Kumar");
		//
//	    	WebElement projectTask= driver.findElement(By.xpath("//select[@id='related_to_type']"));
//	    	Select project = new Select (projectTask);
//	    	project.selectByIndex(2);

//	    	WebElement fdk=driver.findElement(By.xpath("//textarea[@class='detailedViewTextBox']"));
//	    	sendKeys.sendKeys("akshay kumar is very intellegent");

//	    	driver.findElement(By.xpath("//input[@value='  Save']")).click();
//	    	
//	    	List<WebElement> tab = driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));
//	    	for (int i = 0; i < tab.size(); i++) {
//	    		tab = driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));
//				WebElement tabGet = tab.get(i);
//				String tabText = tabGet.getText();
//				System.out.println(tabText);
//				tabGet.click();
//				
//				List<WebElement> subModule = driver.findElements(By.xpath("//td[@class='level2UnSelTab']"));
//				for (int j = 0; j < subModule.size(); j++) {
//					 subModule = driver.findElements(By.xpath("//td[@class='level2UnSelTab']"));
//					WebElement subModuleGet = subModule.get(j);
//					String subModuleText = subModuleGet.getText();
//					System.out.println(subModuleText);
//					subModuleGet.click();
//				}
//			}System.out.println();
//	    	driver.navigate().back();
//	         

//	    	Actions setting =new Actions(driver);
//	    	WebElement over = driver.findElement(By.xpath("//a[text()='Settings']"));
//	    	setting.moveToElement(over).build().perform();
//	    	driver.findElement(By.linkText("Module Manager")).click();

	}

}
