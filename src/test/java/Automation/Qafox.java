package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// to locate the element from child to parent  --> /..
public class Qafox {

	public static void main(String[] args) {
	  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		driver.findElement(By.xpath("//a[text() = 'Laptops & Notebooks']")).click();   // helps to locate using text
		driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		
//  to  select hp laptop		
		//driver.findElement(By.xpath("//a[text() = 'HP LP3065']/../../..//span[text() ='Add to Cart']")).click();
		// here '/..' is used to go from child to parent 
		
//		WebElement element = driver.findElement(By.xpath("//h5[text()='Customer Service']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;   // for scrolling till the required element
//       js.executeScript("arguments[0].scrollIntoView();", element);
//      element.click();
        
		//driver.findElement(By.xpath("//*[contains(text(),'Add to Cart')]")).click();
		//driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		
//   to add iphone to cart
		driver.findElement(By.xpath("//a[text()='Phones & PDAs (3)']")).click();
		WebElement iphone = driver.findElement(By.xpath("//a[text()='iPhone']/../../../..//span[text()='Add to Cart']"));
		iphone.click();
		driver.findElement(By.xpath("//div[@id='cart']/button")).click();
		
		
		
	}

}
