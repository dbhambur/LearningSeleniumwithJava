package ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_NoHttp {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
       // driver.get("bing.com"); // note :- without https it won't work
        driver.get("https://bing.com");
        driver.quit();
    }
}
