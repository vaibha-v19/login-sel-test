package DemoTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGt {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void SampleAutomation() throws Exception {
        // Navigate to the login page
        driver.get("https://practice.expandtesting.com/login");
        Thread.sleep(2000); // Wait for 2 seconds to see the page load

        // Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(1000); // Wait for 1 second to see the window maximize

        // Locate the username input field and enter the username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("practice");
        Thread.sleep(1000); // Wait for 1 second to see the username being entered

        // Locate the password input field and enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        Thread.sleep(1000); // Wait for 1 second to see the password being entered

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000); // Wait for 2 seconds to see the login action

        // Print the current URL after login
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL after login: " + currentUrl);

        // Verify successful login by checking the current URL
        String expectedUrl = "https://practice.expandtesting.com/secure"; // Update this to the correct expected URL
        Assert.assertEquals(currentUrl, expectedUrl, "Login failed or URL did not match!");

        // Print success message
        System.out.println("Login test executed successfully.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}