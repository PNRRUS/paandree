package paandree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/input")
   private WebElement loginField;
    /** [contains(@id, 'passp-field-login')]
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//a[@href='file:///C:/html.training/firstSite.html']")
    private WebElement polirniVolklink;
    @FindBy(xpath = "//a[@href='file:///C:/html.training/bars.html']")
    private WebElement barsLink;
    @FindBy(xpath = "//a[@href='file:///C:/html.training/motor%20show.html']")
    private WebElement CarShop;
    /***      *[contains(text(), 'Войти')]/..

     * определение локатора кнопки входа в аккаунт
     */

//    @FindBy(xpath = pathColor )
//    "//*[@id=\"word-of-mouth\"]"
//    private WebElement magenta;
  //  /***      *[contains(text(), 'Войти')]/..

    // * определение локатора кнопки входа в аккаунт
    // */


    @FindBy(xpath = "//*[@id=\"instagram\"]")
    private WebElement redColor;

    @FindBy(xpath = "//*[@id=\"facebook\"]")
    private WebElement blueColor;

    @FindBy(xpath = "//*[@id=\"search-engine\"]")
    private WebElement violetColor;

    @FindBy(xpath = "//*[@id=\"word-of-mouth\"]")
    private WebElement magentaColor;

    @FindBy(xpath = "//*[@id=\"press\"]")
    private WebElement pinkColor;

    @FindBy(xpath = "//*[@id=\"event\"]")
    private WebElement greenColor;

    @FindBy(xpath = "//*[@id=\"billboard\"]")
    private WebElement yellowColor;

    @FindBy(xpath = "//form[@action='ilon.html']")
//    /html/body/section/div/div[3]/form[1]/button
    private WebElement Buy;

    @FindBy(xpath = "//*[@id=\"1\"]")
    private WebElement newCar;

    @FindBy(xpath = "//*[@id=\"2\"]")
    private WebElement by;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement price;

    @FindBy(xpath = "/html/body/a")
    private WebElement indexHTML;

    @FindBy(xpath = "/html/body/main/div[2]/div/div[2]/div/div[1]/div/div[2]/a")
    private WebElement indexHTMLTesla;
    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login); }


    @FindBy(xpath = "/html/body/nav/ul/div[1]/div/a[5]")
    private WebElement menuToyota;

    @FindBy(xpath = "/html/body/nav/ul/div[1]/div[1]/li/a")
    private WebElement menu;

    @FindBy(xpath = "/html/body/nav/ul/div[1]/div/a[1]")
    private WebElement menuTesla;
    /**
     * метод для ввода пароля
     */
    @FindBy(xpath = "/html/body/nav/ul/div[2]/li/a")
    private WebElement menuHome;

    public void inputPasswd(String passwd) {
        price.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */


    /**
     * метод для осуществления нажатия кнопки Продолжить
     */

    public void clickContinueBtn() {
        Buy.click(); }

    public void clickLoginBtn2() {
        polirniVolklink.click(); }

    public void clickLoginBtn3() {
        barsLink.click(); }

    public void clickLoginBtn4() {
        CarShop.click(); }

    public void clickcontinueBtn2() {
        newCar.click(); }
    public void clickcontinueBtn3() {
        by.click();}
    public void clickMenuHome() {
        menuHome.click(); }

    public void clickmenu() {
        menu.sendKeys("Toyota");
    }

    public void clickmenuToyota() {
        menuToyota.click();
    }
    public void clickmenuTesla() {
        menuTesla.click();
    }

    public void clickindexHTML() {
        indexHTML.click();
    }
    public void clickTesla() {
        indexHTMLTesla.click();
    }

    public void clickLoginBtnRed() {
            redColor.click();
            }
    public void clickLoginBtnBlue() {
        blueColor.click();
    }
    public void clickLoginBtnViolet() {
        violetColor.click();
    }
    public void clickLoginBtnMagenta() {
        magentaColor.click();
    }
    public void clickLoginBtnPink() {
        pinkColor.click();
    }
    public void clickLoginBtnGreen() {
        greenColor.click();
    }
    public void clickLoginBtnYellow() {
        yellowColor.click();
    }

    }