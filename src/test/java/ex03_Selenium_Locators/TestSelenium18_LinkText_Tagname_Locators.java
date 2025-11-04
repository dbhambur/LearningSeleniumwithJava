package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Tagname_Locators {

    @Description ("Verify_vwo")
    @Test
    public void test_Login_vwo(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        // Link Text - Full Text Match  or we can partial text match also but it will take more time

        WebElement a_Tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_Tag_free_trail_full_match.click();

        // or

         //WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
         //a_tag_partial_match.click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       driver.quit();

    }
}
