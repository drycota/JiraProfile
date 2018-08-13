package Test;

import Pages.UserAvatar;
import Steps.LoginSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertNotEquals;

public class UploadNewAvatar {

    @Test
    public void UploadNewAvatar() throws InterruptedException {

        String idAvatar = "//*[@id=\"details-user-avatar-trigger\"]/img";
        String valIdAvatar;

        LoginSteps uploadNewAvatar = new UserAvatar();
        uploadNewAvatar.LoginToJira();
        valIdAvatar = $(By.xpath(idAvatar)).toString();
        ((UserAvatar) uploadNewAvatar).UploadNewAvatar();

        SECONDS.sleep(3);

        assertNotEquals(valIdAvatar, $(By.xpath(idAvatar)).toString());
    }
}
