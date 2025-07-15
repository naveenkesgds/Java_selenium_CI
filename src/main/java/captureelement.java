

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

	public class captureelement {
		 private static WebDriver driver;

		    // Private constructor to prevent direct instantiation
		    private  void DriverManager()	 {}

		    // Method to initialize WebDriver globally (Singleton Pattern)
		    public static WebDriver getDriver() {
		        if (driver == null) {
		            WebDriverManager.chromedriver().setup(); // Automatically setup ChromeDriver
		            driver = new ChromeDriver();
		        }
		        return driver;
		    }
	    public static void main(String[] args) {
	       // WebDriver driver = new ChromeDriver();
	        driver.get("https://chatdemo.esghub.ai/");

	      
	    }
	}


