package apiTests;

import controllers.AuthController;
import dto.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.UserFactory.*;

public class RegistrationRestTests extends AuthController {
    @Test
    public void registrationPositiveTest(){
        User user = positiveUser();
        Assert.assertEquals(registrationLogin(user, REGISTRATION_URL)
                .getStatusCode(),200);
    }


}
