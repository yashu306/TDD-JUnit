package tdd_;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
		MyClass m =new MyClass();
		String out1=m.compute("AAbcdef");
		assertEquals("bcdef",out1);
		
		String out2=m.compute("aAbcdef");
		assertEquals("abcdef",out2);
		
		
	}

}
