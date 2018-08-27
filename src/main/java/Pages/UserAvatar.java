package Pages;

import Steps.LoginSteps;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.$;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class UserAvatar extends LoginSteps{

    private String userAvatar = "//*[@id=\"details-user-avatar-trigger\"]";
    private String buttonNewAvatar = "//*[@id=\"jira-avatar-uploader\"]";
    private String buttonConfirm = "//*[@id=\"avataror\"]/div[3]/div/input";

    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    public void clickOnUserAvatar() {
        $(By.xpath(userAvatar)).waitUntil(Condition.visible, 3000).click();
    }

    public void UploadNewAvatar(){
        $(By.xpath(userAvatar)).waitUntil(Condition.visible, 3000).click();
        $(By.xpath(buttonNewAvatar)).waitUntil(Condition.visible, 3000).click();

        File file = new File("src/img/ava.png");
        setClipboard(file.getAbsolutePath());

        Robot robot = null;
        try {
            robot = new Robot();
        }
        catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(3000);

        $(By.xpath(buttonConfirm)).click();

    }
}
