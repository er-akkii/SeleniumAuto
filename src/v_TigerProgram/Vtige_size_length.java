package v_TigerProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtige_size_length {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Admin/Desktop/sa/SeleniumProgram/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		By n = By.name("user_password");
		WebElement v = driver.findElement(n);
		v.sendKeys("admin");
		//
//	     String logn =  driver.findElement(By.name("Login")).getAttribute("value");
//	     if(logn.contains("  Login  ")){
//	    	 System.out.println("sahi ba");
//	     }  else {
//	    	 System.out.println("galat ba");
//	     }
//	      Dimension login=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).getSize();
//	      int ht= login.getHeight();
//	      int wd= login.getWidth();
//	     // System.out.println(ht+","+wd);
//	      
//	      
		driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
//	      if(driver.equals("  Login  ")) {
//	    	  System.out.println("home page open");
//	      }else {
//	    	  System.out.println("home page not open");
//	      }
//	      //table[@class='hdrTabBg']//td[2]//a
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//	      
		List<WebElement> l = driver.findElements(By.xpath("//td[contains(@id,'alpha')]"));
		int lth = l.size();
		for (int i = 0; i < lth; i++) {
			WebElement h = l.get(i);
			System.out.println(h.getText());
			h.click();
		}
		List<WebElement> lk = driver.findElements(By.xpath("//table[@class='hdrTabBg']//td[2]//a"));
		int lh = l.size();
		for (int i = 0; i < lh; i++) {
			WebElement hj = lk.get(i);
			System.out.println(hj.getText());
			// h.click();
		}

		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("akshay kumar");

		// driver.findElement(By.className("//input[@name='assigntype']")).click();

		WebElement none = driver.findElement(By.xpath("//select[@name='campaigntype']"));
		Select non = new Select(none);
		non.selectByIndex(4);

		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("yadav G");

		driver.findElement(By.id("sponsor")).sendKeys("rayan");
		driver.findElement(By.id("numsent")).sendKeys("20");

		WebElement drop = driver.findElement(By.xpath("(//select[@class='small'])[4]"));
		Select ear = new Select(drop);
		ear.selectByIndex(4);

		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("law");
		driver.findElement(By.xpath("//input[@title='Clear']")).click();

		driver.findElement(By.id("targetsize")).sendKeys("60");

		driver.findElement(By.id("budgetcost")).sendKeys("23");

		WebElement Expected = driver.findElement(By.xpath("//select[@name='expectedresponse']"));
		Select Responce = new Select(Expected);
		Responce.selectByIndex(2);

		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[10]")).sendKeys("20");

		driver.findElement(By.xpath("//input[@id='expectedresponsecount']")).sendKeys("57");

		driver.findElement(By.xpath("//input[@id='expectedroi']")).sendKeys("40");

		driver.findElement(By.xpath("//input[@id='actualcost']")).sendKeys("40 ");

		driver.findElement(By.xpath("//input[@id='expectedrevenue']")).sendKeys("300 ");

		driver.findElement(By.xpath("//input[@id='actualsalescount']")).sendKeys("200 ");

		driver.findElement(By.xpath("//input[@id='actualresponsecount']")).sendKeys("400 ");

		driver.findElement(By.xpath("//input[@id='actualroi']")).sendKeys("40	");

		driver.findElement(By.xpath("//textarea[@name='description']"))
				.sendKeys("hello i am akshay kumar i am learning java programming");

		driver.findElement(By.xpath("(//input[@value='  Save  '])[2]")).click();

		WebElement dop = driver.findElement(By.id("qccombo"));
		Select mor = new Select(dop);
		mor.selectByIndex(6);
	}
}
