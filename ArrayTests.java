import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

@Test 
	public void testReverseInPlace2() {
    int[] input2 = {2,3,4,5,0};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{0,5,4,3,2}, input2);
	}

@Test
  public void testReversed2() {
    int[] input3 = {2,5,6,4};
    assertArrayEquals(new int[]{4,6,5,2}, ArrayExamples.reversed(input3));
  }

@Test 
	public void testaverageWithoutLowest() {
    double[] input4 = {2.3,3.5,4.6,5.7,0.0};
    double actualAnswer = ArrayExamples.averageWithoutLowest(input4);
    assertEquals(4.02, actualAnswer, 0.01);
	}
}
