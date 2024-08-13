package stringPrograms;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Regex1 {

	@Test
	public void One()
	{
		String s="$9#7A4Bc";
		String n = s.replaceAll("[^0-9]","");
		String ch = s.replaceAll("[^A-Za-z]", "");
		int sum=0;

		for (int i = 0; i < n.length(); i++) {
			sum += Character.getNumericValue(n.charAt(i));

		}
		System.out.println(ch+sum);
	}

	@Test
	public void Two()
	{
		String s="$#28!&33AB#C";//33 28 AB C

		String[] num = s.split("[^0-9]");
		String[] ch = s.split("[^A-Z]");

		for (int i = num.length-1; i>=0; i--) {
			if(num[i] !="")
				System.out.print(num[i]+" ");
		}

		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!="")
				System.out.print(ch[i]+" ");
		}


	}

	@Test
	public void Three()
	{
		String s = "I Love Java";
		String r = s.replaceAll(" ","");
		int l=r.length()-1;

		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) ==' ')
			{
				System.out.print(s.charAt(i));
			}else
			{
				System.out.print(r.charAt(l--));
			}
		}
	}

	@Test
	public void Four()
	{
		String s="a3b2c1";

		for (int i = 0; i < s.length()-1; i+=2)
		{
			int n = Character.getNumericValue(s.charAt(i+1));
			String d=""+s.charAt(i);
			System.out.print(d.repeat(n));
		}

	}
	@Test
	public void Five()
	{
		String s="aabbbcdd";
		int c=1;
		for (int i = 0; i < s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				c++;
			}else
			{
				System.out.print(s.charAt(i)+""+c);
				c=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+c);
	}

}
