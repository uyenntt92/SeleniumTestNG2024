package thuchanh;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ThucHanhAnnotation extends BaseTest {
@Test(priority=1)
    public void testLoginCRM1() {
//    createBrowser();
    System.out.println("Login CRM 1");
    driver.get("https://crm.anhtester.com/admin/authentication");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//    closeBrowser();
}

    @Test(priority=2)
    public void testLoginCRM2() {
//        createBrowser();
        System.out.println("Login CRM 2");
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

//        closeBrowser();
    }
}

