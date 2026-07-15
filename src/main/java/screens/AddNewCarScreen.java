package screens;

import dto.Car;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static config.AppiumConfig.*;

public class AddNewCarScreen extends BaseScreen {
    public AddNewCarScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.telran.ilcarro:id/editSerial")
    WebElement inputSerialNumber;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editMan")
    WebElement inputManufacture;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editModel")
    WebElement inputModel;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editCity")
    WebElement inputCity;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editPrice")
    WebElement inputPrice;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editCarClass")
    WebElement inputCarClass;
    @AndroidFindBy(id = "com.telran.ilcarro:id/text1")
    WebElement inputFuel;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editYear")
    WebElement inputYear;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editSeats")
    WebElement inputSeats;
    @AndroidFindBy(id = "com.telran.ilcarro:id/editAbout")
    WebElement inputAbout;
    @AndroidFindBy(id = "com.telran.ilcarro:id/addCarBtn")
    WebElement btnAddCar;

    public void typeAddForm(Car car) {
        inputSerialNumber.sendKeys(car.getSerialNumber());
        inputManufacture.sendKeys(car.getManufacture());
        inputModel.sendKeys(car.getModel());
        inputCity.sendKeys(car.getCity());
        inputPrice.sendKeys(car.getPricePerDay() + "");
        inputCarClass.sendKeys(car.getCarClass());
        typeFuel(car.getFuel());
        inputYear.sendKeys(car.getYear());
        swipe(width / 2, (int) (height * 0.8),
                width / 2, (int) (height * 0.2));
        inputSeats.sendKeys(Integer.toString(car.getSeats()));
        inputAbout.sendKeys(car.getAbout());
    }

    public void clickBtnAddCar() {
        clickWait(btnAddCar, 3);
    }

    private void typeFuel(String fuel) {
        inputFuel.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@text='" + fuel + "']")))
                .click();

    }
}
