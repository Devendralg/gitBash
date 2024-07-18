package arrayPrograms;

public class MatrixMul {

	public static void main(String[] args) {
		
		int a[][]= {{1,1}};
		int b[][]= {{1,1},{1,1}};
		
		int[][] prod = matrixMultiplication(a,b);
		
	matrixPrint(prod);
	
	}
	public static void matrixPrint(int [][]s) 
	{
		for(int[]row :s)
		{
			for(int ele:row)
			{
				System.out.print(ele+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		
		int aRow = a.length;
		int aColLength = a[0].length;
		int bColLength = b[0].length;
		
		int [][]prod=new int[aRow][bColLength];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < bColLength; j++) 
			{
				//prod[i][j]=0;
				
				for (int k = 0; k <aColLength ; k++) 
				{
					prod[i][j] +=a[i][k]*b[k][j];
				}
			}
		}
		return prod;
		
		
		
	}

}
