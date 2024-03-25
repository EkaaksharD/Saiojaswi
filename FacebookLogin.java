import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions popupeliminater = new ChromeOptions();
		popupeliminater.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(popupeliminater);
		
		
		
		//To invoke a browser 
		driver.get("https://www.facebook.com/");
		// To open Facebook
		//haihdhdjdjjdvmfkndkvmdnkmvdv,dlvm,
		//new comment
		

		System.out.println(driver.getTitle());
		// To Print the Title of the page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//By using Implicit wait , asking the browser to wait for 5 sec
	}

}
