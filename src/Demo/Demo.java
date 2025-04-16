package Demo;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser you want to use (chrome/firefox/edge): ");
        String browser = scanner.nextLine().toLowerCase();

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Invalid browser choice. Please enter either 'chrome' or 'firefox'.");
            scanner.close();
            return; 
        }
		
        
        driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		List<WebElement> ele= (List<WebElement>) driver.findElements(By.tagName("a"));
		
		for(WebElement j : ele) {
			if(j.getText().length()>0) {
				System.out.println(j.getText());
			}
		}
		
		 scanner.close();
	     driver.quit();
	}

}
