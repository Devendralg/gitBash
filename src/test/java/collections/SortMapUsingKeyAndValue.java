package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapUsingKeyAndValue 
{
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("D", 1);
		hm.put("e", 4);
		hm.put("f", 3);
		hm.put("E", 2);
		
		List<Entry<String, Integer>> al = new ArrayList<>(hm.entrySet());
		

/*		Collections.sort(al, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
		});
*/		
		al.sort(Map.Entry.comparingByValue());
		System.out.println(al);
	}

}
