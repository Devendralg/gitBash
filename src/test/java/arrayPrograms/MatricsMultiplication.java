package arrayPrograms;

public class MatricsMultiplication {

	public static void main(String[] args) {

		int [][]a= {{1,2},{3,4}};
		int [][]b = {{1,2},{3,4}};

		int[][] matrixMultiplication = matrixMultiplication(a,b);
		printMaatrix(matrixMultiplication);

	}

	private static void printMaatrix(int[][] matrixMultiplication)
	{
		for(int[] row :matrixMultiplication)
		{
			for(int ele : row)
			{
				System.out.println(ele+" ");
			}
			System.out.println();
		}
	}

	private static int[][] matrixMultiplication(int[][] a, int[][] b) 
	{
		int rowFirst = a.length;
		int colFirst = a[0].length;
		int colSecond = b[0].length;

		int [][]product=new int[rowFirst][colSecond];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				product[i][j]=0;
				
				for (int k = 0; k < colFirst; k++) 
				{
					product[i][j]+=a[i][k]*b[k][j];
				}
				System.out.println(product[i][j]);
			
			}
			
			
		}
		

		return product;


	}

}
