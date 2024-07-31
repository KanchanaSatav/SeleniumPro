package Com.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	@Test (groups= {"KFI"})
	public void executionScript() {
	Reporter.log("yash", true);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/thenameisyash/");
	driver.quit();

}
}
