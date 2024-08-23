package Bai11_Assertions;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert extends BaseTest {
    @Test
    public void testOpenCustomers(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        String headerLoginPage = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        Assert.assertEquals(headerLoginPage,"Login","Header not match." + headerLoginPage);
        String url = driver.getCurrentUrl();
        System.out.println("current url : " + url);
        //so sánh bằng
//        Assert.assertEquals(url,"https://crm.anhtester.com/admin/authentication");
        //so sánh chứa
        Boolean checkURL = url.contains("/admin/authentication123");
        Assert.assertTrue(checkURL,"Url không chứa gtri mong muốn");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        boolean checkMenuDashboard = driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).isDisplayed();
        Assert.assertTrue(checkMenuDashboard);
        //Mở menu Project
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
    }

}
