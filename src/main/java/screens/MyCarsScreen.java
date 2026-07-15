package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import static config.AppiumConfig.*;

public class MyCarsScreen extends BaseScreen{
    public MyCarsScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.telran.ilcarro:id/addCarBtn")
    WebElement btnAddNewCar;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Car was added!']")
    WebElement popUpMessageSuccess;

    public void clickBtnAddNewCar(){
        clickWait(btnAddNewCar, 3);
    }
    public boolean validateMessageSuccess(String text){
        return isTextInElementPresent(popUpMessageSuccess,
                text, 3);
    }

    public void deleteCar(){
       swipe(width/6, height/4,
               width/6*5, height/4);
    }
    }
