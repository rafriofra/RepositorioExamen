package es.egc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import es.egc.Sum;

public class TestSum {

	
	@Test
	public void testSum2() {
		assertEquals(4, Sum.sum(2, 2));
	}
	
	@Test
	public void testSumNumWithZero() {
		assertEquals(3, Sum.sum(3, 0));
		assertEquals(3, Sum.sum(0, 3));
	}
	
	@Test
	public void testSumNumNeg() {
		assertEquals(-6, Sum.sum(-3, -3));
		assertEquals(2, Sum.sum(5, -3));
	}
	
	@Test(expected=AssertionError.class)
	public void testSum2Fail() {
		assertEquals(5, Sum.sum(2, 2));
	}
	
	
	@Test(expected=AssertionError.class)
	public void testSumNumWithZeroFail() {
		assertEquals(3, Sum.sum(3, 0));
		assertEquals(0, Sum.sum(0, 3));
	}
	
	@Test(expected=AssertionError.class)
	public void testSumNumNegFail() {
		assertEquals(6, Sum.sum(-3, -3));
		assertEquals(-2, Sum.sum(5, -3));
	}
	
	@Test(expected=AssertionError.class)
	public void testSum3Fail() {
		assertEquals(3, Sum.sum(1,1, 2));
	}
	
	@Test
	public void testSum3() {
		assertEquals(4, Sum.sum(1,1, 2));
	}
	
	@Test
	public void testSumMitad(){
		assertEquals(15, Sum.mitadSum(10, 20));
	}
}