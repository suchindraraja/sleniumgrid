package selgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 
{
	@Test()
	public void method2() throws Exception
	{
		// Node2
		URL u = new URL("http://192.168.31.61:6666/wd/hub");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(u, dc);
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.close();
	}

}
