import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Chrome
//		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "C:\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		
		
		
		

	}

}
