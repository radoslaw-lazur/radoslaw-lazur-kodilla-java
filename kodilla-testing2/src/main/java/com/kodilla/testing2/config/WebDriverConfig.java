package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\Chrome\\chromedriver.exe");
        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else if (driver.equals(CHROME)) {
            ChromeOptions option = new ChromeOptions();
            return new ChromeDriver(option);
        } else {
            return null;
        }
    }
}
