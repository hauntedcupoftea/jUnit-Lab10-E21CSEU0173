package jUnitTestingPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.addNumbers(100, 200);
		assertEquals(300, result);
	}
}
