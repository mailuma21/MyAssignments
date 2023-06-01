package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassActivity {

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
	     
	     //select class
	     WebElement cd = driver.findElement(By.id("createLeadForm_industryEnumId"));
	     Select op = new Select(cd);
	     op.selectByValue("IND_AEROSPACE");
	     
	     WebElement cd1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     Select op1 = new Select(cd1);
	     op1.selectByIndex(4);
	     
	     WebElement cd2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	     Select op2 = new Select(cd2);
	     op2.selectByVisibleText("Alabama");
	     
	}

}
