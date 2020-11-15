import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
	}

}
