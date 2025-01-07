package QA.QA;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	QaTest tester= new QaTest();
    @Test
   
    public void test1 () {
    	int a= 1;
    	int b=3;
    	String expected =  "b";
    	String result = tester.f1(a, b);
    	assertEquals(expected, result);
    }
    @Test
    
    public void test2 () {
    	int a= 5;
    	int b=1;
    	String expected =  "b";
    	String result = tester.f1(a, b);
    	assertEquals(expected, result);
    }
    @Test
    
    public void test3 () {
    	int a= 3;
    	int b=3;
    	String expected =  "a";
    	String result = tester.f1(a, b);
    	assertEquals(expected, result);
    }
}
