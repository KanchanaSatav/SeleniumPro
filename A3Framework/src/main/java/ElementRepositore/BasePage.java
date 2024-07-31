 package ElementRepositore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass {
  @FindBy(partialLinkText="Register")
  private WebElement registerLink;
  
  @FindBy(partialLinkText="Log in")
  private WebElement LoginLink;
  
  
  @FindBy(partialLinkText="Shopping cart")
  private WebElement ShoppingcartLink;
  
  @FindBy(partialLinkText="Wishlist")
  private WebElement WishlistLink;
  
  @FindBy(partialLinkText="BOOKS")
  private WebElement BooksLink;
  
  @FindBy(partialLinkText="COMPUTERS")
  private WebElement ComputersLink;
  
  @FindBy (partialLinkText="ELECTRONIC")
	private  WebElement ElectronicsLink;
  
  @FindBy (partialLinkText="APPEARL & SHOES")
	private WebElement ApparelShoesLink;
  
  @FindBy (partialLinkText="DIGITAL DOWNLOADS")
 	private WebElement DigitaldownloadsLink;
  
  @FindBy(partialLinkText = "JEWELLARY")
  private WebElement JewelryLink;
  
  @FindBy(partialLinkText="GIFT CARDS")
  private WebElement GiftCardsLink;
  
  
  @FindBy(id="small-searchterms")
  private WebElement SearchBox;
  
 @FindBy(xpath="//input[@value='Search']")
 private WebElement SearchButton;
 
 @FindBy(partialLinkText="Log out")
 private WebElement LogoutLink;
 


//add inside the constructor of TC001 class
   public BasePage(WebDriver driver) {
   PageFactory.initElements(driver,this);
}
   
   
   /**
    * *
    * Getter methods Started for Private variables
    */
   
   /**
    * This method 
    * @return type is Webelement
    */

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getLoginLink() {
	return LoginLink;
}

public WebElement getShoppingcartLink() {
	return ShoppingcartLink;
}

public WebElement getWishlistLink() {
	return WishlistLink;
}

public WebElement getBooksLink() {
	return BooksLink;
}

public WebElement getComputersLink() {
	return ComputersLink;
}

public WebElement getElectronicsLink() {
	return ElectronicsLink;
}

public WebElement getApparelShoesLink() {
	return ApparelShoesLink;
}

public WebElement getDigitaldownloadsLink() {
	return DigitaldownloadsLink;
}

public WebElement getJewelryLink() {
	return JewelryLink;
}

public WebElement getGiftCardsLink() {
	return GiftCardsLink;
}

public WebElement getSearchBox() {
	return SearchBox;
}

public WebElement getSearchButton() {
	return SearchButton;
}
public WebElement getLogoutLink1() {
	return LogoutLink;
	
}
}


