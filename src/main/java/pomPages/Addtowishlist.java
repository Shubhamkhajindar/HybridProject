package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class Addtowishlist {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public Addtowishlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void playbtn() {
		playicon.click();
	}
	
	public void pausebtn() {
		pauseicon.click();
	}
	
	public void addtowishlistbtn() {
		addtowishlist.click();
	}

}
