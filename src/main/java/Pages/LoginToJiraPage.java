package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class LoginToJiraPage {
    String userNameXpath = "//*[@id=\'login-form-username\']";
    String userPassXpath = "//*[@id=\'login-form-password\']";
    String loginButtonXpath = "//*[@id=\"login\"]";                     //*[@id=\'login-form-submit\']";   //
    String onPage = "//body/div[1]/section/dashboard/div[1]/div/div[1]/div/div[1]/h1";

    public void enterUserName (String userName) {$(By.xpath(userNameXpath)).sendKeys(userName);}
    public void enterPassword (String password){$(By.xpath(userPassXpath)).sendKeys(password);}
    public void clickSendButton(){$(By.xpath(loginButtonXpath)).sendKeys(Keys.ENTER);}
    public boolean onPage(){
        return $(By.xpath(onPage)).isDisplayed();
    }
}
