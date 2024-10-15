package v_TigerProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerScenarioByRoshan {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		WebElement nameBox = driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean displayed = nameBox.isDisplayed();
		if (displayed == true) {
			System.out.println("User name box is visibal");
		} else {
			System.out.println("User name box isn't visibal");
		}

		boolean enable = nameBox.isEnabled();
		if (enable == enable) {
			System.out.println("name box is enable");
		} else {
			System.out.println("name box is not enable");
		}

		WebElement passBox = driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean visibal = passBox.isDisplayed();
		if (visibal == true) {
			System.out.println("pass box is visibal");
		} else {
			System.out.println("pass box isn't visibal");
		}

		boolean enablepassbox = passBox.isDisplayed();
		if (enablepassbox == true) {
			System.out.println("pass box is enable");
		} else {
			System.out.println("pass box isn't enable");
		}

		WebElement colourBox = driver.findElement(By.xpath("//select[@name='login_theme']"));
		boolean colourboxVisibal = colourBox.isDisplayed();
		if (colourboxVisibal == true) {
			System.out.println("colour box is visibal");
		} else {
			System.out.println("colour box isn't visibal");
		}

		boolean colourboxenable = colourBox.isEnabled();
		if (colourboxenable == true) {
			System.out.println("colour box is enable");
		} else {
			System.out.println("colour box isn't enable");
		}

		WebElement languagedis = driver.findElement(By.name("login_theme"));
		boolean langDisplayed = languagedis.isDisplayed();
		if (langDisplayed == true) {
			System.out.println("language box is visibal");
		} else {
			System.out.println("language box isn't visibal");
		}

		boolean langenable = languagedis.isEnabled();
		if (langenable == true) {
			System.out.println("language box is enable");
		} else {
			System.out.println("language box isn't enable");
		}

		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Login']"));

		boolean loginButtonDisplayed = languagedis.isDisplayed();
		if (loginButtonDisplayed == true) {
			System.out.println("loginButton box is visibal");
		} else {
			System.out.println("loginButton box isn't visibal");
		}

		boolean loginButtonenable = languagedis.isEnabled();
		if (loginButtonenable == true) {
			System.out.println("loginButton box is enable");
		} else {
			System.out.println("loginButton box isn't enable");
		}

		WebElement name = driver.findElement(By.xpath("//input[@name='user_name']"));
		name.sendKeys("admin");
		String namevalue = name.getAttribute("value");
		if (namevalue.equalsIgnoreCase("admin")) {
			System.out.println("user name is success");
		} else {
			System.out.println("user name isn't success");
		}

		WebElement pass = driver.findElement(By.xpath("//input[@name='user_password']"));

		pass.sendKeys("admin");
		String passvalue = name.getAttribute("value");
		if (namevalue.equalsIgnoreCase("admin")) {
			System.out.println("user pass is success");
		} else {
			System.out.println("user pass isn't success");
		}

		driver.findElement(By.xpath("//input[@name='Login']")).click();

		String tital = driver.getTitle();
		System.out.println(tital);
		if (tital.equalsIgnoreCase(tital)) {
			System.out.println("login success");
		} else {
			System.out.println("login unsuccess");
		}

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("h");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("hii");

		driver.findElement(By.xpath("//input[@name='Login']")).click();

		String popup = driver
				.findElement(By.xpath("//font[contains(text(),'You must specify a valid username and password.')]"))
				.getText();

		if (popup.equalsIgnoreCase("You must specify a valid username and password.")) {
			System.out.println("popup is correct");
		} else {
			System.out.println("popup is wrong");
		}

	}

}
