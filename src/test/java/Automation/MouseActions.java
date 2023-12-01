package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.get("");
      Actions actn = new Actions(driver);
      
     WebElement element= driver.findElement(By.xpath(""));
     actn.click().perform(); // no need
     actn.click(element).perform();  // it will automatically scroll to the element and click
     
     actn.moveToElement(element).perform(); // just mouse hover
     
     actn.clickAndHold(element).perform();
     actn.clickAndHold().perform();
     
     actn.contextClick(element).perform();
     actn.contextClick().perform();// right click
     
     actn.doubleClick(element).perform();
     actn.doubleClick().perform();
     
     actn.dragAndDrop(element, element).perform();
     
     
 ///click and hold example
    actn.moveToElement(element).clickAndHold(element).moveByOffset(100, 100).perform();
    actn.moveToElement(element).clickAndHold(element).moveByOffset(-100, -100).perform(); // to go back to the orginal place	
// to scroll
    actn.scrollByAmount(94, 3660).perform();
    actn.scrollToElement(element).perform();// another method

    System.out.println(element.getRect().getX());// to get coordinates
	System.out.println(element.getRect().getY());//or
	
	actn.scrollByAmount(element.getRect().getX(), element.getRect().getY()).perform();
	actn.scrollByAmount(66, 3279).perform(); 
	
	// for sliding
	actn.moveToElement(element).clickAndHold(element).moveByOffset(100, 0).perform();
	actn.moveToElement(element).clickAndHold(element).moveByOffset(-200, 0).perform();
	
	actn.scrollByAmount(0, 0);// IT Is only applicable in chromium browsers(chrome , edge), so to use scroll in everything browser use javascript
	// scroll only works in chromium browser , 
	// javascriptexecuter can be used as a last option , in browserstack there are so many javascript executer actions like click, sendkeys etc,
	// it works in every browser
	
	//Java Script Executor scroll
			((JavascriptExecutor)driver).executeScript("window.scrollBy(100,1000)");
			//https://www.browserstack.com/guide/javascriptexecutor-in-selenium
			
	
	
	
	
	
 }    
     
     
     
	}


