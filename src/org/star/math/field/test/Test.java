/**
 * 
 */
package org.star.math.field.test;

import java.math.BigInteger;

/**
 * @author Andjuel
 *
 */
public class Test {
	
	@org.junit.Test
	public void testMath(){
		BigInteger a = new BigInteger("22");
		BigInteger b = new BigInteger("2");
		a.add(b);
		a.multiply(b);
		a.subtract(b);
		a.divide(b);
	}

}
