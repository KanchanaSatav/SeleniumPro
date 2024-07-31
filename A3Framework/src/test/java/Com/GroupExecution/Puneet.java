package Com.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puneet {
	@Test (groups= {"KFI"})
	public void executionScript() {
	Reporter.log("puneet", true);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/puneethrajkumar.official/");
	driver.quit();

}
}

