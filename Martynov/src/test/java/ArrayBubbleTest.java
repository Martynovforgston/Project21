import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.ArrayBubble;

public class ArrayBubbleTest {

static int[] array;
@BeforeClass
public static void testBeforeClass() {
array = new ArrayBubble().sort();
}
@Test
public void testBubbleClass() {
for (int i = 0; i < array.length - 1; i++)
{
assertTrue(array[i] <= array[i + 1]);
}
}
@AfterClass
public static void testAfterClass() {
array = null;
}

}