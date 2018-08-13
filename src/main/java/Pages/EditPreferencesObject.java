package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EditPreferencesObject {
    //String userDetailsButton = "//*[@id='header-details-user-fullname']";
   // String viewProfile = "//*[@id='view_profile']";
    String editPrefLink = "//*[@id='edit_prefs_lnk']";

    public void clickOnEditPreferencesButton() {
        //$(By.xpath(userDetailsButton)).waitUntil(Condition.visible, 3000).click();
        //$(By.xpath(viewProfile)).waitUntil(Condition.visible, 3000).click();
        $(By.xpath(editPrefLink)).waitUntil(Condition.visible, 3000).click();
    }


}



