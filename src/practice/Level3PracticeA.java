package practice;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

public class Level3PracticeA {

	/*
	 * The League is having a fishing contest!  The weight of each fish a person caught is stored in an array
	 * All fish that were less than 3 pounds had to be thrown back and didn't count towards the contest
	 * 
	 * TODO: Complete the FishingContest class so the following tests pass
	 */
	static final double SMALL_NUMBER = 0.0001;
	double[] johnsCatches = new double[] {12, 2.9, 3}; 
	double[] esmesCatches = new double[] {2, 2.9, 3.3}; 
	double[] davidsCatches = new double[] {}; 
	double[] isisCatches = new double[] {1, 2.4, 3, 2, 1, 1, 1, 1, 1, }; 

	/*
	 * Each person will receive a certificate listing the weight of the biggest fish they caught
	 * TODO: Write the findBiggestFish method to help do this
	 */
	@Test
	public void test_findBiggestFish_willReturnLargest() {
		HashMap<String, double[]> allCatches = new HashMap<>();
		allCatches.put("john", johnsCatches);
		allCatches.put("esme", esmesCatches);
		allCatches.put("isis", isisCatches);
		allCatches.put("david", davidsCatches);

		FishingContest contest = new FishingContest(allCatches);
		assertEquals(12, contest.findBiggestFish("john"), SMALL_NUMBER);
		assertEquals(3.3, contest.findBiggestFish("esme"), SMALL_NUMBER);
		assertEquals(3, contest.findBiggestFish("isis"), SMALL_NUMBER);
		assertEquals(0, contest.findBiggestFish("david"), SMALL_NUMBER);
	}

	/*
	 * The winner is the person whose fish's total weight was the most
	 * Remember that fish less than 3 pounds were thrown back
	 */
	@Test
	public void test_findWinner() {
		HashMap<String, double[]> allCatches = new HashMap<>();
		allCatches.put("john", johnsCatches);
		allCatches.put("esme", esmesCatches);
		
		FishingContest contest = new FishingContest(allCatches);
		assertEquals("john", contest.findWinner());
	}

	@Test
	public void test_findWinner_whenThrownBackFishMakeADiffference() {
		HashMap<String, double[]> allCatches = new HashMap<>();
		allCatches.put("isis", isisCatches);
		allCatches.put("esme", esmesCatches);

		FishingContest contest = new FishingContest(allCatches);
		assertEquals("esme", contest.findWinner());
	}
}