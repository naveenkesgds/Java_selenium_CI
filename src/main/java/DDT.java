import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class DDT {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
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
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[5]")).click();
		Thread.sleep(2000);
		boolean companysearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean fundresearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[2]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean inversterresearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[3]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean customresearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[4]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean controrreseacrch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[5]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean esgplaybook = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[6]/div/a")).isDisplayed();
		Thread.sleep(2000);
		boolean support = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[4]/a/div")).isDisplayed();
		Thread.sleep(2000);
		boolean Userprofile = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[4]/div")).isDisplayed();
		
		
		if (companysearch = true) {
			System.out.println("Company Search Element is presented");
		} else {
			System.out.println("Company Search Element is Not presented");
		}
		if (fundresearch = true) {
			System.out.println("Fund research Element is presented");
		} else {
			System.out.println("Fund research Element is Not presented");
		}
		if (inversterresearch = true) {
			System.out.println("inversterresearch Element is presented");
		} else {
			System.out.println("inversterresearch Element is Not presented");
		}
		if (customresearch = true) {
			System.out.println("Customer Research Element is presented");
		} else {
			System.out.println("Customer Research Element is Not presented");
		}
		if (controrreseacrch = true) {
			System.out.println("Contror reseacrch Element is presented");
		} else {
			System.out.println("Contror reseacrch Element is Not presented");
		}
		if (esgplaybook = true) {
			System.out.println("ESG playbook Element is presented");
		} else {
			System.out.println("ESG playbook Element is Not presented");
		}
		if (support = true) {
			System.out.println("Support Element is presented");
		} else {
			System.out.println("Support Element is Not presented");
		}
		if (Userprofile = true) {
			System.out.println("User Profile Element is presented");
		} else {
			System.out.println("User Profile Element is Not presented");
		}
			
	
	}
	}

