package stringPrograms;

public class R {

	public static void main(String[] args) {
		
		s2("a@37$12*");
	}
	private static void s2(String string)
	{
		String[] numbers = string.split("[^0-9]");
		for(int i=numbers.length-1; i>=0; i--)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
