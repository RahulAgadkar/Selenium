package Pom_Scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script {
	
	@FindBy(id="email")
	private WebElement unTbox;
	
	@FindBy(id="passContainer")
	private WebElement pwdTbox;
	
	@FindBy(xpath="//div[.='Log in']")
	private WebElement loginBtn;
	
	public Pom_Script(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void userName(String un) {
	unTbox.sendKeys(un);	
	}
	public void passWord(String pwd) {
		pwdTbox.sendKeys(pwd);	
		}
	public void clickLogin() {
		loginBtn.click();
		}
	
	} 