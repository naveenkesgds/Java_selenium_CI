package Esgds.page;

import java.sql.Driver;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementverified {

	protected static WebDriver driver;

	static {
		driver = new ChromeDriver();
	}

	public void modulecheck() throws InterruptedException {
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
		WebElement companyResearch = driver.findElement(By.xpath("//div[contains(@class,'menu-text')]"));
		String CompanyString = companyResearch.getText();
		boolean companycheck = companyResearch.isDisplayed();
		System.out.println(CompanyString);
		// Company check
		if (companycheck == true) {
			System.out.println("Company Research option is displayed in ESG Sure for users");
			boolean research = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/a"))
					.isDisplayed();
			if (research == true) {

				System.out.println("Research icon presented in Company Research Module");
			} else {
				System.out.println("That Reasearch module not presented in company Research ");

			}
		} else {
			System.out.println("Company Research option not presented in ESG Sure  webpage");
		}
		// Custom Research fields
		boolean customresearch = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[2]/div/a")).isDisplayed();
		Thread.sleep(2000);

		if (customresearch == true) {
			System.out.println("Custom Research is visible in ESG sure");

		} else {
			System.out.println("Custom Research is not visible in ESG sure");
		}
		WebElement foundResearch = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[2]/div/a"));
		foundResearch.click();
		Thread.sleep(2000);
		String Stringoffound = foundResearch.getText();
		boolean Foundtext = foundResearch.isDisplayed();
		if (Foundtext == true) {
			System.out.println("found research is visible in ESG Sure" + Stringoffound);

		} else {
			System.out.println("found research element is not visible in ESG Sure ");
		}
		String countryelement = driver.findElement(By.xpath("(//div[contains(@class,'input-wrapper')])[1]")).getText();
		if (countryelement != null) {
			System.out.println("Country Element is visible in ESG Sure" + countryelement);
		} else {

			System.out.println("Country Element is not visible in ESG Sure ");
		}
		String companyname = driver.findElement(By.xpath("(//div[contains(@class,'input-wrapper')])[2]")).getText();
		if (companyname != null) {
			System.out.println("Company name elemenet visible in ESG Sure" + companyname);
		} else {
			System.out.println("company name  fields is not visible in ESG Sure");
		}
		String fiscalyear = driver.findElement(By.xpath("(//div[contains(@class,'input-wrapper')])[3]")).getText();
		if (fiscalyear != null) {
			System.out.println("fiscal year is visible in ESG sure" + fiscalyear);
		} else {
			System.out.println("fiscal year is not visible in ESG sure" + fiscalyear);
		}
		String disclousertype = driver.findElement(By.xpath("(//div[contains(@class,'input-wrapper')])[4]")).getText();
		if (disclousertype != null) {
			System.out.println("Discloser Type is Visible in the ESG Sure" + disclousertype);
		} else {
			System.out.println("Disclouser type is not visible in the ESG sure");
		}

		// Supports creation
		WebElement support = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[4]/a[1]/div"));
		boolean supportcondition = support.isDisplayed();

		if (supportcondition == true) {
			System.out.println("Support button visible in the ESG Sure");
		} else {
			System.out.println("Support button not visible in the ESG Sure");
		}
		WebElement setting = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[4]/a[2]/div"));
		boolean settingcheck = setting.isDisplayed();
		if (settingcheck == true) {
			System.out.println("Setting element Visible in the ESG Sure Response");
		} else {
			System.out.println("Setting element not Visible in the ESG Sure Response");
		}
		boolean profile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[4]/div")).isDisplayed();
		if (profile == true) {
			System.out.println("User profile visible in the ESG sure");
		} else {
			System.out.println("User profile not visible in the ESG sure");
		}

	}

	// SELECT * FROM "***MAIN METHODS***"
	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(2000);
		Elementverified acessmethod = new Elementverified();
		acessmethod.modulecheck();
		//

	}

}
