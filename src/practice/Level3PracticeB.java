package practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Level3PracticeB {

	private Finder finder = new Finder();
	
	/*
	 * TODO: implement the Finder class, including the method lastIndexOf 
	 * 
	 * lastIndexOf takes two paramenters
	 *    An arraylist of Strings to search through
	 *    A String that you're searching for
	 *    
	 * firstIndexOf returns the LAST index where you encounter the given string IGNORING CASE
	 * So, if you're looking for "Apple" and you find "aPPlE", that's a match!
	 * 
	 * But because your teacher is cruel, you are forbidden from using equalsIgnoreCase
	 * 
	 */
	
	@Test
	// Don't forget, you can't use equalsIgnoreCase anywhere in your code!
	public void lastInstance_returnsCorrectIndex_whenElementIsFirst() {
		ArrayList<String> arrayList = buildArrayList(new String[] {"aPple", "orange", "orange"});
		assertEquals(0, finder.lastIndexOf(arrayList, "Apple"));
	}
	
	@Test
	// Don't forget, you can't use equalsIgnoreCase anywhere in your code!
	public void lastInstance_returnsCorrectIndex_whenElementIsLast() {
		ArrayList<String> arrayList = buildArrayList(new String[] { "orange", "APPLE"});
		assertEquals(1, finder.lastIndexOf(arrayList, "Apple"));
	}
	
	@Test
	// Don't forget, you can't use equalsIgnoreCase anywhere in your code!
	public void lastInstance_returnsCorrectIndex_whenElementIsPresentMultipleTimes() {
		ArrayList<String> arrayList = buildArrayList(new String[] { "orange", "aPpLe", "APPLE"});
		assertEquals(2, finder.lastIndexOf(arrayList, "Apple"));
	}
	
	@Test
	// Don't forget, you can't use equalsIgnoreCase anywhere in your code!
	public void lastInstance_returnsCorrectIndex_whenElementIsNotPresent() {
		ArrayList<String> arrayList = buildArrayList(new String[] { "orange", "Orange"});
		assertEquals(-1, finder.lastIndexOf(arrayList, "Apple"));	
	}
	

	private ArrayList<String> buildArrayList(String[] elements) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList(elements));
		return arrayList;
	}
	
}
