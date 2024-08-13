package hackerRamk;

import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class IndicesSumequalToTarget {
	@Test
	public void a()
	{
		int []a= {2,7,9,10};
		int target=9;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target)
				{
					System.out.println("index: "+i+" and index:"+j+" Sum:"+(a[i]+a[j]));
				}
			}
			
		}
	}
	
	@Test
	public void b()
	{
		int[]d= {2,11,15,7};
		int[] twoSum = c(d,223);
		System.out.println("Indices "+twoSum[0]+" "+twoSum[1]);
		
	}
	public int[] c(int[]nums,int target)
	{
		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			int complement = target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	@Test
	public void longestSubstring()
	{
		int longestSubString = longestSubString("abccdabccde");
		System.out.println(longestSubString);
	}
	public int longestSubString(String s)
	{
		int maxLength = 0,i=0,j=0,n=s.length();
		HashSet<Character>set= new HashSet<Character>();
		
		while(j < n)
		{
			if(!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
			}else
			{
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;
	}
	
}
