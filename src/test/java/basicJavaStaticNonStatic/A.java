package basicJavaStaticNonStatic;

public class A 
{
	static int a=10;

	public void nonStatic()
	{
		
		System.out.println(A.a);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		new A().nonStatic();
	}






	private static void method()
	{
		
	}

}
