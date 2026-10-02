package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class NdosiHomeTest extends BaseTest {
    @Test
    public void openNdosiWebsite() throws InterruptedException {
        driver.get("https://ndosisimplifiedautomation.vercel.app");
        System.out.println("Page title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Ndosi Test Automation");


    }
}
