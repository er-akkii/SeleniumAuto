package v_TigerProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Vtiger_MainMain {

	public static void main(String[] args) throws InterruptedException {
		mains();
		detail();
	}

	public static WebDriver mains() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).sendKeys(Keys.ENTER);
		return driver;
	}

	public static void detail() throws InterruptedException {

//				V_Tiger_Again_Automate v=new V_Tiger_Again_Automate();
		WebDriver vtiger = mains();

		String compainList = vtiger.findElement(By.xpath("//table[@class=\"lvt small\"]")).getText();
		System.out.println(compainList);

		Actions mouseOver = new Actions(vtiger);
		WebElement mouseover = vtiger.findElement(By.xpath("//a[text()='Marketing']")); // * mouse over on marketing
		mouseOver.moveToElement(mouseover).build().perform();
		vtiger.findElement(By.xpath("(//a[text()='Leads'])[3]")).click();
		Thread.sleep(4000);
		WebElement d = vtiger.findElement(By.xpath("//input[@name=\"search_text\"]"));
		mouseOver.sendKeys(d, "akshay").perform();

		List<WebElement> deletLastNameInChart = vtiger.findElements(By.xpath("//table[@class='lvt small']"));
		List<WebElement> deletLastName = vtiger.findElements(By.xpath("//td[text()='LEA2 ']"));

		for (int i = 0; i < deletLastNameInChart.size(); i++) {
			WebElement deletInChartOfLeadsGet = deletLastNameInChart.get(i);
			String deletInChartOfLeadsText = deletInChartOfLeadsGet.getText(); // OTHER RULE of delet name in list
			// System.out.println(deletInChartOfLeadsText);
			if (deletInChartOfLeadsText.contains("LEA2")) {
				vtiger.findElement(By.xpath("(//a[text()='del'])[2]")).click();
				vtiger.switchTo().alert().accept();
			}

			List<WebElement> name = vtiger.findElements(By.xpath("//span[@vtfieldname='lastname']//parent::td"));
			List<WebElement> deletButton = vtiger.findElements(By.xpath("//a[text()='del']"));
			for (int ii = 0; ii < name.size(); ii++) {
				WebElement namewe = name.get(ii);
				String nametext = namewe.getText(); // delet name in list
				WebElement deletButtonGet = deletButton.get(ii);

				if (nametext.equalsIgnoreCase("smith")) {
					deletButtonGet.click();
					Thread.sleep(5000);
					vtiger.switchTo().alert().accept();
				}
//	        

				List<WebElement> marketingClick = vtiger.findElements(By.xpath("//td[contains(@class,'Selected')]"));
				for (int j = 0; j < marketingClick.size(); j++) {
					marketingClick = vtiger.findElements(By.xpath("//td[contains(@class,'Selected')]"));
					WebElement marketingClick_Get = marketingClick.get(j);
					String marketingClick_Text = marketingClick_Get.getText();
					System.out.println(marketingClick_Text); // * click on marketing and leads
					marketingClick_Get.click();

					List<WebElement> submodule = vtiger.findElements(By.xpath("//td[contains(@class,'SelTab')]"));

					for (int ie = 0; ie < submodule.size(); ie++) {
						submodule = vtiger.findElements(By.xpath("//td[contains(@class,'SelTab')]")); // * click on
																										// marketing and
																										// leads
						WebElement submoduleGet = submodule.get(ie);
						String submoduleText = submoduleGet.getText();
						System.out.println(submoduleText);
						submoduleGet.click();
					}
					System.out.println();
				}
				List<WebElement> standerd_CheckBox = vtiger
						.findElements(By.xpath("//table[@id='modmgr_standard']//tr//a/img[contains(@alt,'able')]"));
				for (int iw = 0; iw < standerd_CheckBox.size(); iw++) {
					standerd_CheckBox = vtiger
							.findElements(By.xpath("//table[@id='modmgr_standard']//tr//a/img[contains(@alt,'able')]"));
					WebElement checkBoxGet = standerd_CheckBox.get(iw);
					String checkBoxText = checkBoxGet.getText();
					System.out.println(checkBoxText + " " + iw);
					checkBoxGet.click();
					Thread.sleep(4000);
					vtiger.navigate().refresh();
				}
				WebElement mouseoverSales = vtiger.findElement(By.xpath("//a[text()='Sales']"));
				mouseOver.moveToElement(mouseoverSales).build().perform(); // * mouse over on sales
				vtiger.findElement(By.linkText("Sales Order")).click();
				System.out.println("hoii");
				Thread.sleep(5000);
				vtiger.findElement(By.xpath("//img[@title=\"Create Sales Order...\"]"))
						.findElement(By.xpath("//img[@title='Show World Clock...']")).click(); // click on creat sales
																								// order in mouse over
																								// on sales
				System.out.println("good");

				Actions moveTagCloud = new Actions(vtiger);
				WebElement TopPotentials = vtiger.findElement(By.xpath("//b[contains(text(),'Top Potentials')]"));
				WebElement tagCloud = vtiger.findElement(By.xpath("//b[contains(text(),'Tag Cloud')]")); // Click and
																											// release
																											// tag cloud
				Thread.sleep(5000);
				moveTagCloud.dragAndDrop(TopPotentials, tagCloud).build().perform();

				moveTagCloud.moveToElement(TopPotentials).clickAndHold().moveToElement(tagCloud).release().build()
						.perform();

				List<WebElement> mouseoverAllLeads = vtiger.findElements(By.xpath("//td[contains(@class,'Selected')]"));
				for (int ia = 0; ia < mouseoverAllLeads.size(); ia++) {
					mouseoverAllLeads = vtiger.findElements(By.xpath("//td[contains(@class,'Selected')]"));
					WebElement mouseoverAllLeadsGet = mouseoverAllLeads.get(ia); // mouse over and click on all
																					// tab(link)
					String mouseoverAllLeadsGet_Text = mouseoverAllLeadsGet.getText();
					System.out.println(mouseoverAllLeadsGet_Text);
					Actions mouseOveron = new Actions(vtiger);
					mouseOver.moveToElement(mouseoverAllLeadsGet).click().build().perform();
					Thread.sleep(2000);

					List<WebElement> subModule = vtiger.findElements(By.xpath("//td[contains(@class,'SelTab')]"));
					for (int j = 0; j < subModule.size(); j++) {
						subModule = vtiger.findElements(By.xpath("//td[contains(@class,'SelTab')]")); // * mouse over
																										// and click on
																										// submodule
						WebElement subModule_Get = subModule.get(j);
						String subModule_Text = subModule_Get.getText();
						System.out.println(subModule_Text);
						subModule_Get.click();
						Thread.sleep(2000);
					}
					vtiger.navigate().back();

				}
			}
		}
	}
}