package arrayPrograms;

import java.util.Arrays;

public class SwapHalfOfArray {

	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4};
		
		int midPoint=arr.length/2;
		
		for (int i = 0; i <midPoint ; i++) 
		{
			int temp=arr[i];
			 arr[i]= arr[midPoint+i];
			 arr[midPoint+i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
