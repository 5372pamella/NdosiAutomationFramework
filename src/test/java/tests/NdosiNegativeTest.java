package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class NdosiNegativeTest extends BaseTest {
    @Test
    public void loginWithInvalidPasswordTest(){
        homepage.checkIfNdosiWebsiteIsLoaded();
        homepage.clickHomeLoginButton();
        loginpage.enterUsername("admin@gmail.com");
        loginpage.enterPassword("@hjgjhh");
        loginpage.clickLoginButton();
        String invalidLoginMessage = loginpage.getInvalidLoginMessage();
        loginpage.acceptAlert();
        Assert.assertEquals(invalidLoginMessage, "Invalid email or password"
                ,"The expected error message was not displayed");
    }

    @Test
    public void loginWithInvalidEmailTest(){
        homepage.checkIfNdosiWebsiteIsLoaded();
        homepage.clickHomeLoginButton();
        loginpage.enterUsername("min@gmail.com");
        loginpage.enterPassword("@12345678");
        loginpage.clickLoginButton();
        String invalidLoginMessage = loginpage.getInvalidLoginMessage();
        loginpage.acceptAlert();
        Assert.assertEquals(invalidLoginMessage, "Invalid email or password"
                ,"The expected error message was not displayed");
    }
}
