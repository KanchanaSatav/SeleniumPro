package GenericUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import ElementRepositore.BasePage;
import ElementRepositore.LoginPage;

public class BaseClassBrowser implements IAutoConstants , ITestListener {
	// private static final String PropertyFilePath = null;
	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp; 

	// FileLibrary flib= new FileLibrary();
	//LoginPage lp = new LoginPage(driver);

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}

	@AfterSuite
	public void afterSuit() {
		Reporter.log("After Suite", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}

	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browserName) {
		Reporter.log("Before class", true);
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("edge"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new ChromeDriver();
		lp = new LoginPage(driver);
		flib = new FileLibrary();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

	}

	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("after class", true);
		driver.close();
		driver.quit();
	}
	
	@BeforeMethod 
	
	public void navigateAndLoginToDWS() throws IOException {
	Reporter.log("Before Method",true);
	driver.get(flib.FetchDatatFromProperities(PropertyFilePath, "url"));
	lp.getLoginLink().click();
	lp.getEmailTextBox().sendKeys(flib.FetchDatatFromProperities(PropertyFilePath, "email"));
	lp.getPasswordTextBox().sendKeys(PropertyFilePath,"password");
	lp.getLoginButton().click();

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method", true);
}

@Override
public void onTestStart(ITestResult result) {
	Reporter.log("(Testcase --"+result.getName()+"--- is started");
	
}

@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("(Testcase --"+result.getName()+"--- is passed");

	
}


 @Override
 
 public void onTestFailure(ITestResult result) {
	Reporter.log("(Testcase --"+result.getName()+"--- is failed");
	LocalDateTime ldt = LocalDateTime.now();
	String time = ldt.toString().replace(":", "-");
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(screenshotpath+"screenshot.png");
	try {
		FileHandler.copy(src, dest);
	} 
	catch (Exception e) 
	{
		
	}
  }

@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("(Testcase --"+result.getName()+"--- is skipped");
}

@Override
public void onStart(ITestContext context) {
	Reporter.log("(Testcase --"+context.getName()+"--- is started");

}

@Override
public void onFinish(ITestContext context) {
	Reporter.log("(Testcase --"+context.getName()+"--- is finished");

}
}
