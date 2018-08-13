package Steps;

import Pages.LoginPageObject;
import Pages.ProfilePageObject;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    public void LoginToJira(){

        //Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";

        open("http://jira.hillel.it:8080/login.jsp");

        LoginPageObject loginPage = new LoginPageObject();
        loginPage.LoginToJira("webinar5", "webinar5");
        //loginPage.LoginToJira("Dmitry_Prikota", "638Jawa638!!!");
        
        ProfilePageObject openUserProfile = new ProfilePageObject();
        openUserProfile.openProfileWindow();

    }

}
