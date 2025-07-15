import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class elements {
    public static void main(String[] args) {
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Navigate to webpage
        driver.get("https://chatdemo.esghub.ai/");
        
        // Find all elements on the page
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));
        
        System.out.println("Total elements found: " + allElements.size());
        
        // Print visible text of each elementz
        for (WebElement element : allElements) {
            try {
                String text = element.getText().trim();
                if (!text.isEmpty()) {
                    System.out.println("Element tag: " + element.getTagName() + 
                                     " | Text: " + text);
                    // You can also get other attributes:
                    // System.out.println("ID: " + element.getAttribute("id"));
                    // System.out.println("Class: " + element.getAttribute("class"));
                }
            } catch (Exception e) {
                System.out.println("Error getting text for element: " + e.getMessage());
            }
        }
        
       // driver.quit();
    }
}