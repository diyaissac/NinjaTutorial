package Automation;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.Select;


public class DriverCapabilitiesandcoreFunctions {
	
    public void browseroptions() {
	 ChromeOptions chrmoptns = new ChromeOptions();   // These are driver options / browseroptions  --> used to improve the stability of test execution 
	 //FirefoxOptions firfxoptn = new FirefoxOptions();                                                 //and reduce random failures
	 //SafariOptions safarioptns = new SafariOptions(); /// In case if browser option is used , use it prior to the intialization of driver
	 
// This will make selenium Webdriver to wait for the entire page gets loaded while launching
	 chrmoptns.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	 
//This capability checks whether an expired or invalid TLS certicate is used while navigating  
	 chrmoptns.setAcceptInsecureCerts(true);

//specify when to interrupt an executing script in a current browsing condition
	 chrmoptns.setScriptTimeout(Duration.ofSeconds(30));  //for backend loading
	 
//time interval to wait for the webpage to load in a current browser
	 chrmoptns.setPageLoadTimeout(Duration.ofMillis(30000));// for HTML loading

//time interval to locate the element
	 chrmoptns.setImplicitWaitTimeout(Duration.ofSeconds(30));// for elements
	 
//adding chrome extensions with WebDriver
//chrmoptns.addExtensions(new File("/path/to/extension.crx"));
	 
	 chrmoptns.addArguments("start-maximized"); // to start the browser in maximize mode
	 chrmoptns.addArguments("--incognito");     // to start browser in incognito mode
	// chrmoptns.addArguments("--headless"); // invisible mode of extension -- it helps to do multiple things while automating the website which means we can result in cosole but not able to see the launching the working of web application
	 
	//WebDriver driver = new ChromeDriver();
	 
	WebDriver driver = new ChromeDriver(chrmoptns);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://cosmocode.io/automation-practice/");
	
	System.out.println(" current title of the page = "+ driver.getTitle());
	System.out.println("current URL of the page  = "+ driver.getCurrentUrl());
	driver.navigate().to("https://www.selenium.dev"); //to navigate
	 
	System.out.println(" current title of the page = "+ driver.getTitle());
	System.out.println("current URL of the page  = "+ driver.getCurrentUrl());
     
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	
	driver.close();
	driver.quit();
    
    
    }
    
    public void methods() {
// to find multiple elements of same property there is a method
//findelements()--> it wont throw exception 
//findelement will throw exception of no such element found
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://cosmocode.io/automation-practice/");
    	
    	List<WebElement> diyalink = driver.findElements(By.linkText("diya"));
    	if(diyalink.size()>=1) {               // means if that element is more than or equal to 1
    		driver.findElement(By.linkText("diya")).click();
    	}
    	
    	
// just to make it clear    
//---------------------------   	
//    	List<WebElement> diyalink = driver.findElements(By.linkText("diya"));
//    	if(diyalink.size()>=1) {
//    		driver.findElement(By.linkText("diya")).click();
//    		System.out.println("clicked the link");
//    	}
//    	else {
//    		System.out.println("no such links are available");
    	//   	}
    	
//diya is a dummy link which is not present in this website  . This method is mainly used for finding links, images
// and whenever its not sure  an element is available or not.    	
    	
//-------------------------------------------------------------    	
    
    	WebElement element = driver.findElement(By.id("firstname"));// getattribute is to get the html properties 
    	String length =element.getAttribute("maxlength");// maxlength is one of the property, to check the property we use get attibute
        System.out.println("length of the textbox =" + length);
//likewise
        String  fontfamily =  element.getCssValue("font-family"); // getcssvalue for getting the css properties
        System.out.println("font family of the textbox =" +  fontfamily);
    
    
   if(element.isDisplayed() && element.isEnabled()) {
	   element.click();
	   element.sendKeys("diya");
   } 
    
  // to get location of element in case of scrolling --> getlocation().x and getlocation.y
   System.out.println(element.getLocation().x); 
   System.out.println(element.getLocation().y); 
    
   
// to get a text 
   WebElement textvalue = driver.findElement(By.xpath("/html/body/h1"));
   String text= textvalue.getText();
   System.out.println(text);
    
    
// to get height, width and x , y coordinates
    int x = element.getRect().x;
    int y = element.getRect().y;
    int len = element.getRect().width;
    int height = element.getRect().height;
    
    
//handle dropdown in 3 ways
    //way-1
 WebElement selectbox = driver.findElement(By.name("age"));   
  selectbox.findElement(By.xpath("//optoins[text()='under 20']")).click();  
    
   //way-2  
 List<WebElement> options = driver.findElements(By.xpath("//select/option"));
 for(WebElement option :options) { //array
	 if(option.getText().equalsIgnoreCase("under 30")) {
		 option.click();
	 }
 }
 
   //way-3( thus method is most suitable when the desired option in a select tag
 WebElement selectelemnt = driver.findElement(By.name("age"));
 Select dropdown = new Select(selectelemnt); // this the most suitable method
                          //select is built in class , so create the object
 dropdown.selectByIndex(4);
 dropdown.selectByVisibleText(" Under 30");
 dropdown.selectByValue("20 to 29");
  
  
  
    }
	 public static void main(String[] args) {
		 DriverCapabilitiesandcoreFunctions obj = new DriverCapabilitiesandcoreFunctions();
		 //obj.browseroptions();
         obj.methods();
	}

}
