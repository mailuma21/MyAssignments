package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		//EdgeDriver driver= new EdgeDriver();
		//2. load the URL
		driver.get("https://login.salesforce.com/");
		//3. to max the screen
		driver.manage().window().maximize();
		
		//wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("hari.radhakrishnan@qeagle.com");
		
	//driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Leaf@1234");
	driver.findElement(By.xpath("label[@id='password']/following-sibling::input")).sendKeys("Leaf@1234");
	driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
	}
	//1.P-c
	//basic xpath/tagname of child
	//div[@id='form']/form
	//2.gp-gc
	//basic xpath gp//tagname of gc
	//form[@id='login']//input
	//li[@class='navlink']//span[contains(text(),'Men')]
	//3. c-P
	//basic xpath forchild/parent::tag name of tag
	//input[@id='createLeadForm_companyName']/parent::td
//	4.gc-gp
	//basic xpath for gc/ancestor::tagname gp
	
	//basic xpath ES/following-sibling::tagname YS
	//span[@class='labelIcon']/following-sibling::span
	//input[@id='password']/ancestor::form
	
	
}
