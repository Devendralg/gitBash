package stringPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String s1="rac1";
		String s2="race";

		if(s1.length() == s2.length())
		{
			char[] s11 = s1.toCharArray();
			char[] s22 = s2.toCharArray();
			
			Arrays.sort(s11);
			Arrays.sort(s22);
			System.out.println((Arrays.equals(s11, s22))?"Anagaram":"Not Anagram");
			

		}else
		{
			System.out.println("Not Anagram");
		}





	}

}
