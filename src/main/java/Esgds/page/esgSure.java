package Esgds.page;

import java.lang.ref.Reference;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class esgSure {

	protected static WebDriver driver;

	static {
		driver = new ChromeDriver();
	}

	public void loginpage() throws InterruptedException {
		driver.get("https://chatdemo.esghub.ai/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("naveen.k@esgds.io");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#root > div > div.layout-body > div > div > div > div.form-button")).click();
		Thread.sleep(2000);
		// Enter the OTP VALUES
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[2]")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[3]")).sendKeys("3");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/input[4]")).sendKeys("4");
	}

	// COMPANY RESEARCH PAGE
	public void companyResearchpage() throws InterruptedException {
		Thread.sleep(2000);
		WebElement chs = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div"));
		chs.click();
		Thread.sleep(5000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		// chs.sendKeys(Keys.RETURN);
		new Actions(driver).sendKeys(Keys.ENTER).perform();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#rc_select_2")).click();
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		// Choosecompany.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		// Select the Playbook
		WebElement selectPlaybook = driver.findElement(By.xpath("//*[@id=\"rc_select_4\"]"));
		selectPlaybook.click();
		selectPlaybook.sendKeys("SFDR");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// Select key Issue
		WebElement keyissues = driver.findElement(By.xpath("//*[@id=\"rc_select_5\"]"));
		keyissues.click();
		keyissues.sendKeys("GHG Emissions");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		// Search Question field\
		Thread.sleep(2000);
		WebElement searchquestion = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[1]/div[1]/div[3]/input"));
		searchquestion.click();
		searchquestion.sendKeys("Is the company active in the fossil fuels sector?");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[4]/div/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div[2]"))
				.click();
	}

	// Research or prompt page here the asking prompt answer coming
	public void research() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		String Question = driver.findElement(By.xpath("//div[contains(@class,'question-container')]")).getText();
		System.out.println(Question);
		Thread.sleep(2000);
		String Answer = driver.findElement(By.xpath("//div[contains(@class,'answers')]")).getText();
		System.out.println(Answer);
		Thread.sleep(2000);
		//get the value from Prompt 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div[2]")).click();
		Thread.sleep(2000);
		String Reference = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div[2]")).getText();
		System.out.println(Reference);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div[2]/div[2]/div")).click();
		Thread.sleep(10000);
		//10 wait and quit the widow 
		driver.quit();
		
        		

	}

	public static void main(String[] args) throws InterruptedException {
		esgSure element = new esgSure();
		element.loginpage();
		element.companyResearchpage();
		element.research();
		

	}

}
