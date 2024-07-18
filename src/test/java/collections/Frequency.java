package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;import org.openqa.selenium.chromium.AddHasLaunchApp;


public class Frequency {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,2,1,1,1);

		int maxValue=0;
		int key=list.get(0);
		for (int i = 0; i < list.size(); i++)
		{
			int frequency = Collections.frequency(list, list.get(i));
     //       maxValue = (frequency > maxValue) ? (key = list.get(i)) : maxValue;

			 maxValue=(frequency > maxValue)? frequency:maxValue;
			 key =(frequency > maxValue)?list.get(i):key;
		}	
		System.out.println(((maxValue==1)?"One Time":key+"\t"+maxValue));
	}
}
