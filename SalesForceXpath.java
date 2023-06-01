package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SalesForceXpath {

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
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
	
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		
	}

}
