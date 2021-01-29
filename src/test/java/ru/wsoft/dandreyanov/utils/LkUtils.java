package ru.wsoft.dandreyanov.utils;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LkUtils {

    //Код взят из https://github.com/bonigarcia/webdrivermanager для автоматической загрузки нужного драйвера

    private WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    static {
        try {
            final InputStream is = LkUtils.class.getResourceAsStream("/test.properties");
            if(is!=null) {
                final Properties properties = new Properties();
                properties.load(is);
                System.getProperties().putAll(properties);
            } else {
                System.err.println("test.properties not found in CLASSPATH");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrokerApiUrl() {
        return System.getProperty("broker.api.url");
    }

    public static String getSmsCdrDir() {
        return System.getProperty("sms.cdr.dir");
    }

    public static String getCallCdrDir() {
        return System.getProperty("call.cdr.dir");
    }

    public static String getIpAddress() {
        return System.getProperty("ip.address");
    }

    public static void openSite () {

        Configuration.headless = false;
        open(System.getProperty("admin.console.login.url"));
    }

    public static void clearAll () {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    public static void authorise () {
        openSite();
        //Здесь мы очищаем кэш и куки, чтобы исключить влияние других тестов
        clearAll();
        //Логинимся
        $(By.id("username")).setValue(System.getProperty("client2.login")).pressTab();
        $(By.id("password")).setValue(System.getProperty("client2.password")).pressEnter();
        $(By.className("username")).shouldHave(Condition.textCaseSensitive("Вы вошли как "));
        $(By.className("username")).shouldHave(Condition.textCaseSensitive(System.getProperty("client2.login")));
    }

    public static void logOut () {
        $(By.xpath("//span[contains(text(),'Выход')]")).click();
    }
}
