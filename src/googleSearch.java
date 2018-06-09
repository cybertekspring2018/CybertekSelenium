import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/search?q=spoon");
	}

}
