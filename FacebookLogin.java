import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions popupeliminater = new ChromeOptions();
		popupeliminater.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(popupeliminater);
		
		
		
		//To invoke a browser 
		driver.get("https://www.facebook.com/");
		// To open Facebook

		System.out.println(driver.getTitle());
		// To Print the Title of the page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//By using Implicit wait , asking the browser to wait for 5 sec
		
		driver.findElement(By.id("email")).sendKeys("83189553923");
		//sending the keys to the email
		
		driver.findElement(By.name("pass")).sendKeys("Y17cs016@");
		// sending the password keys
		
		driver.findElement(By.name("login")).click();
		// giving the instruction to click
		
		//driver.findElement(By.linkText("Find your account and log in.")).click();
		//using link text to 
		
		
		System.out.println(driver.getTitle());
		// To Print the URL of the page
		
		driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		//driver.findElement(By.cssSelector("Rqir3aj9emhpapd5aq")).click();  :Rqir3aj9emhpapd5aq:

		driver.findElement(By.xpath("(//span[normalize-space()='Log out'])[1]")).click();
		
		//(//i[@class='x1b0d499 xep6ejk'])[5]

		System.out.println(driver.getCurrentUrl());

	}

}
