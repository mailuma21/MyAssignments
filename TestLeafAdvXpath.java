package week3.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration; 
public class TestLeafAdvXpath {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']/following::input")).sendKeys("crmsfa");
	
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();  
		
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
	   driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[1]")).sendKeys("TestLeaf1");
	    driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[3]")).sendKeys("Sai");
	     driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input")).sendKeys("Ramfwrgfr");
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a")).click();
		 driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[1]")).clear();
		 driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[1]")).sendKeys("TestLeaf2");
		 driver.findElement(By.name("submitButton")).click();
	}

}
