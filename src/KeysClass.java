import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		Thread.sleep(3000);
		
		String city="amman";
		driver.findElement(By.id("ss")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ss")).sendKeys(city,Keys.ESCAPE);
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ss")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		
	}

}
