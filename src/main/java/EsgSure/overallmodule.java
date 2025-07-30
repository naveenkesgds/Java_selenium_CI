package EsgSure;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.WaitResponse;

import net.bytebuddy.asm.Advice.Enter;

public class overallmodule {
	protected static WebDriver driver;

	static {
		driver = new ChromeDriver();
	}

	@Test
	public static void login() throws InterruptedException {

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
		Thread.sleep(2000);

	}

	@AfterTest
	public static void companyResearch() throws InterruptedException {
		Thread.sleep(2000);
		WebElement chs = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div"));
		chs.click();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		// chs.sendKeys(Keys.RETURN); This is the Fiscal year organization
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#rc_select_2")).click();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		// Choosecompany.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		// Select the Playbook
		WebElement selectPlaybook = driver.findElement(By.xpath("//*[@id=\"rc_select_4\"]"));
		Thread.sleep(2000);
		selectPlaybook.click();
		selectPlaybook.sendKeys("SFDR");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// Select key Issue
		WebElement keyissues = driver.findElement(By.xpath("//*[@id=\"rc_select_5\"]"));
		Thread.sleep(2000);
		keyissues.click();
		keyissues.sendKeys("GHG Emissions");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		// Search Question field\
		Thread.sleep(2000);
		WebElement searchquestion = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[1]/div[1]/div[3]/input"));
		searchquestion.click();
		Thread.sleep(2000);
		searchquestion.sendKeys("What are the total");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[4]/div/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div[2]"))
				.click();
		Thread.sleep(2000);
		String promptanswer = driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div > div.contents > div.chat-container.included-filters > div.chat-contents-section > div > div > div.answers"))
				.getText();
		Thread.sleep(2000);
		System.out.println(promptanswer);
	}

	@AfterTest
	public void research() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		String Question = driver.findElement(By.xpath("//div[contains(@class,'question-container')]")).getText();
		System.out.println(Question);
		Thread.sleep(2000);
		String Answer = driver.findElement(By.xpath("//div[contains(@class,'answers')]")).getText();
		System.out.println(Answer);
		Thread.sleep(2000);
		// get the value from Prompt
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div[2]"))
				.click();
		Thread.sleep(2000);
		String Reference = driver
				.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div[2]"))
				.getText();
		System.out.println(Reference);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/dieywwwv/div[2]/div[2]/div"))
				.click();
		Thread.sleep(10000);
		// Create WebDriverWait with timeout of 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		// Wait until the element is present in the DOM
		List<WebElement> elements = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("answer")));
		WebElement promt = elements.getFirst();
		System.out.println(promt);

	}

	@AfterTest
	public static void docsource() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[1]/div/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[2]")).click();
		Thread.sleep(2000);
		// Click the fiscal year
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div"))
				.click();
		Thread.sleep(2000);
		// choose the fiscal year
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/div/div/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[3]/div[1]/div/div/div[1]")).click();
		Thread.sleep(2000);
		// Apply Button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[1]/div[4]/div[1]")).click();
		Thread.sleep(2000);
		// Open Doc Button
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div.pdf-preview-container > div > div.icons-container > div.close-container > svg"))
				.click();

	}

	// History page in company research
	@AfterTest
	public static void history() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[1]/div/div[3]/a")).click();
		Thread.sleep(2000);
		//
		boolean historye = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]"))
				.isDisplayed();
		if (historye == false) {
			System.out.println("History is not displayed...");
		} else {
			System.out.println("History is displayed...");
		}
		String history = driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div.chat-history-body > div.chat-history-body-main > div"))
				.getText();
		System.out.println(history);
		Thread.sleep(2000);
	}

	@AfterTest
	public static void investorsearch() throws InterruptedException {
		// click research assistance
		driver.findElement(By.cssSelector(
				"#root > div > div > div.sidebar-container.sidebar-full > div > div.menu-section > div:nth-child(3) > div"))
				.click();
		// choose investor name
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#root > div > div > div.sidebar-container.sidebar-full > div > div.menu-section > div:nth-child(3) > div > div:nth-child(2) > a"))
				.click();
		Thread.sleep(2000);
		// Select Investor name
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div > div.contents > div.filter-section-wrapper > div.filters-section > div:nth-child(2) > div.company-select-wrapper > div > div"))
				.click();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// view playbooks button
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div > div.contents > div.chat-container.included-filters > div.chat-input-container > div > div.form-buttons-section > div.form-button-default"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rc_select_21\"]")).sendKeys("SFDR");
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rc_select_22\"]")).sendKeys("Biodiversity");
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div > div.modal-main > div > div > div.modal-body-container > div > div.prompt-main-body > div > div > div > div > div > div > div > table > tbody > tr > td:nth-child(4) > div > div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div[2]"))
				.click();
		Thread.sleep(2000);
		WebElement answer = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div"));
		Thread.sleep(2000);
		System.out.println(answer);
		Thread.sleep(2000);
		// Click on Docsource button
		driver.findElement(By.cssSelector(
				"#root > div > div > div.sidebar-container.sidebar-full > div > div.menu-section > div:nth-child(3) > div > div:nth-child(3) > a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rc_select_26\"]")).sendKeys("Blackstone");
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rc_select_27\"]")).sendKeys("FY-2024");
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/div"))
				.click();
		Thread.sleep(2000);
		// Choose All
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[3]/div/div/div/div[1]/span[4]")).click();
		Thread.sleep(2000);
		// Apply Button
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div.source-list-filters > div.source-list-filters-section > div:nth-child(4) > div.button-wrapper.apply-filter"))
				.click();
		Thread.sleep(2000);
		// Open document button
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div"))
				.click();
		// document close button
		driver.findElement(By.cssSelector(
				"#root > div > div > div.component-container.regular-container > div > div.pdf-preview-container > div > div.icons-container > div.close-container > svg"))
				.click();
		Thread.sleep(2000);
		// History Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[3]/div/div[3]/a/div/div[2]"))
				.click();
		Thread.sleep(2000);
		String Historyofinvestor = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div")).getText();
		System.out.println(Historyofinvestor);
		Thread.sleep(2000);

	}

	// This code for Playbooks
	@AfterTest
	public static void playbooks() throws InterruptedException {
		// ESG Play Book Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[6]/div/a")).click();
		Thread.sleep(2000);
		// Click on Regulation button
		driver.findElement(By.cssSelector(
				"#root > div > div > div.sidebar-container.sidebar-full > div > div.menu-section > div:nth-child(6) > div > div:nth-child(2) > a > div > div.menu-text"))
				.click();
		Thread.sleep(2000);
		// Click on Ask button from default question
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[3]"))
				.click();
		Thread.sleep(2000);
		// Select the company from company search
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div"))
				.click();
		Thread.sleep(2000);
		// Choose the company
//		driver.findElement(By.xpath("")).click();
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		// Choose your Fiscal Year
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/div"))
				.click();
		Thread.sleep(2000);
		// Choose the fiscal years
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		//Choose the fiscal year and go to the next level  code review here
            
	}

}
