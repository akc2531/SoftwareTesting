/*Check if title is correct by using edge drive browser */

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SecondScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.get("https://gmail.com");
    driver.manage().window().maximize();
    String title=driver.getTitle();
    if(title.equals("Gmail"))
        System.out.println("Title is correct");
    else
        System.out.println("Title is incorrect");
    //driver.close();
  }
}
