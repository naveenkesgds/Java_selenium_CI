import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ElementChecking {
    public static void main(String[] args) throws InterruptedException {


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
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
            
            // Find all elements on the page
            List<WebElement> allElements = driver.findElements(By.xpath("//*")); // Selects all elements
            
            System.out.println("Total elements found: " + allElements.size());
            System.out.println("------------------------------------------------");

            // Iterate through all elements and display their details
            for (WebElement element : allElements) {
                String tagName = element.getTagName(); // Get tag name (e.g., button, input, a)
                String text = element.getText().trim(); // Get visible text (if any)
                String elementType = "Unknown"; // Default type
                
                // Identify element type based on tag name and attributes
                if (tagName.equalsIgnoreCase("button") || 
                   (tagName.equalsIgnoreCase("input") && element.getAttribute("type").equals("submit"))) {
                    elementType = "Button";
                } else if (tagName.equalsIgnoreCase("a")) {
                    elementType = "Link";
                } else if (tagName.equalsIgnoreCase("input")) {
                    elementType = "Input Field";
                } else if (tagName.equalsIgnoreCase("select")) {
                    elementType = "Dropdown";
                }

                // Display element details
                System.out.println("Element Type: " + elementType);
                System.out.println("Tag: " + tagName);
                System.out.println("Text: " + (text.isEmpty() ? "[No Visible Text]" : text));
                System.out.println("------------------------------------------------");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
