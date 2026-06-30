package mobile_tests;

import config.AppiumConfig;
import dto.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.RegistrationScreen;
import screens.SearchScreen;
import screens.SplashScreen;

//import static utils.UserFactory.positiveUser;
import static utils.UserFactory.*;

//import utils.UserFactory;

public class RegistrationTests extends AppiumConfig {

    @Test
    public void registrationPositiveTest(){
        User user = positiveUser();
        System.out.println(user);
        new SplashScreen(driver).openSearchScreen(7);
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
        searchScreen.clickBtnRegistration();
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.typeRegistrationForm(user);
        registrationScreen.clickCheckBox();
        registrationScreen.clickBtnYalla();
        Assert.assertTrue(searchScreen.validatePopUpMessageRegSuccess("Registration success"));
    }
}
