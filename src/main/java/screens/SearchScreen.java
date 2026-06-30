package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchScreen extends BaseScreen {
    public SearchScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    WebElement btnDots;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.telran.ilcarro:id/title' and @text='Login']")
    WebElement btnLogin;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.telran.ilcarro:id/title' and @text='Registration']")
    WebElement btnRegistration;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Registration success!']")
    WebElement popUpMessageRegSuccess;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Login success!']")
    WebElement popUpMessageLoginSuccess;

    public void clickBtnDots() {
            clickWait(btnDots, 3);
    }

    public void clickBtnRegistration(){
        clickWait(btnRegistration,3);
    }
    public void clickBtnLogin(){
        clickWait(btnLogin,3);
    }

    public boolean validatePopUpMessageRegSuccess(String text){
        return isTextInElementPresent(popUpMessageRegSuccess,text,5);

    }
    public boolean validatePopUpMessageLoginSuccess(String text){
        return isTextInElementPresent(popUpMessageLoginSuccess,text,5);

    }

}

