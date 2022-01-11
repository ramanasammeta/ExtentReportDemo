package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.basePackage.BaseClass;
import com.extentManager.ExtentManager;

public class OrangeHRMTest extends BaseClass {

    @Test
    public void loginPageTest() throws InterruptedException {
        Thread.sleep(5000);
        WebElement imgElement=driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        Assert.assertTrue(imgElement.isDisplayed());
    }
    @Test
    public void loginTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("ramanasreddy@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("abcxyz@123");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(2000);

        String actURL=driver.getCurrentUrl();
        String expectURL="http://automationpractice.com/index.php?controller=my-account";
        Assert.assertEquals(actURL,expectURL);

    }
    @Test
    public void sampleCase() {
        ExtentManager.test.createNode("Validation1");
        Assert.assertTrue(true);
        ExtentManager.test.createNode("Validation2");
        Assert.assertTrue(true);
        ExtentManager.test.createNode("Validation3");
        Assert.assertTrue(true);
        ExtentManager.test.createNode("Validation4--changes--");
        Assert.assertTrue(true);
    }
}