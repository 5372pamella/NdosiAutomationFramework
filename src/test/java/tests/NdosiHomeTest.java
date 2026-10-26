
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class NdosiHomeTest extends BaseTest {

    @Test
    public void loginTest() {

        homepage.checkIfNdosiWebsiteIsLoaded();
        homepage.clickHomeLoginButton();
        loginpage.enterUsername("admin@gmail.com");
        loginpage.enterPassword("@12345678");
        loginpage.clickLoginButton();


        dashboardpage.verifyLoginWasSuccessful();
        dashboardpage.clickMenu();
        dashboardpage.clickAdminPanel();
        adminpage.clickGroupsButton();
        adminpage.clickCreateANewGroupButton();

        grouppage.enterGroupName(
                "Automation " + System.currentTimeMillis()
        );
        grouppage.enterGroupDescription(
                "This is a test automation group"
        );
        grouppage.enterYear("2026");
        grouppage.enterMaxCapacity("100");

        grouppage.clickCreateGroupButton();

        Assert.assertTrue(
                grouppage.isGroupCreated(),
                "Group was not created successfully"
        );
    }
}
