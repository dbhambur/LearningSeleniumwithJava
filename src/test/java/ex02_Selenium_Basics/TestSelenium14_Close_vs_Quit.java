package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_vs_Quit {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //write the code
        // Wait

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit(); // Note : - It will close all the tabs. Session id = = null
        //driver.close(); // Note: Close will close the current tab, not the session (not the all tabs)
                        // Session id != null



    }
}
