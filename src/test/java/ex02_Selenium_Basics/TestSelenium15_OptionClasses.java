package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionClasses {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        //
        chromeOptions.addArguments("--headless"); // Headless means running in the backend but you will not see the browser
        //chromeOptions.addArguments("--window-size=800,600")
        //chromeOptions.addArguments("--start-maximized")
        //chromeOptions.addArguments("--incognito"); // this is used when you don't want to store browser history

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
