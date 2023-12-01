package assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangHRM {
     public static WebDriver driver;
     
     String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   @FindBy (xpath = "//input[@name='username']") WebElement username;
	   @FindBy (name = "password") WebElement password;
	   @FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") WebElement login;
	   @FindBy (xpath="//a[@href=\"/web/index.php/pim/viewMyDetails\"]") WebElement myInfoBtn;
	   @FindBy (xpath="//input[@name='firstName']") WebElement FName;
	   @FindBy (xpath="//input[@name='middleName']") WebElement MName;
	   @FindBy (xpath="//input[@name='lastName']") WebElement LName;
//-doubt
	   @FindBy (xpath="//label[text()='Nickname']/../../../../../../div[1]/div[2]/div/div/div[2]/input") WebElement nickName ;
	   @FindBy (xpath="//label[text()='Employee Id']/../../../../../div[1]/div[1]/div[1]/div[2]/input") WebElement employeeID;
	   @FindBy (xpath="//label[text()='Other Id']/../../../../../div[1]/div[2]/div/div[2]/input") WebElement otherID;
	   @FindBy (xpath="//label[text()='License Expiry Date']/../../../../../../div[2]/div[2]/div[1]/div[1]/div[2]/input")WebElement drivingLicenseNo;
	   @FindBy (xpath="//label[text()='License Expiry Date']/../../../../../../div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input")WebElement LicenseNo;
	   @FindBy (xpath="//label[text()='SSN Number']/../../../../div[1]/div[1]/div[2]/input")WebElement SSNnum;
	   @FindBy (xpath="//label[text()='SIN Number']/../../../../div[2]/div[1]/div[2]/input")WebElement SINnum;
	   @FindBy (xpath="//label[text()='Nationality']/../../../../../div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i")WebElement nationality;
	   @FindBy (xpath="//label[text()='Marital Status']/../../../div[1]/div[2]/div[1]/div[1]/div[2]/i")WebElement maritalStatus;
	   @FindBy (xpath="//label[text()='Date of Birth']/../../../div[1]/div[2]/div[1]/div[1]/input") WebElement dateOfBirth;
	   @FindBy (xpath="//*[text()='Female']/input") WebElement gender;
	   @FindBy (xpath="//*[text()='Military Service']/../../../../div[1]/div[1]/div[2]/input") WebElement militaryService;
	   @FindBy (xpath="//label[text()='Smoker']/../../../div[1]/div[2]/div[1]/label/input") WebElement smoker;
	   @FindBy(xpath="//button[text()=' Save ']/../../div[5]/button") WebElement saveBtn;
	   
	   
	   public void LOgin() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get(URL);
	   
	   PageFactory.initElements(driver, this);
	   
	   username.sendKeys("Admin");
	   password.sendKeys("admin123");
	   login.click();
	   myInfoBtn.click();
	   FName.click();
	   FName.sendKeys("Anju");
	   MName.click();
	   MName.sendKeys("Mary");
	   LName.sendKeys("Jospeh");
	   
	   nickName.click();
	   nickName.sendKeys("Anna");
	   
	   employeeID.click();
	   employeeID.sendKeys("M128");
	   otherID.click();
	   otherID.sendKeys("driving");
	   drivingLicenseNo.click();
	   drivingLicenseNo.sendKeys("34598");
	   LicenseNo.click();
	   LicenseNo.sendKeys("2029-09-11");//doubt(how to select the date from calender)
	   SSNnum.clear();
	   SSNnum.sendKeys("45678");
	   SINnum.click();
	   SINnum.sendKeys("5698");
	   nationality.click(); //  doubt -its dosent have code
	   maritalStatus.click();
	   dateOfBirth.click();
	   dateOfBirth.sendKeys("1997-09-11");
	   gender.click();
	   militaryService.click();
	   militaryService.sendKeys("Nil");
	   smoker.click();
	   saveBtn.click();
	   
	   
	   
	   
	   
	   
	   
	}
	public static void main(String[] args) {
		orangHRM OBJ = new orangHRM();
		         OBJ.LOgin();

	}

}
