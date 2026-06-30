package mobile_tests;

import config.AppiumConfig;
import dto.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.SearchScreen;
import screens.SplashScreen;
import utils.PropertiesReader;

public class AddNewCarTests extends AppiumConfig {
    @BeforeMethod
    public void login(){
        new SplashScreen(driver).openSearchScreen(7);
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
        searchScreen.clickBtnLogin();
        User user = User.builder()
                .username(PropertiesReader.getProperty("mobile.properties","email"))
                .password(PropertiesReader.getProperty("mobile.properties","password"))
                .build();
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.typeLoginForm(user);
        loginScreen.clickBtnYalla();
    }
@Test
    public void addNewCarPositiveTest(){
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
}
}
