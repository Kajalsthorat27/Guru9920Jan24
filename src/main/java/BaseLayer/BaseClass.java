package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	protected static 	Properties prop;
	protected static FileInputStream fis;
	
	
	public BaseClass()
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\config.properties");
		try {
			 fis = new FileInputStream(f);
			 prop = new Properties();
			 prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void intilazation()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		String url =prop.getProperty("Url") ;
		driver.get(url);
	}

}


