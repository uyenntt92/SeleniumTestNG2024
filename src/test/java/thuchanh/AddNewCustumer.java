package thuchanh;

import common.BaseTest;
import locators.LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewCustumer extends BaseTest {
    @Test
    public void testAddNewCustomer(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCRM.menuDashboard)).isDisplayed(),"Menu Dashboard is not displayed");

        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCRM.headerCustomerPage)).isDisplayed(),"header Customer page is not displayed");

        String COMPANY_NAME = "ASIA comany";
        driver.findElement(By.xpath(LocatorCRM.buttonAddNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys(COMPANY_NAME);
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputVatNumber)).sendKeys("10");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputPhone)).sendKeys("1234567891");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputWebsite)).sendKeys("https://ASIA.com");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroups)).sendKeys("VIP");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroups)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();

        driver.findElement(By.xpath(LocatorCRM.inputAddress)).sendKeys("Hà Nội");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputCity)).sendKeys("Hà Nội");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputState)).sendKeys("hoàn kiếm");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputZipCode)).sendKeys("1000");
        driver.findElement(By.xpath(LocatorCRM.dropdownCountry)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys("Vietnam");
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCRM.buttonSaveCustomer)).click();
        sleep(3);
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCustomers)).sendKeys(COMPANY_NAME);
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCRM.firstItemCustomerOnTable)).isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath(LocatorCRM.firstItemCustomerOnTable)).getText(), COMPANY_NAME);
}}
