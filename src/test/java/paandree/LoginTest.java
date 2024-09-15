package paandree;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage")); }
    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() throws InterruptedException {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        //вводим логин
        //loginPage.inputLogin(ConfProperties.getProperty("login"));
        //нажимаем кнопку входа
        Thread.sleep(2000);
        loginPage.clickLoginBtn2();
        Thread.sleep(2000);
        loginPage.clickLoginBtn3();
        Thread.sleep(2000);
        loginPage.clickLoginBtn4();
        Thread.sleep(5000);
        loginPage.clickindexHTML();
        Thread.sleep(5000);
        loginPage.clickTesla();
        Thread.sleep(5000);


        Actions actionToyota = new Actions(driver);
        WebElement catalog = driver.findElement(By.xpath("/html/body/nav/ul/div[1]/div[1]/li/a"));
        actionToyota.moveToElement(catalog).build().perform();

        Thread.sleep(5000);
        loginPage.clickmenuToyota();
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/nav/ul/div[1]/div[1]/li/a"));
        action.moveToElement(we).build().perform();

        Thread.sleep(5000);
        loginPage.clickmenuTesla();
        Thread.sleep(5000);



        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        Thread.sleep(2000);
        loginPage.clickcontinueBtn2();
        Thread.sleep(2000);
        loginPage.clickcontinueBtn3();
        Thread.sleep(2000);



        int colorNumber =(int) Math.round(Math.random() * 6);

        switch (colorNumber) {
            case 0:
                loginPage.clickLoginBtnBlue();

                break;
            case 1:
                loginPage.clickLoginBtnRed();

                break;
            case 2:
                loginPage.clickLoginBtnViolet();

                break;
            case 3:
                loginPage.clickLoginBtnMagenta();

                break;
            case 4:
                loginPage.clickLoginBtnPink();

                break;
            case 5:
                loginPage.clickLoginBtnGreen();

                break;
            case 6:
                loginPage.clickLoginBtnYellow();

                break;

        }


        Thread.sleep(5000);
        loginPage.clickContinueBtn();
        Thread.sleep(5000);
        driver.quit();


        //вводим пароль
        //loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        //loginPage.clickContinueBtn();
        //получаем отображаемый логин
        //String user = profilePage.getUserName();
        //и сравниваем его с логином из файла настроек
        //Assert.assertEquals(ConfProperties.getProperty("login"), user);
    }
    /**
     * осуществление выхода из аккаунта с последующим закрытием окна браузера
     */
    @AfterClass
    public static void tearDown() {
        //profilePage.entryMenu();
        //profilePage.userLogout();
        driver.quit(); } }
