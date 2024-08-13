package arrayPrograms;

public class AA {
	
	int a=20;
	
	{
		a=89;
		System.out.println("NSB-1");
		System.out.println(a);
	}

	{
		System.out.println("NSB-2");
		int b=15;
		System.out.println(b);
	}
	
	int b=91;
	
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		AA a = new AA();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println("Main Ends");
		
	}
}
