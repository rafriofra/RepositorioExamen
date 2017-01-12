package es.egc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import es.egc.Par;

public class TestPar {

	
	@Test
	public void testPar() {
		assertEquals(true, Par.esPar(20));
	}
	
	
}