package practice;

import java.util.ArrayList;

public class Finder {
	public int lastIndexOf(ArrayList<String> list, String target){
		int index = -1;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).toLowerCase().equals(target.toLowerCase())) {
				index = i;
			}
		}
		return index;
	}
}
