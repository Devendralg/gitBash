package stringPrograms;

public class LongestPalindrome2 {

	public static void main(String[] args) 
	{
		String s ="mom bob anna hannah";
		String[] words = s.split(" ");
		String maxPalindrom="";
		
		for (String s1 : words) {
			String word = s1;
			String reversed = new StringBuilder(s1).reverse().toString();
			if(word.equals(reversed) && reversed.length()>maxPalindrom.length())
			{
					maxPalindrom=reversed;
			}
		}

		System.out.println(maxPalindrom);
	}
	
}
