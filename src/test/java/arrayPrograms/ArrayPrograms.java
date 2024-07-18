package arrayPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class ArrayPrograms {
	@Test
	public void print()
	{
		int a[]= {0,2,3,5,1};
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void print2()
	{
		int a[]= {0,2,3,5,1};
		for (int i:a) 
		{
			System.out.println(i);	
		}
	}
	
	@Test
	public void averageOfElementsInArray()
	{
		int a[]= {0,2,3,5,1};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum+=a[i];
		}
		Double average = (double) (sum/a.length);
		System.out.println(average);

	}
	@Test
	public void copyOneElementArrayToAnotherArrayInReverse()
	{
		int a[]= {1,2,3,4};
		int alen = a.length-1;
		int b[]=new int [a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[alen--];
		}
		System.out.println(Arrays.toString(b));
	}
	
	@Test
	public void mergeTwoArrays()
	{
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		
		int c[]=new int[a.length+b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	
		
	}
	
	@Test
	public void mergeTwoArrays2()
	{
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		
		int c[]=new int[a.length+b.length];
		
		for (int i = 0; i < c.length; i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}else
			{
				c[i]=b[i-a.length];
			}
			
		}
		System.out.println(Arrays.toString(c));
		
		
	}
	
	@Test
	public void mergeTwoArray()
	{
		 int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};

	        // Merge arrays using IntStream
	        int[] mergedArray = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();

	        // Print the merged array
	        System.out.println(Arrays.toString(mergedArray));
		
		
	}
	

}
