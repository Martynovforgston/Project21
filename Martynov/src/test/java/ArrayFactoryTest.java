import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.ArrayFactory;

public class ArrayFactoryTest {

	static int[] array;
	
	@BeforeClass
	public static void testCreateBeforeClass() {
	
		ArrayFactory factory = new ArrayFactory();
		array = factory.create();
	}
	
	@Test
	public void testArrayClass() {
		assertTrue(array.length == 14);
		
		for (int i = 0; i < array.length; i++) {
			assertNotNull(array[i]);
		}
	}
}