package java;

public class B  {

	private class C implements A
	{


		@Override
		public void m1() {
			System.out.println("From M1");
		}
	}

	public A getC()
	{
		C c1 = new C();
		return c1;
	}
	


}
