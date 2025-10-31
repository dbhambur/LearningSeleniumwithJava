package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_Classname_Name {

    @Description("TC#1 - Verify that with invalid login, error message is ")
    @Owner("Devendra Bhambure")
    @Test
    public void test_vwo_login_invalid_login(){

        WebDriver driver =new ChromeDriver();
        driver.get ("https://app.vwo.com");

        //Maximize the window
        driver.manage().window().maximize();

        //Step 1 - Find the Email id and enter the admin@admin.com.
        //Step 2 - Find the password and enter the 1234.
        //Step 3 - Find the submit and click on the button.
        //Step 4 - wait sometime
        //Step 5 - Verify message error message

       WebElement email_input_box = driver.findElement(By.id("login-username" ));
       email_input_box.sendKeys("admin@admin.com");

       //Step 2 - Find the password inputbox and enter the password

        WebElement password_input_box = driver.findElement(By.name("password" ));
        password_input_box.sendKeys("12345");

        //Step 3- Find the submit button and click on it.

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        // Step -4 Wait for sometime
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

        //Step -5 Verify the error message

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        //Step -6 we have added the TestNG assertion to Verify

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }
}

