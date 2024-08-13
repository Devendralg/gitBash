package java;

public class Example {

	double b = 0.2;
	static 
	{
		System.out.println("sB");
		Example e = new Example();
		System.out.println(e.a);
	}

	int a = add(10,20);

	{
		a=81;
		System.out.println("NSB");
	}

	private int add(int i, int j) 
	{
		System.out.println("add begin");
		int c = i+j;
		System.out.println("Add ends");
		return c;

	}

	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		Example e = new Example();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println("Main Ends");

	}
	static {
		System.out.println("SB2");
	}

}
