package CommonLibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {
public static WebDriver driver;
public void openbrowser(String browsername){
	switch(browsername)
	{
	case "chrome":System.setProperty("webdriver.chrome.driver", "E:\\credit\\chromedriver.exe  ");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-infobars");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	break;
	   }
}


}
 