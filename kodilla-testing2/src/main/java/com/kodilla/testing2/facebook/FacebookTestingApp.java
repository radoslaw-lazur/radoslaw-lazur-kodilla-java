package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {
    public static final String XPATH_FIRSTNAME = "//input[@name='firstname']";
    public static final String XPATH_LASTNAME = "//input[@name='lastname']";
    public static final String XPATH_EMAIL = "//input[@name='reg_email__']";
    public static final String XPATH_PASSWORD = "//input[@name='reg_passwd__']";
    public static final String XPATH_DAY = "//div[contains(@class, '_5k_5')]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, '_5k_5')]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, '_5k_5')]/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");
        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstnameField.sendKeys("Radoslaw");
        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Lazur");
        WebElement emailField = driver.findElement(By.xpath(XPATH_EMAIL));
        emailField.sendKeys("radoslaw.lazur@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("PLiskaDajAproval");
        WebElement daySelectCombo = driver.findElement(By.xpath(XPATH_DAY));
        WebElement monthSelectCombo = driver.findElement(By.xpath(XPATH_MONTH));
        WebElement yearSelectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectDay = new Select(daySelectCombo);
        Select selectMonth = new Select(monthSelectCombo);
        Select selectYear = new Select(yearSelectCombo);
        selectDay.selectByIndex(18);
        selectMonth.selectByIndex(7);
        selectYear.selectByIndex(32);
    }
}
