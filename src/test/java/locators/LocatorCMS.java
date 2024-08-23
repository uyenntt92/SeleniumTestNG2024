package locators;

public class LocatorCMS {
    //Login
    public static String headerLoginPage = "//h1[normalize-space()='Welcome to Active eCommerce CMS']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot password ?']";
    public static String checkboxRemember = "//span[normalize-space()='Remember Me']";
    //Trang Dashboard
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuProducts = "//span[normalize-space()='Products']";
    public static String menuCatogory= "//span[normalize-space()='Category']";
    //Trang Catogory
    public static String buttonAddNewcategory = "//span[normalize-space()='Add New category']";
    public static String headerCategoryPage = "//h1[normalize-space()='All categories']";
    public static String inputSearchCategory = "//input[@id='search']";
    public static String firstItemCustomerOnTable = "//tbody/tr[1]/td[2]";

    //Add New Category
    public static String inputCatogoryName = "//input[@id='name']";
    public static String dropdownParentCategory = "//button[@title='No Parent']";
    public static String inputSearchParentCategory = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
    public static String inputOrderingNumber = "//input[@id='order_level']";
    public static String selectType = "//select[@name='digital']";
    public static String buttonBanner = "//label[.='Banner (200x200)']/following-sibling::div//child::div[@class='input-group-prepend']";
    public static String selectBanner = "//div[@data-value='2349']";
    public static String buttonAddFilesBanner = "//button[normalize-space()='Add Files']";
    public static String buttonIcon = "//label[.='Icon (32x32)']/following-sibling::div//child::div[@class='input-group-prepend']";
    public static String selectIcon = "//div[@data-value='2349']";
    public static String buttonAddFilesIcon = "//button[normalize-space()='Add Files']";
    public static String inputMetaTitle = "//input[@placeholder='Meta Title']";
    public static String inputMetadescription = "//textarea[@name='meta_description']";
    public static String dropdownFilteringAttributes = "//button[@title='Nothing selected']";
    public static String selectFilterAttributes = "//a[@id='bs-select-3-0']"; //Atribute: Size
    public static String buttonSaveCatogory = "//button[normalize-space()='Save']";
}
