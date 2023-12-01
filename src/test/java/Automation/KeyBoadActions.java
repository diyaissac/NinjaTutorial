package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoadActions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
//keyboard actions		
// modifier keys / functions keys are the keys in keyboard except alphanumeric keys, eg: ctrl, delete, shift , etc.

		//option 1
	WebElement Search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	Search.sendKeys("Numpy Ninja" +Keys.ENTER); // it will helps to enter the text using  keyboard
	Search.clear();

	
	   //option2 - Action class --> it helps to automate keyboard and mouse functions using shortcuts
	  // for alphanumerickeys use sendkeys method and for modifier keys use modifier key method
	  //here there are two sendkeys  --> 1) sendkeys(with elements and text) 2) sendkeys (with just text) --> when you just want to do the shortcut
	Actions action = new Actions(driver);
	//action.keyDown(Keys.CONTROL).sendKeys("A").perform(); // In case of Mac use command instead control
	// In action class we have sendkeys(elements, "text") --> this mainly used when you want to enter something in an element using shortcut
	action.keyDown(Keys.SHIFT).sendKeys(Search,"selenium").keyUp(Keys.SHIFT).sendKeys(Search," classes" + Keys.ENTER).perform();
	
	
	
	
	// for fileUpload() {
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm#");
		
		WebElement photo = driver.findElement(By.name("photo"));
		photo.sendKeys("/Users/vijayabharathi/Downloads/Meetup 35 Posters.png");
		
		
		
		
	
		
		
	}
	
	
	
	
	}


