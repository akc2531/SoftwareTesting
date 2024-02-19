package org.eamples.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.close();
        driver.get("https://gmail.com");
        driver.quit();
    }
}
