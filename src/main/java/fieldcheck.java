import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class fieldcheck {
	
      public static void main(String[] args) {
      

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to your target webpage
            driver.get("https://chatdemo.esghub.ai/");
            //Here We can  check the URL 

            driver.manage().window().maximize();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@name='login']")).sendKeys("naveen.k@esgds.io");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[3]")).click();
            // Locate all input fields and text areas (you can modify this to locate other types of elements)
            List<WebElement> inputFields = driver.findElements(By.xpath("//input"));

            // Print the count of input fields
            System.out.println("Total input fields found: " + inputFields.size());

            // Iterate over each input field and get the value
            for (WebElement field : inputFields) {
                @SuppressWarnings("deprecation")
				String value = field.getAttribute("value");
                System.out.println("Field Value: " + value);
            }

            // Optionally, you can do the same for other types of form elements like <textarea>, <select> etc.
            List<WebElement> textAreas = driver.findElements(By.tagName("textarea"));
            for (WebElement textArea : textAreas) {
                String value = textArea.getText();
                System.out.println("TextArea Value: " + value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Wont Close the driver Right Now 
            //driver.quit();
        }
    }
}
