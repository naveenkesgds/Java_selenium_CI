

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.List;

	public class visibleelement {
	    public static void main(String[] args) throws InterruptedException {
	   
	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the webpage (Replace with your target URL)
	            driver.get("https://chatdemo.esghub.ai/");
	            driver.manage().window().maximize();
	    		Thread.sleep(2000);
	    		// Enter the user name and password
	    		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("naveen.k@esgds.io");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[3]")).click();
	    		// Enter the OTP VALUES
	    		Thread.sleep(5000);
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[1]")).sendKeys("1");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[2]")).sendKeys("2");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[3]")).sendKeys("3");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[4]")).sendKeys("4");
	    		// Click the validate button after enter the OTP

	            // Find and print all buttons
	            List<WebElement> buttons = driver.findElements(By.xpath("//button | //input[@type='submit']"));
	            System.out.println("🔹 Buttons on the page:");
	            for (WebElement button : buttons) {
	                String text = button.getText().trim();
	                if (!text.isEmpty()) {
	                    System.out.println("  - " + text);
	                }
	            }

	            // Find and print all links
	            List<WebElement> links = driver.findElements(By.tagName("a"));
	            System.out.println("\n🔹 Links on the page:");
	            for (WebElement link : links) {
	                String text = link.getText().trim();
	                if (!text.isEmpty()) {
	                    System.out.println("  - " + text);
	                }
	            }

	            // Find and print all input fields with placeholders
	            List<WebElement> inputs = driver.findElements(By.xpath("//input[@placeholder]"));
	            System.out.println("\n🔹 Input Fields (Placeholders):");
	            for (WebElement input : inputs) {
	                String placeholder = input.getAttribute("placeholder").trim();
	                if (!placeholder.isEmpty()) {
	                    System.out.println("  - " + placeholder);
	                }
	            }

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}



