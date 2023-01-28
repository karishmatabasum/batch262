package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy6 {
	
	//PRIORITY TAKEN AS EITHER 0 OR 1
	
	//dependsOnMethods------below method will be skipped 
	//                -------when above method is failed
	
	@Test(priority=0)
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(true);
	}
	
	@Test(priority=1, dependsOnMethods={"openbrowser"})
	public void login() 
	{
		System.out.println("do login");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods={"login"})
	public void sendMail()
	{
		System.out.println("send a mail");
	}
	
	@Test(priority=3, dependsOnMethods={"openbrowser"})
	public void closebrowser()
	{
		System.out.println("browser closed");
	}


}
