package arrayPrograms.copy;

import org.testng.annotations.Test;

public class BasicArrayPrograms {



	@Test
	public void usingForLoop()
	{
		int []a= {10,30,20,50};
		char []b= {'A','B','C','D'};
		String []c= {"Banglore","HYD","KA","T"};
		boolean []d= {true,false,false,true};

		
		int []a1= new int[a.length];
		char []b1= new char[a.length];
		String []c1= new String[a.length];
		boolean []d1= new boolean[a.length];
		
		for (int i = 0; i < d.length; i++) 
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]+"\t"+d[i]);
			System.out.println();
			a1[i]=a[i];
			b1[i]=b[i];
			c1[i]=c[i];
			d1[i]=d[i];
			
			System.out.println(a1[i]+"\t"+b1[i]+"\t"+c1[i]+"\t"+d1[i]);

			
		}
		
		@Test
		public void usingForEachLoop()
		{
			int []a= {10,30,20,50};
			char []b= {'A','B','C','D'};
			String []c= {"Banglore","HYD","KA","T"};
			boolean []d= {true,false,false,true};

			
			int []a1= new int[a.length];
			char []b1= new char[a.length];
			String []c1= new String[a.length];
			boolean []d1= new boolean[a.length];
			
			
			
			int index=0;
			for(int x:a)
			{
				System.out.print(x+" ");
				a1[index++]=x;
				
			}
			for (boolean e : d) 
			{
				System.out.println(e);
			}
			
			
			@Test
			public void missingNumber()
			{
				int []a = {1,4,5};
				int b[]=new int[11];
				int index=0;
				
				for(int x:a)
				{
					b[x]=1;
				}
				
				for(int i=0; i<=10; i++)
				{
					if(b[i] != 1)
					{
						System.out.println(i);
						
					}
				}
				
				
				
			}

		
		
	

}
