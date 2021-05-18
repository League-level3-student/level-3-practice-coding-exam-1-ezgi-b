package practice;

import java.util.HashMap;

public class FishingContest {
	private HashMap<String, double[]> fish;
	
	private HashMap<String, Double> totals;
	
	public FishingContest(HashMap<String, double[]> fish) {
		this.fish = fish;
		totals = new HashMap<String, Double>();
		totalFish();
	}
	
	public double findBiggestFish(String name) {
		if(fish.get(name).length == 0) return 0.0;
		double[] temp = fish.get(name);
		double biggest = temp[0];
		for(double d: temp) {
			if(d > biggest) biggest = d;
		}
		if(biggest<3) return 0.0;
		return biggest;
	}
	
	public void totalFish() {
		for(String d: fish.keySet()) {
			double total = 0;
			for(double n: fish.get(d)) {
				if(n>=3) {
					total+=n;
				}
			}
			totals.put(d, total);
		}
	}
	
	public String findWinner() {
		String winner = "";
		double d = 0;
		for(String s: fish.keySet()) {
			if(totals.get(s) > d) {
				d = totals.get(s);
				winner = s;
			}
		}
		return winner;
	}
}
