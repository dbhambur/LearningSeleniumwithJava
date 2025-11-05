package ex07_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_22 {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        // Find the xpath for the WebTable
        // //table[@summary=“Sample Table”]

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        //rows and coloumns

        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

        for(int i=0;i <rows_tables.size();i++){
            List<WebElement>col=rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }

        }


    }

}
