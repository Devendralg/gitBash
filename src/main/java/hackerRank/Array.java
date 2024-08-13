package hackerRank;

import org.testng.annotations.Test;

public class Array {

	@Test
	public void main() 
	{
		int []a= {1,2,3,4,5,6,7,8,9,10};
		int target=9;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("Index: "+i+" Value:"+a[i]+" index: "+j+" Value:"+a[j]);
					
				}
			}
		}
		
	}

}
