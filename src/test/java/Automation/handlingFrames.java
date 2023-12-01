package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFrames {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 //frames --> html inside another html(site inside another site)
		 //  three ways to switch to frames 
		 
		 driver.switchTo().frame(3);// index starts from 0
		 //driver.switchTo().frame("a077aa5e"); // name or id can only be used
		 //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));//using xpath
/*		 
we can switch from any window to another window at any time.
 we need to follow the parent> child> sub child hierarchy while switching to the inner frame
Switch to parent frame -> will go to immediate parent frame	
switch to default content -> outer most frame/ 1st frame/ default frame
*/
		 WebElement jmeterLink = driver.findElement(By.xpath("/html/body/a"));
		 jmeterLink.click();
		 
		 driver.switchTo().parentFrame();// moves to the nearest outer frame (in to out)
		 driver.switchTo().defaultContent(); // moves to outer html(in to out)/ default content
	
		 
		 // eg:
		 //driver.switchTo().frame("001");// basically works from out to in
			//frame-1  id - 0001
			//frame-2  id - 0002
			//frame-3  id - 0003
			//frame-4  id - 0004
			
//			driver.switchTo().frame("0001"); //it will move to frame1
//			driver.switchTo().frame("0002"); //it will move to frame2
//			driver.switchTo().frame("0003"); //it will move to frame3
//			driver.switchTo().frame("0004"); //it will move to frame4
//			
//			driver.switchTo().parentFrame(); //it will move to frame3
//			driver.switchTo().parentFrame(); //it will move to frame2
//			driver.switchTo().parentFrame(); //it will move to frame1
	
	
	}

}
