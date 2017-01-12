package es.egc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRes {
	
	@Test
	public void testRes2() {
		assertEquals(0, Res.res(2,2));
	}
	
	
	@Test
	public void testResNumWithZero() {
		assertEquals(3, Res.res(3,0));
		assertEquals(-3, Res.res(0,3));
	}
	
	@Test
	public void testResNumNeg() {
		assertEquals(0, Res.res(-3,-3));
		assertEquals(3, Res.res(0,-3));
	}
	
	@Test(expected=AssertionError.class)
	public void testRes2Fail() {
		assertEquals(1, Res.res(2,2));
	}
	
	
	@Test(expected=AssertionError.class)
	public void testResNumWithZeroFail() {
		assertEquals(3, Res.res(3,0));
		assertEquals(3, Res.res(0,3));
	}
	
	@Test(expected=AssertionError.class)
	public void testResNumNegFail() {
		assertEquals(-6, Res.res(-3,-3));
		assertEquals(-3, Res.res(0,-3));
	}
	
	@Test
	public void testRes3() {
		assertEquals(1, Res.res(6,3,2));
	}
	
	@Test(expected=AssertionError.class)
	public void testRes3Fail() {
		assertEquals(0, Res.res(3,2,27));
	}

}