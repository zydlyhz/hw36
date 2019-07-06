package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PrimeNumberCheckerTestDR {
	
	@DataProvider(name="prime number")
	
	public static Object[][] primeNumbers() {
		return new Object[][] {
			{2, true},
			{3, true},
			{4, false}
		};
	}
	
  @Test(timeOut=1000, dataProvider = "prime number", groups = {"qa"})
  public void f(int number, boolean expected) {
  
	  System.out.println(number + (PrimeNumberChecker.dr(number)? "- Prime number": "- Not prime number"));
	  
	  assertThat(expected, equalTo(PrimeNumberChecker.dr(number)));
  }
  
}