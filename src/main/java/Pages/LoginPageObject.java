package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;


public class LoginPageObject {

    String userNameXpath = "//*[@id='login-form-username']";
    String userPassXpath = "//*[@id='login-form-password']";
    String loginButtonXpath = "//*[@id='login-form-submit']";

    public void LoginToJira(String login, String password) {
        $(By.xpath(userNameXpath)).sendKeys(login);
        $(By.xpath(userPassXpath)).sendKeys(password);
        $(By.xpath(loginButtonXpath)).sendKeys(Keys.ENTER);

    }
}
