class Sample
{
	void pattern(int n)
	{
		int i,j,k;
  		
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=n;j++)
			{
				if(i+j<=n)
				 System.out.print("*");	
				else
				{
				 int a=n;
				 for(k=n;k>=1;k--)
 				 {
 					 System.out.print(a--);
				 }

				}
			}
			
		System.out.print("\n");
		}
	}
}
class MainClass
{
  public static void main(String[] args)
  {
    int n=Integer.parseInt(args[0]);
    Sample s=new Sample();
    s.pattern(n);
  }
}