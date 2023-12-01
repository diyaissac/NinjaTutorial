package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NumpyNinja {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriver Driver = new SafariDriver();
              driver.get("https://www.numpyninja.com/");
              driver.findElement(By.id("comp-l19k7i034label")).click();
              WebElement frstName = driver.findElement(By.name("first-name"));
              frstName .sendKeys("Eivya R");
              WebElement LstName = driver.findElement(By.name("last-name"));
	          LstName.sendKeys(" Issac");
	          
	          driver.findElement(By.id("input_comp-l1c0ku03")).sendKeys("sjdfbuerbfue@gmail.com");
	          driver.findElement(By.id("input_comp-l1c0ku05")).sendKeys("983725670");
	          driver.findElement(By.id("comp-l1c0ku0e3")).click();
	
	
	}

}
