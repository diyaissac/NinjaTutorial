package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JuiceShope {
        
	public static WebDriver driver;
	 
	 
	String URL ="https://juice-shop.herokuapp.com/#/login";
	
		By cookies         = By.xpath("//a[@class='cc-btn cc-dismiss']");
		By dismissBtn      = By.xpath("//*[text()=' visibility_off ']");
		By signInBtn       = By.xpath("//*[text()='Not yet a customer?']");
		By Email           = By.xpath("//input[@id='emailControl']");
		By password        = By.xpath("//input[@id='passwordControl']");
		By resetPassword   = By.xpath("//input[@id='repeatPasswordControl']");
		By securityquestn  = By.xpath("//mat-select[@id='mat-select-0']");  
		By question        = By.xpath("//mat-option[@id='mat-option-2']");
		By answer          = By.xpath("//input[@id='securityAnswerControl']");
		By register        = By.xpath("//*[text()=' Register ']");
		
		
		By emailID         = By.xpath("//input[@id='email']");
		By PassWord        = By.xpath("//input[@id='password']");
		By logInBtn        = By.xpath("//button[@id='loginButton']");
		
		
		By addToBasket1 = By.xpath("//div[text()=' Apple Pomace ']/../../../div[2]//button");
		By scroll1      = By.xpath(" //div[@class='mat-paginator-page-size-label']");
		By nxtPage1     = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/mat-paginator/div/div/div[2]/button[2]");
		By addToBasket2 = By.xpath("//div[text()=' OWASP Juice Shop Hoodie ']/../../../div[2]//button");
		By scroll2      = By.xpath("//div[@class='mat-paginator-page-size-label']");
		By nxtPage2     = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-next mat-icon-button mat-button-base']");
		By addToBasket3 = By.xpath("//div[text()=' Pwning OWASP Juice Shop ']/../../../div[2]//button");
		By scroll3      = By.xpath("//div[@class='mat-paginator-page-size-label']");
		
		
		By basketBtn    = By.xpath("//button[@class='mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted']");
		By quantity1    = By.xpath("//*[text()=' Apple Pomace ']/../mat-cell/button[2]");
		By quantity2    = By.xpath("//mat-cell[text()=' OWASP Juice Shop Hoodie ']/../mat-cell[3]/button[2]/span[@class='mat-button-wrapper']");
        By quantity3    = By.xpath("//mat-cell[text()=' Pwning OWASP Juice Shop ']/../mat-cell[3]/button[2]/span[@class='mat-button-wrapper']");
		By Scroll4      = By.xpath("//*[text()='You will gain 0 Bonus Points from this order!']");
		By checkOut     = By.xpath("//button[@id='checkoutButton'] ");  //button[@id='checkoutButton']/span[3]
		
		
		By addAdress    = By.xpath("//h1[text()='Select an address']/..//*[text()='Add New Address']");
		By country      = By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-12']");  //input[@id='mat-input-1']
		By name         = By.xpath("//input[@id='mat-input-2']");
		By mobileNumber = By.xpath("//input[@id='mat-input-3']");//input[@id='mat-input-3']
		By zipCode      = By.xpath("//input[@id='mat-input-4']");
		By aDDress      = By.xpath("//textarea[@id='address']");
		By city         = By.xpath("//input[@id='mat-input-6']");
		By state        =By.xpath("//input[@id='mat-input-7']");
		By submitBtn    = By.xpath("//button[@id='submitButton']");
		
	public void Register() throws InterruptedException {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get(URL);
         
         driver.findElement(cookies).click();
         driver.findElement(dismissBtn).click();
         Thread.sleep(10000);
         driver.findElement(signInBtn).click();
         driver.findElement(Email).sendKeys("bhaijh4@gmail.com");
         driver.findElement(password).sendKeys("pasword@34");
         driver.findElement(resetPassword).sendKeys("pasword@34");
         driver.findElement(securityquestn).click();
         Thread.sleep(30000);
         driver.findElement(question).click(); //error here
        // Thread.sleep(3000);
         driver.findElement(answer).click();
         driver.findElement(answer).sendKeys("merlin");
         driver.findElement(register).click();	


	 
	    driver.findElement(emailID).click();
	    driver.findElement(emailID).sendKeys("bhaijh4@gmail.com");
	    driver.findElement(PassWord).click();
	    driver.findElement(PassWord).sendKeys("pasword@34");
	    driver.findElement(logInBtn).click();


	
	    driver.findElement(addToBasket1).click();
	    driver.findElement(scroll1);
	    Thread.sleep(7000);
	    driver.findElement(nxtPage1).click();
	    driver.findElement(addToBasket2).click();
	    driver.findElement(scroll2);
	    driver.findElement(nxtPage2).click();
	    driver.findElement(addToBasket3).click();
	    driver.findElement(scroll3);
//	    JavascriptExecutor js = (JavascriptExecutor) driver;   
//	    js.executeScript("arguments[0].scrollIntoView();",checkOut );


    driver.findElement(basketBtn).click();
    driver.findElement(quantity1).click();
    driver.findElement(quantity2).click();
    driver.findElement(quantity3).click();
    Thread.sleep(10000);
//    driver.findElement(checkOut);
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    driver.findElement(checkOut);
//    js.executeScript("arguments[1].scrollIntoView();",checkOut );
//    driver.findElement(checkOut).click();
//    driver.findElement(Scroll4);
    driver.findElement(checkOut).click();
    
    
	driver.findElement(addAdress).click();
	//driver.findElement(country).click();
	//driver.findElement(country).sendKeys("India");
	driver.findElement(name).clear();
	driver.findElement(name).sendKeys("anju");
	driver.findElement(mobileNumber).clear();
	driver.findElement(mobileNumber).sendKeys("9887656785");
	driver.findElement(zipCode).clear();
	driver.findElement(zipCode).sendKeys("98755");
	driver.findElement(aDDress).clear();
	driver.findElement(aDDress).sendKeys("ROSEMARY APARTMENT , APT 23 , NEAR KALAMASERRY Road, Ernakulam");
	driver.findElement(city).clear();
	driver.findElement(city).sendKeys("Edachira");
	driver.findElement(state).clear();
	driver.findElement(state).sendKeys("Kerala");
	driver.findElement(submitBtn).click();
	

	
	

	}

public static void main(String[] args) throws InterruptedException {
	JuiceShope  obj = new JuiceShope();

	            obj.Register();
	           
	          
	           
	
}	           
}
