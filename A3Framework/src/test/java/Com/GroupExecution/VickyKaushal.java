package Com.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal {
@Test (groups= {"BFI", "Bollywood"})
public void executionScript() {
Reporter.log("vicky", true);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/vickykaushal09/");
driver.quit();

}
}
