package sharebus.co.AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareBus {
	@Test
	
	public void myFirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		  
		driver.get("https://test.sharebus.co");
		 
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//button[normalize-space()='Sign in']" ));
		signin.click();
		
		WebElement email = driver.findElement(By.cssSelector( "input[id='email']"));
		email.sendKeys("brainstation23@yopmail.com");
		
		WebElement password = driver.findElement(By.cssSelector( "input[id='password']"));
		password.sendKeys ("Pass@1234");
		 
		WebElement submit_btn = driver.findElement(By.cssSelector("button[type='submit']" ));
		submit_btn.click();
		 
		WebElement dropdown = driver.findElement(By.xpath( "//div[@class='p-dropdown p-component p-inputwrapper p-inputwrapper-filled w-50']"));
		dropdown.click( );
		 
		Select selectObject= new Select (dropdown);  
		selectObject.selectByVisibleText("Sharelead");
		  
		 
		WebElement continue_btn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-success text-white align-self-center rounded-pill fw-bolder px-4 my-3 d-flex justify-content-between align-items-center mt-3']" ));
		continue_btn.click();
		 
		WebElement setup_btn = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/button[1] " ));
		setup_btn.click();
		
		driver.findElement(By.id("startPoint" )) .sendKeys ("Oslo, Norway");
		 
		driver.findElement(By.id("destination" )) .sendKeys ("Kolbotn, Norway"); 
		 
		driver.findElement(By.xpath("//input[@placeholder='Departure Date']" )).click();
		 
		driver.findElement(By.xpath("//span[normalize-space()='12']" )).click();
		 
		driver.findElement(By.xpath("//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly p-inputwrapper-filled']//input[@placeholder='Time']" )).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Return Date']" )).click();
		
		driver.findElement(By.xpath("//span[@class='p-highlight']" )).click();
		
		driver.findElement(By.xpath("//div[@class='row my-4']//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly p-inputwrapper-filled']//input[@placeholder='Time']" )).click();
		
		driver.findElement(By.cssSelector("button[type='submit']" )).click();
		
		
		
		Thread.sleep(5000); 
		 
		driver.quit();
	}

}
