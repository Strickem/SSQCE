package basharsoft.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstScript {

	
	
	ChromeDriver senku;
	WebElement username;
	@BeforeTest
	public void opensite() {
	
	
	String taiju;	
	taiju = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";	
	System.setProperty("webdriver.chrome.driver", taiju);
	senku = new ChromeDriver();	
	senku.navigate().to("http://todomvc.com/examples/emberjs/");
	}

	@Test
	public void script() throws InterruptedException {
		
		
	    WebElement search = senku.findElement(By.id("new-todo"));	   
	    
	    search.clear();
	    search.sendKeys("google");
	    search.sendKeys(Keys.RETURN);
	    Thread.sleep(2500);
	    
	    search.clear();
	    search.sendKeys("youtube");
	    search.sendKeys(Keys.RETURN);
	    Thread.sleep(2500);
	    
	    WebElement edit = senku.findElement(By.id("toggle-all"));
	    edit.click();
	    Thread.sleep(2500);
	    
	    WebElement clear = senku.findElement(By.id("clear-completed"));
	    clear.click();
	
	    search.clear();
	    search.sendKeys("facebook");
	    search.sendKeys(Keys.RETURN);
	    Thread.sleep(2500);
	    
	    
	    WebElement active = senku.findElementByLinkText("Active");
	    active.click();
	    Thread.sleep(2500);

	    WebElement Completed = senku.findElementByLinkText("Completed");
	    Completed.click();
	    Thread.sleep(2500);
	    
	    WebElement all = senku.findElementByLinkText("All");
	    all.click();
	    Thread.sleep(2500);
	    
	    WebElement editing = senku.findElement(By.id("todo-list"));
	    Actions builder = new Actions(senku);
	    builder.doubleClick(editing).perform();
	    
	    
	}
			
	
	@AfterTest
	public void close() {
senku.quit();
		
	}

	
	
}
