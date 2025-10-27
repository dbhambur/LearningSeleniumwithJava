package ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Assertion_TestNG {

    @Description("Verify that little is visible")
    @Test
    public void test_selenium_assertion() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotBlank().isNotNull().isEqualTo("https://www.google.com");

        driver.quit();

    }


    }

