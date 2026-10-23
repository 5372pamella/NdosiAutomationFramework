
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class NdosiHomeTest extends BaseTest {

    @Test
    public void loginTest() {

        // Open the Ndosi website and log in
        homepage.checkIfNdosiWebsiteIsLoaded();
        homepage.clickHomeLoginButton();
        loginpage.enterUsername("admin@gmail.com");
        loginpage.enterPassword("@12345678");
        loginpage.clickLoginButton();

        // Verify login and navigate to the Groups page
        dashboardpage.verifyLoginWasSuccessful();
        dashboardpage.clickMenu();
        dashboardpage.clickAdminPanel();
        adminpage.clickGroupsButton();
        adminpage.clickCreateANewGroupButton();

        // Enter the new group details
        grouppage.enterGroupName(
                "Automation " + System.currentTimeMillis()
        );
        grouppage.enterGroupDescription(
                "This is a test automation group"
        );
        grouppage.enterYear("2026");
        grouppage.enterMaxCapacity("100");

        // Submit the form
        grouppage.clickCreateGroupButton();

        // Verify that the group was created
        Assert.assertTrue(
                grouppage.isGroupCreated(),
                "Group was not created successfully"
        );
    }
}
