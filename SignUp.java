package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://sg-app.abouv.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Skip']")));
		elementToClick.click();
	
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7338511452");
		JavascriptExecutor js =(JavascriptExecutor)driver;
	        WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Continue']"));
    	        js.executeScript("arguments[0].click()",continueBtn);
    	
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("5");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("6");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("7");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("8");
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
	        driver.findElement(By.xpath("//p[text()='Search Engine']")).click();
	        driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
	        driver.findElement(By.xpath("//p[text()='Exploring Opportunities']")).click();
	        driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
	        driver.findElement(By.xpath("//p[text()='Job Opportunities']")).click();
	        driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
		driver.findElement(By.xpath("//button[text()='Continue with email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohanjh23@gmail.com");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("2");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("3");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("4");
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("5");
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("rohan");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("rocky");
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("50034");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
			
	}

}
