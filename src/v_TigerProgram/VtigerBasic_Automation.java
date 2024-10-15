package v_TigerProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerBasic_Automation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name"));
		driver.findElement(By.name("user_name")).sendKeys("admin");

		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys("admin");

		WebElement colr = driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select ColourTheam = new Select(colr);
		ColourTheam.selectByIndex(1);

//	     WebElement lnguage= crome.findElement(By.xpath("//select[@name='login_language']"));
//	     Select Language = new Select(lnguage);
//	     Language.selectByIndex(4);

		String loginText = driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).getText();
//	     System.out.println(loginText+"gess");
//	     if(loginText.contains("  Login  ")){
//		   System.out.println("login text pass");
//	     }   else {
//	     System.out.println("login text fail");
//	               }
		String OnLoginPage = driver.findElement(By.xpath("//img[@src='themes/images/bullets.gif']")).getText();
		System.out.println(OnLoginPage + "No Enough");
		driver.findElement(By.name("Login")).click();

		WebElement plus = driver.findElement(By.xpath("//img[@onclick='fnAddWindow(this,\"addWidgetDropDown\");']"));
		Select RSS = new Select(plus);
		RSS.selectByIndex(1);

//	    System.out.println(noData);
//	      if (noData.contains("No Data Found")) {
//	   	  System.out.println("pass");
//	      }else {
//	      System.out.println("fail");
//	           }
//	    crome.findElement((By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"))).click();    //$$   it is click on plus mark
//	    String g=  crome.findElement(By.xpath("//td[@class='moduleName']")).getText();    //**     my home page
//	    System.out.println(g);                                                            //**  

//	    String i= crome.findElement(By.xpath("//a[text()='Webmail']")).getText();          //%%
//	    if(i.equalsIgnoreCase(i)) {                                                        //%%
//		     System.out.println("pass ba ho");}                                               //%%     webMail print or not
//		   else {                                                                           //%%
//	     System.out.println("fail ba ho");                                                  //%%
//		         }                                                                           //%%
//	     crome.findElement(By.xpath("//a[text()='Webmail']")).click();                    //%%     webMail open

//	     crome.findElement(By.xpath("//a[text()='Calendar']")).click();                    //**    calendar

//	     crome.findElement(By.xpath("//img[@border='0']"));                                //**     calendar  and press forward button
//	     crome.findElement(By.xpath("//td[@class='moduleName']"));                         //**     sales

//	     crome.findElement(By.xpath("//a[text()='Marketing']")).click();                   //**     marketing
//	     boolean a =crome.findElement(By.xpath("//img[@alt='Show World Clock...']")).isDisplayed();//isEnable* //world Clock sow/no  
//	     System.out.println(a);

		boolean m = driver.findElement(By.xpath("//input[@onclick='check_object(this)']")).isSelected();
//	     System.out.println(m);

//	     String g= crome.findElement(By.xpath("//input[@value='Delete']")).getText();
//	     System.out.println(g+"yahi hai");

//	     String j=  crome.findElement(By.xpath("//input[@value='Search...']")).getText();
//	     System.out.println(j+"yes,this is");

//	      String  jk=crome.findElement(By.xpath("//td[text()='Filters :']")).getText();
//	      if (jk.equalsIgnoreCase("Filters :")) {
//	    	System.out.println("filter testing is passed");
//	    } else {
//	    	System.out.println("filter testing is fail");
//	           }
//	      Dimension in=crome.findElement(By.xpath("//b[text()='In']")).getSize();
//	      System.out.println(in);

//	      String inn = crome.findElement(By.xpath("//b[text()='In']")).getText();
//	      System.out.println(inn);  

//	      Point location= crome.findElement(By.xpath("//input[@value='Delete']")).getLocation();
//	      int lction  =   location.getX();
//	      int lcton    =   location.getY();
//	      System.out.println("X ="+lction+","+"Y ="+lcton);

//	      String find = crome.findElement(By.xpath("//input[@value='Find']")).getText();
//	      System.out.println("value of find  "+find);

		String b = driver
				.findElement(By.xpath("//a[@href='index.php?module=Webmails&action=index&parenttab=Marketing']"))
				.getTagName();
		System.out.println(b);

//	      crome.findElement(By.xpath(""))   

//	      Dimension f =crome.findElement(By.xpath("//img[@alt='Show World Clock...']")).getSize(); ////  
//	      int hight=  f.getHeight();                                                                ////
//	      int wide=    f.getWidth();                                                                 ////    world clock hight
//			System.out.println(hight+","+wide) ;                                                      ////

//	      boolean  act= crome.findElement(By.xpath("//img[@src='themes/images/tbarImport-Faded.gif']")).isEnabled();
//	      System.out.println(act);
//	      boolean ext=false;
//	      if(act==true) {
//	      System.out.println("sahi ba");
//	      }else {
//	      System.out.println("galat ba");
//	             }   	  
//	      crome.findElement(By.name("search_text")).clear();                             // **
//	      crome.findElement(By.name("search_text")).sendKeys("CAM1");                    // **     
//	      crome.findElement(By.id("bas_searchfield")).clear();                           // **        compaigen name and inbox code
//	      crome.findElement(By.id("bas_searchfield")).click();                           // **
//	      crome.findElement(By.name("submit")).click();                                  // **

//	      String a=  crome.findElement(By.xpath("")).getText();

//	      String t=crome.findElement(By.xpath("//input[@value=' Search Now ']")).getText();    //&&
//	      System.out.println(t+"hii");
//	      if (t.equalsIgnoreCase("Search Now")) {
//	    	System.out.println("it is pass");                                                     //&&     second search box
//	      } else {
//	    	       System.out.println("it is fail");
//	              }                                                                                         //&&
//	       String a=crome.findElement(By.className("moduleName")).getText();       //##
//	       System.out.println(a);                                                  //##
//	       if(a.equalsIgnoreCase("search")) {                                      //##
//	    	 System.out.println("it is right searched");                              //##    search code upon the
//	        }  else {                                                               //##    go to advance search                                                                          //##
//	       System.out.println("it is not right search");                            //##
//	             }                                                                       //##
//	      crome.findElement(By.xpath("//span[@class='moduleName']")).click(); 

//	      crome.findElement(By.xpath("//a[text()='Go to Advanced Search']")).click();            //**                                                                                                **
//	      crome.findElement(By.xpath("//input[@class='detailedViewTextBox']")).clear();          //**     go to advance search code
//	      crome.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("hi");   //**

//	      crome.findElement(By.xpath("//input[@class='crmbutton small create']")).click();       //**

//	      crome.findElement(By.xpath("//a[text()='Sales']")).click();                             //**     click on sales
//	      Thread.sleep(300000);
//	      crome.close();
	}
}
