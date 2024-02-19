package org.eamples.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        String title=driver.getTitle();
       String source= driver.getPageSource();
       String curent= driver.getCurrentUrl();
       System.out.println(title+"  "+curent+"  "+source);
       if(source.contains("en-IN"))
           System.out.println("Keyword Present");
       else
           System.out.println("Keyword not Present");
    }
}
