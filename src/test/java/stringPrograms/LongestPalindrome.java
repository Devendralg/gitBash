package stringPrograms;

public class LongestPalindrome {

	public static void main(String[] args) 
	{
		String s ="mom bob anna hannah1";
		String[] words = s.split(" ");
		String maxPalindrom="";
		
		for (String s1 : words) {
			String word = s1;
			char[] charArray = s1.toCharArray();
			String reversed = reverseArray(charArray);;
			if(word.equals(reversed))
			{
				if(reversed.length()>maxPalindrom.length())
				{
					maxPalindrom=reversed;
				}
			}
		}

		System.out.println(maxPalindrom);
	}
	public static String reverseArray(char[] array) {
		StringBuilder sb = new StringBuilder(new String(array));
		sb.reverse();
		return sb.toString();
	}
}
