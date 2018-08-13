package Test;

import Pages.UserAvatar;
import Steps.LoginSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class EditUserAvatar {

    @Test
    public void EditUserAvatar(){

        String userAvatar = "//*[@id=\"user-avatar-picker\"]/div[1]";

        LoginSteps editUserAvatar = new UserAvatar();
        editUserAvatar.LoginToJira();
        ((UserAvatar) editUserAvatar).clickOnUserAvatar();

        assertEquals($(By.xpath(userAvatar)).getText(), "Select a User Avatar");

    }
}
