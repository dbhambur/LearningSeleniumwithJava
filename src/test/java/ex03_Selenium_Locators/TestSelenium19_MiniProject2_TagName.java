package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestSelenium19_MiniProject2_TagName {
    @Owner("Devendra")
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup")
    @Test
    public void vwo_free_trial_error_verify(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains("free trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement Checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        Checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
