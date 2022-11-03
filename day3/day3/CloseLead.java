package week2.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CloseLead {
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();	
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		
		// Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.xpath("(//div[@class='controls']/input)[1]")).sendKeys("kumar.testleaf@gmail.com");
        
		//Enter Password as "leaf@12"
		driver.findElement(By.xpath("(//div[@class='controls']/input)[2]")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println(title);
		
		// Click on Log Out
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		
		driver.close();

}
}
