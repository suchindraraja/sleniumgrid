package selgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllNodes 
{
	@Test()
	@Parameters({"nodeUrl","siteUrl"})
	public void method(String nurl,String surl) throws Exception
	{
		URL u1=new URL(nurl);
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get(surl);
		Thread.sleep(5000);
		driver1.close();
	}

}
