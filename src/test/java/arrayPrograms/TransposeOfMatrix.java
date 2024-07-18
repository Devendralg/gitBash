package arrayPrograms;

public class TransposeOfMatrix {

	public static void main(String[] args) 
	{
	int [][]a= {{1,2},{3,4}};
	
	for (int[] is : a) 
	{
		for (int is2 : is) {
			System.out.print(is2+" ");
		}
		System.out.println();
	}	
	System.out.println("==================");
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a[0].length; j++) 
		{
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	
		
	}

}
