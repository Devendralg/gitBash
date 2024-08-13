package arrayPrograms;

public class Example {

	static 
	{
		System.out.println("sB");
		Example e = new Example();
		System.out.println(e.a);
		System.out.println(e.b);
	}

	int a = add(10,20);

	{
		//System.out.println(b);
		a=81;
		System.out.println("NSB");
	}

	private int add(int a, int b) 
	{
		System.out.println("add begin");
		int c = a+b;
		System.out.println("Add ends");
		return c;

	}
	double b = 0.2;

	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		Example e = new Example();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println("Main Ends");

	}
	static 
	{
		System.out.println("SB2");
	}

}
