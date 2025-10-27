package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium04 {
    public static void main(String[] args) {

        //Web driver hierarchy

        //SearchContext(I) -> (2)
        // -> Webdriver(I) (10) ->
        // RemoteWebdriver (C) (15)
        //      //
        // -> ChromiumDriver(C) 25 ->
        // Edgedriver (C)(45)

        // SearchContext - Interface - findElement, and Findelements - GGF (Great Grand Father)
        //Web driver - Interface - some incomplete functions - GF
        // Remote Webdriver - class - It also has some functions - F
        // Chromedriver, FirfoxDriver, Edgedriver, Safaridriver, Internet explorer id


        //SerachContext driver = new EdgeDriver();
        //SerachContext driver = new Firefoxdriver();
        //SerachContext driver2 = new InternetExplorerDriver();


        //WebDriver driver = new ChromeDriver();
        //RemoteWebdriver driver 1 = new ChromeDriver();
        //Chromedriver driver2 = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on Chrome or Edge ? (2-3%)
        ChromeDriver driver = new ChromeDriver();

        // 2. Do you want to run on chrome then change to Edge ? (96%)
        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver();

        //3. Do you want to run on multiple browser, aws machine ? 2%
        // RemoteWebDriver driver (with GRID) -Advance (Last 2 sessions)




    }

}
