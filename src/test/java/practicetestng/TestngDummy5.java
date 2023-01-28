package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy5 {
	
	
	//successPercentage SHOULD BE EXCECUTED COMPULSORY
	//
	
	
	
	
	public int x=10;
	@Test(successPercentage=50, invocationCount=10)
	public void method()
	{
	      if(x%2==0)
	      {
	    	  x++;
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
	    	  x++;
	    	  Assert.assertTrue(false);
	      }
	}   

	
	/*public int n = 3;
	public int m = 2;
	public int c;
@Test(successPercentage = 5,invocationCount = 10)
  public void methodex()
  {
	  if(n+m==5)
	  {
		  c++;
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  c++;
		  Assert.assertTrue(false);
	  }
	  
  }  */






}





