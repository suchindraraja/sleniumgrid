package selgrid;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node3 
{
	@Test()
	public void method3() throws Exception
	{
		//Node3
		URL u=new URL("http://192.168.31.61:7777/wd/hub");
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		RemoteWebDriver driver=new RemoteWebDriver(u,dc);
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.close();
	}

	

}
