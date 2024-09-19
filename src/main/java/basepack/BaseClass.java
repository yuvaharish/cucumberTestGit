package basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void browserLaunch() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
	}

	
	public void sitUrl(String url) {
		driver.get(url);
	}
	
	
	public void type(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public String pro(String key) throws IOException {
		File file = new File("C:\\Users\\jacki\\eclipse-workspace\\Demo\\src\\main\\java\\login.properties");
		FileInputStream fo = new FileInputStream(file);
		Properties po = new Properties();
		po.load(fo);
		String out=po.getProperty(key);
		return out;
	}
	
	public void closeBorowser() {
		driver.close();
	}
	
}
