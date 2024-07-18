package arrayPrograms;

import org.testng.annotations.Test;

public class MissingNumberInAnArray {

	@Test
	public void missingNumber()
	{
		int []a= {1,3};
		int i=0;



	for (int j = 0; j <=10; j++) 
		{
			if(i<a.length && a[i] ==j)
			{
				i++;
			}else
			{
				System.out.println(j);

			}
		}
	}

}
