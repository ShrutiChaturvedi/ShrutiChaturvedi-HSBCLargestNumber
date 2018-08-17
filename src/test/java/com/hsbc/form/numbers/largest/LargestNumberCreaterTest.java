package com.hsbc.form.numbers.largest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LargestNumberCreaterTest
{
	
	@Test
	public void shouldCreateLargestNumber() {
		List<Integer> numbers = Arrays.asList(10,2);
		assertNotNull(LargestNumberCreator.printLargest(numbers));
		assertEquals(LargestNumberCreator.printLargest(numbers), getLargestNumber(numbers));
	}
	
	/**
	 * Intentionally created the below method not similar as the one in LargestNumberCreator class
	 * @param numList
	 * @return
	 */
	private String getLargestNumber(List<Integer> numList) {
		StringBuilder stringBuilder = new StringBuilder();
				
		Collections.sort(numList, new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				String XY = x.toString() + y.toString();
				String YX = y.toString() + x.toString();
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
         
		for (Integer integer : numList) {
			stringBuilder.append(integer);
		}
		
		return stringBuilder.toString();
	}

}
