package questao8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class NumeroConcatTest {
	
	@Test
	/*
	 * Testa o limite da função
	 */
	public void testNumBuilderLimit() {
		Integer a = 10256;
		Integer b = 512;
		Integer c = -1;
		
		Assert.assertEquals(c,  Integer.valueOf(NumeroConcat.numBuilder(a, b)));
	}
	
	@Test
	public void testNumBuilder() {
		Integer a = 220;
		Integer b = 550;
		Integer c = 252500;
		
		Assert.assertEquals(c,  Integer.valueOf(NumeroConcat.numBuilder(a, b)));
	}

}
