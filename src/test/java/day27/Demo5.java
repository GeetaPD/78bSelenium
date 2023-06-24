package day27;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class A
{
	@BeforeMethod
	void m1()
	{
		Reporter.log("m1 of A",true);
	}
	
	@AfterMethod
	void m2()
	{
		Reporter.log("m2 of A",true);
	}
}


public class Demo5 {

		@Test
		public void testA()
		{
			Reporter.log("testA...",true);
		}
	
}
