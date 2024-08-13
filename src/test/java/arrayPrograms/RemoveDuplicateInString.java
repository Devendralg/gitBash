package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicateInString {
	
	public static void main(String[] args) {
		  String s="india";
	        String s1="";
	        CharSequence charArray = s;
	        
	        for(int i=0; i<s.length(); i++)
	        {
	        	
	            if(!s1.contains(charArray))
	            {
	            	s1+=s.charAt(i);
	            	
	            }
	        }
	        System.out.println(s1);

	}

}
