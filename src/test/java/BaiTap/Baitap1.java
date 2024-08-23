package BaiTap;

import common.BaseTest_BT;
import locators.LocatorCMS;
import locators.LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baitap1 extends BaseTest_BT {
    @Test
    public void testAddNewCatogory(){
            driver.get("https://cms.anhtester.com/login");
            //Login CMS

            driver.findElement(By.xpath(LocatorCMS.inputEmail)).sendKeys("admin@example.com");
            driver.findElement(By.xpath(LocatorCMS.inputPassword)).sendKeys("123456");
            driver.findElement(By.xpath(LocatorCMS.buttonLogin)).click();

            //Menu Dashboard

            driver.findElement(By.xpath(LocatorCMS.menuProducts)).click();
            driver.findElement(By.xpath(LocatorCMS.menuCatogory)).click();
            driver.findElement(By.xpath(LocatorCMS.buttonAddNewcategory)).click();

            //Add new category

            String Category_Name = "Warrior shoes";

            driver.findElement(By.xpath(LocatorCMS.inputCatogoryName)).sendKeys(Category_Name);

            driver.findElement(By.xpath(LocatorCMS.dropdownParentCategory)).click();
            driver.findElement(By.xpath(LocatorCMS.inputSearchParentCategory)).sendKeys("Warrior shoes");
            driver.findElement(By.xpath(LocatorCMS.inputSearchParentCategory)).sendKeys(Keys.ENTER);

            driver.findElement(By.xpath(LocatorCMS.inputOrderingNumber)).sendKeys("10");

            Select selectType = new Select(driver.findElement(By.xpath(LocatorCMS.selectType)));
            selectType.selectByIndex(1);

//            driver.findElement(By.xpath(LocatorCMS.buttonBanner)).click();
//            driver.findElement(By.xpath(LocatorCMS.selectBanner)).click();
//            driver.findElement(By.xpath(LocatorCMS.buttonAddFilesBanner)).click();
//
//            driver.findElement(By.xpath(LocatorCMS.buttonIcon)).click();
//            driver.findElement(By.xpath(LocatorCMS.selectIcon)).click();
//            driver.findElement(By.xpath(LocatorCMS.buttonAddFilesIcon)).click();

            driver.findElement(By.xpath(LocatorCMS.inputMetaTitle)).sendKeys("Warrior women Shoes");

            driver.findElement(By.xpath(LocatorCMS.inputMetadescription)).sendKeys("Black Warrior women Shoes");

            driver.findElement(By.xpath(LocatorCMS.dropdownFilteringAttributes)).click();
            driver.findElement(By.xpath(LocatorCMS.selectFilterAttributes)).click();

            driver.findElement(By.xpath(LocatorCMS.buttonSaveCatogory)).click();

            //Search Category added
            driver.findElement(By.xpath(LocatorCMS.inputSearchCategory)).sendKeys(Category_Name);
            driver.findElement(By.xpath(LocatorCMS.inputSearchCategory)).sendKeys(Keys.ENTER);
            sleep(3);

            //Check Category added
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.firstItemCustomerOnTable)).isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath(LocatorCMS.firstItemCustomerOnTable)).getText(), Category_Name);

            closeBrowser();
        }
    }
