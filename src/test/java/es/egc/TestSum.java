package es.egc;

import static org.junit.Assert.assertEquals;

import org.junit.*;




public class TestSum{
	
	@Test
	public void testSuma(){
		assertEquals(6, sum(2,4));
	}

	@Test(expected=AssertionError.class)
	public void testCeros(){
		assertEquals(6, sum(0,4));
		assertEquals(6, sum(4,0));
	}
	
	@Test
	public void testNegativos(){
		assertEquals(10, sum(12,-2));
		assertEquals(-7, sum(-4,-3));
	}
	
	@Test
	public int sum(int a, int b){
		return sum(a, b);
	}
}
