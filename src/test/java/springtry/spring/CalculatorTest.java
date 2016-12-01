package springtry.spring;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
  @Test
  public void add() {
    
    calculator.add(1,2);
    Assert.assertEquals(calculator.getResult(),  3);
  }

  
}
