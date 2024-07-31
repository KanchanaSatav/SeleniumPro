package ElementRepositore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
       @FindBy(id="Email")
       private WebElement emailTextBox;
       
       @FindBy(id="Password")
       private WebElement passwordTextBox;
       
       @FindBy(id="RememberMe")
       private WebElement  remembermeCheckBox;

       @FindBy(partialLinkText="Forgot password?")
       private WebElement  forgotpasswordLink;
       
       @FindBy(xpath="//input[@value=\"Log in\"]")
       private WebElement   loginButton;
       
     
       
	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRemembermeCheckBox() {
		return remembermeCheckBox;
	}

	public WebElement getForgotpasswordLink() {
		return forgotpasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
	