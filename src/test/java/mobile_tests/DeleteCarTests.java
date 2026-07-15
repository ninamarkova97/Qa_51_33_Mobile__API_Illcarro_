package mobile_tests;

import config.AppiumConfig;
import dto.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MyCarsScreen;
import screens.SearchScreen;
import screens.SplashScreen;
import utils.PropertiesReader;

public class DeleteCarTests extends AppiumConfig {
    SearchScreen searchScreen;
    LoginScreen loginScreen;

    @BeforeMethod
    public void login() {
        new SplashScreen(driver).openSearchScreen(7);
        searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
        searchScreen.clickBtnLogin();
        User user = User.builder()
                .username(PropertiesReader
                        .getProperty("mobile.properties", "email"))
                .password(PropertiesReader
                        .getProperty("mobile.properties", "password"))
                .build();
        loginScreen = new LoginScreen(driver);
        loginScreen.typeLoginForm(user);
        loginScreen.clickBtnYalla();
        searchScreen.clickBtnDots();
        searchScreen.clickBtnMyCars();
    }

    @Test
    public void deleteCarPositiveTest(){
        MyCarsScreen myCarsScreen = new MyCarsScreen(driver);
        myCarsScreen.deleteCar();
    }
}