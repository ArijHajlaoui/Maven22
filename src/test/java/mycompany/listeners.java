
  package mycompany;
  
  import java.io.IOException;
  
  import org.testng.ITestContext; 
  import org.testng.ITestListener; 
  import org.testng.ITestResult;
  
  public class listeners implements ITestListener { 
	  base1 x = new base1();
  
  @Override 
  public void onTestStart(ITestResult result) { 
	  // TODO Auto-generated method stub 
	  ITestListener.super.onTestStart(result); 
	  }
  
  @Override 
  public void onTestSuccess(ITestResult result) { 
	  // TODO Auto-generated method stub 
  ITestListener.super.onTestSuccess(result); }
	
	  @Override
	  public void onTestFailure(ITestResult result) { 
		  // TODO Auto-generated method stub 
		  ITestListener.super.onTestFailure(result);
		  try {
	  x.getscreen(); 
	  } 
		  catch (IOException e) { 
			  // TODO Auto-generated catch block
	  e.printStackTrace(); 
	  } 
		  }
	 
  
  @Override 
  public void onTestSkipped(ITestResult result) { 
	  // TODO Auto-generated method stub 
	  ITestListener.super.onTestSkipped(result); }
  
  @Override 
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) { 
	  // TODO Auto-generated method stub
  ITestListener.super.onTestFailedButWithinSuccessPercentage(result); 
  }
  
  @Override 
  public void onTestFailedWithTimeout(ITestResult result) { 
	  // TODO Auto-generated method stub
  ITestListener.super.onTestFailedWithTimeout(result); 
  }
  
  @Override 
  public void onStart(ITestContext context) { 
	  // TODO Auto-generated method stub 
	  ITestListener.super.onStart(context); 
	  }
  
  @Override 
  public void onFinish(ITestContext context) { 
	  // TODO Auto-generated method stub 
	  ITestListener.super.onFinish(context); 
	  }
  }
 