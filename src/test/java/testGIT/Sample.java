package testGIT;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Sample {

@Test
public void launch() throws InterruptedException {
		// TODO Auto-generated method stub
				
System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
				
driver.manage().window().maximize();  // maximize the browser window
				
driver.manage().deleteAllCookies(); 
				
driver.get("https://money.rediff.com/index.html");

			}

		}
	


