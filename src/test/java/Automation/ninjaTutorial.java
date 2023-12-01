package Automation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ninjaTutorial {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions chrmoptns = new ChromeOptions();
		 chrmoptns.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 chrmoptns.setAcceptInsecureCerts(true);
		 chrmoptns.setScriptTimeout(Duration.ofSeconds(30));
		 chrmoptns.setPageLoadTimeout(Duration.ofMillis(50000));
	     chrmoptns.setImplicitWaitTimeout(Duration.ofSeconds(10));
		 chrmoptns.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(chrmoptns);
//1.Launch the application
		driver.get("https://tutorialsninja.com/demo/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//i[@class='fa fa-caret-down']")));	
//		
//2. Currency to Euro
		driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
		WebElement currency = driver.findElement(By.xpath("//button[@name='EUR']"));
		currency.click();
		
		
	
//3.Order canon EOS 5D Camera			
		
//		 WebElement addtoCart = driver.findElement(By.xpath("//a[text() ='Canon EOS 5D']/../../..//span[text()='Add to Cart']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;   // for scrolling till the required element
//        js.executeScript("arguments[0].scrollIntoView();", addtoCart);
//        addtoCart.click();
      
        WebElement canonEOS5D = driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;   // for scrolling till the required element
        js.executeScript("arguments[0].scrollIntoView();", canonEOS5D);
        canonEOS5D.click();
        
        WebElement addtoCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;   // for scrolling till the required element
        js1.executeScript("arguments[0].scrollIntoView();", addtoCart);
        
        WebElement selectelemnt = driver.findElement(By.xpath("//select[@id='input-option226']")); 
        selectelemnt.click();
        
        Select dropdown = new Select(selectelemnt); 
        List<WebElement> options = dropdown.getOptions();
    	if(options .size()>=1) {               // means if that element is more than or equal to 1
    		System.out.println("In select option there is only " +options.size() + " invaild  option" );
    	}
    	else {
    		System.out.println("In select option there is no option available");
    	}
    	
        
        addtoCart.click();
        
       
       
 // 4.Back to home screen and click iphone nd go to details screen, change the quantity to two then add to cart.
        WebElement Qafox = driver.findElement(By.xpath("//a[text()='Qafox.com']"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;   
        js2.executeScript("arguments[0].scrollIntoView();", Qafox);
        
        WebElement returnToHomePg = driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[1]/a"));
        returnToHomePg.click();
        WebElement iphone = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[6]/a[text()='Phones & PDAs']"));
        iphone.click();
        
        WebElement Iphone = driver.findElement(By.xpath("//a[text()='iPhone']"));
        JavascriptExecutor js3 = (JavascriptExecutor) driver;   // for scrolling till the required element
        js3.executeScript("arguments[0].scrollIntoView();", Iphone);
        WebElement addToCart = driver.findElement(By.xpath("//div[@class ='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//a[text()='iPhone']"));
        addToCart.click();
        
        WebElement quantity = driver.findElement(By.name("quantity"));
        quantity.clear();
        quantity.sendKeys("2"); 
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
        
        
        
       
//E
        
//5.Print success message in console
        WebElement SuccessMsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        String msg = SuccessMsg.getText();
        System.out.println("The success Message is -> " + msg); // why throwing no such element execption
        
        
//6.Click on the cart icon (black color) in the right side top then click view cart        
        WebElement cartIcon = driver.findElement(By.xpath("//span[@id='cart-total']"));
        cartIcon.click();
        WebElement viewCart = driver.findElement(By.xpath("//*[text()='View Cart']")); 
        viewCart.click();// 
        
        
        
//7.Change the quantity of iphone to 3 and click update button 
        WebElement quanty = driver.findElement(By.xpath("//div[@class='input-group btn-block']//input"));
        quanty.click();
        quanty.clear();
        quanty.sendKeys("3");
        WebElement update = driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
        update.click();
        
        
//8. print the Eco tax and VAT Amount in console and click Checkout button
        WebElement scroll = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        JavascriptExecutor js4 = (JavascriptExecutor) driver;   
        js4.executeScript("arguments[0].scrollIntoView();",scroll );
        
      WebElement EcoTax = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]"));
      String taxvalue = EcoTax.getText();
      System.out.println("The Eco tax of the product : "+taxvalue);
      
      WebElement VacAmount = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]"));
      String Amount = VacAmount.getText();
      System.out.println("The VAC Amount of the product : "+Amount);
      
      
      
      
//9. print the error message and remove the product from the cart
      WebElement Errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
      String Emsg = Errormsg.getText();
      System.out.println("The error message is : "+Emsg);
      
      driver.findElement(By.xpath("//span[@id='cart-total']")).click();
      WebElement removeButton = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-xs']"));
      removeButton.click();
      WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
      continueButton.click();
      
      
      
// 10.Move to the home screen and click on Mac book, check the default quantity is 1 
// and click add to cart then verify success message
//        driver.navigate().back();
//        driver.navigate().back();
      
        //driver.findElement(By.xpath("//*[@id=\"error-not-found\"]/ul/li[1]")).click();
        WebElement MacBook = driver.findElement(By.xpath("//a[text()='MacBook']"));
        JavascriptExecutor JS = (JavascriptExecutor) driver;   
        js.executeScript("arguments[0].scrollIntoView();",MacBook  );
        MacBook.click();
      
        WebElement q = driver.findElement(By.xpath("//input[@id='input-quantity']"));
        String Macquantity = q.getAttribute("value");
        
        if(Macquantity.equals("1")) {
        System.out.println("Default quantity of MacBook is one");
        
        }
        else
        {
        	System.out.println("The Default quantity of macbook is not 1");
        }
       
       driver.findElement(By.xpath("//button[@id='button-cart']")).click(); // addtocartbutton
       WebElement SucesMsg = driver.findElement(By.xpath("//*[text()='Success: You have added ']"));
       String msgs = SucesMsg.getText();
       System.out.println(" The success message of adding Macbook to cart is : " +msgs);

        
//11.  Click on the shopping cart link in the top and apply ABCD123 as coupon code to check, 
//     print error message
       
        WebElement ShoppingCart = driver.findElement(By.xpath("//ul[@class='list-inline']/li[4]//a"));
        ShoppingCart.click();
        
        WebElement UseCoupon = driver.findElement(By.xpath("//*[text()='Use Coupon Code ']"));
        UseCoupon.click();
        WebElement CouponCode = driver.findElement(By.xpath("//input[@id='input-coupon']"));
        CouponCode.sendKeys("ABCD123");
        WebElement AppyButton = driver.findElement(By.xpath("//input[@id='button-coupon']"));
        AppyButton.click();
        WebElement WarningMsg =driver.findElement(By.xpath("//*[text()=' Warning: Coupon is either invalid, expired or reached its usage limit!']"));
        String WMsg = WarningMsg.getText();
        System.out.println("Warning msg after applying coupon is : "+ WMsg);
        
        
        
        
        
        
//12. Enter AXDFGH123 as gift certificate and perform apply to check, print error message
        Thread.sleep(3000);
      WebElement scroll1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
      JavascriptExecutor js5 = (JavascriptExecutor) driver;   
      js5.executeScript("arguments[0].scrollIntoView();",scroll1 );
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id='accordion']/div[2]/div/h4/a"))).click();
        
         
         WebElement  GiftCrft = driver.findElement(By.xpath("//*[text()='Use Gift Certificate ']"));
//        JavascriptExecutor JS5 = (JavascriptExecutor) driver;   
//        JS5.executeScript("arguments[0].scrollIntoView();",GiftCrftScroll  );
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(GiftCrftScroll)).click();
          GiftCrft.click();
 
        WebElement EnterGC = driver.findElement(By.xpath("//input[@id='input-voucher']"));
        EnterGC.sendKeys("AXDFGH123");
        WebElement AppyGC = driver.findElement(By.xpath("//input[@id='button-voucher']"));
        AppyGC.click();
        WebElement EMsg =driver.findElement(By.xpath("//*[text()=' Warning: Gift Certificate is either invalid or the balance has been used up!']"));
        String MSG = EMsg.getText();
        System.out.println("Warning msg after applying Gift Certificate is : "+ MSG);
        
        
        
        
        
        
//// 13. Clear both textbox values and proceed to checkout
        Thread.sleep(3000);
        WebElement ClearUseCoupon = driver.findElement(By.xpath("//a[@href='#collapse-coupon']"));
        ClearUseCoupon .click();
        WebElement ClearCouponCode = driver.findElement(By.xpath("//input[@id='input-coupon']"));
        ClearCouponCode.clear();
        
        Thread.sleep(3000);
        WebElement ClearGiftCrft = driver.findElement(By.xpath("//a[@href='#collapse-voucher']"));
        ClearGiftCrft.click();
        WebElement ClearEnteredGC = driver.findElement(By.xpath("//input[@id='input-voucher']"));
        ClearEnteredGC.clear();
        
        WebElement CheckOut = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        CheckOut.click();
        
        
        
        
        
//// 14. Select register account option and enter all account and billing details, click continue        
        WebElement RegisterAccount = driver.findElement(By.xpath("//*[text()='Register Account']"));
        RegisterAccount .click();
        driver.findElement(By.xpath("//input[@id='button-account']")).click();
        
        driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Anju");
        driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("Joseph");
        driver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys("anjujorp93@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys("9987654678");
        driver.findElement(By.xpath("//input[@id='input-payment-password']")).sendKeys("ehwfb875@");
        driver.findElement(By.xpath("//input[@id='input-payment-confirm']")).sendKeys("ehwfb875@");
        
        driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("AjaxVilla");
        driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("Heaven");
        driver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys("no 2");
        driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Ernakulam");
        driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("685584");
        
        WebElement selectcountry = driver.findElement(By.xpath("//select[@id='input-payment-country']"));
        Select dp = new Select(selectcountry); 
        dp.selectByVisibleText("India");
        
        WebElement selectstate = driver.findElement(By.xpath("//select[@id='input-payment-zone']"));
        Select d = new Select(selectstate); 
        d.selectByVisibleText("Kerala");
        
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@id='button-register']")).click();
        
        
        
        
        
        
        
// //15.Add comments, click continue and check the error message related to payment method 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("comments");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
        
        WebElement warng = driver.findElement(By.xpath("//*[text()='Warning: Payment method required!']"));
        String w = warng.getText();
        System.out.println("Warning message : "+ w );
        
        
        
        
// //16. Click on contact us hyperlink and submit a contact request and click continue 
        driver.findElement(By.xpath("//i[@class='fa fa-phone']")).click();
        driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).sendKeys("Enquiry about the product");
       // Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        JavascriptExecutor js6 = (JavascriptExecutor) driver;   
        js6.executeScript("arguments[0].scrollIntoView();",submit );
        submit .click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        
        
        
        
        
    
        
	}

}
