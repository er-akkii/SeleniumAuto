package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

//import java.io.FileInputStream;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandleInVtiger {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		integer();
		ExceptionHandleInVtiger h = new ExceptionHandleInVtiger();
//			localHost();
//			threadSleep();
	}

	public static void localHost() {
		System.setProperty("webDriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		try {
			driver.findElement(By.name("userpassword")).sendKeys("admin");
			System.out.println("hii");
			driver.findElement(By.name("user_name")).sendKeys("admin");
		} catch (Exception e) {
//				e.printStackTrace();
			System.out.println(e);
			System.out.println("xpath of user name is wrong");
		} finally {
			driver.findElement(By.name("Login")).click();
		}
	}

	public static void integer() {

		try {
			int a = 10 / 0;
			System.out.println("hello");

		} catch (Exception a) {
			System.out.println(a);
//				a.printStackTrace();                //it will print everything(30
//				System.out.println(a.getMessage()); //for which reason exception is coming
//				System.out.println(a.toString());   // only name of exception

			System.out.println("you can not devide by zero");

		} finally {
			System.out.println("hiii");
		}
		System.out.println("jai shree ram");
	}

	public static void threadSleep() {
		try {

			Thread.sleep(1000);
			System.out.println("try");
			new FileInputStream("gtyses");

		} catch (IOException i) {
			System.out.println(i);
			i.printStackTrace();
			System.out.println("file catch");

		} catch (InterruptedException i) {
			System.out.println("sleep catch");
		}

		try {
			driver.get("http://localhost:8888/");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.name("logi")).click();
			;

		} catch (Exception ex) {
			System.out.println("you cant login (your locater is wrong)");
		} finally {

			driver.close();
		}
	}

	ExceptionHandleInVtiger() {
		try {
			int a = 10, d = 0, u = a / d;
			System.out.println(u);
			System.out.println("sdgsf");
		} catch (Exception q) {
			System.out.println("hum");

		}
//			throw  new ArithmeticException();
	}
}
