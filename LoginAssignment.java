package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.id("username")).sendKeys("demosalesManager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sai");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9962293005");
	     driver.findElement(By.className("smallSubmit")).click();
		}
		
	




	}

