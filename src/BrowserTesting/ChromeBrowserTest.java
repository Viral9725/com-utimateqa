package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //maximise the Browser
        driver.manage().window().maximize();

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the Current Url
        System.out.println("Current url: " + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page Source" + driver.getPageSource());

        //find the Email Element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("viral1234@gmail.com");

        //find the Password Field Element and type the password
        driver.findElement(By.name("user[password]")).sendKeys("Viral1234");

        //close the Browser
        driver.close();
    }

}
