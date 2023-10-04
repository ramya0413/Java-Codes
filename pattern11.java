class Sample
{
	void pattern(int n)
	{
		int i,j,k;
		int sp=0;
		for(i=n;i>=1;i--)
		{
			
			for(j=1;j<=i;j++)
			{
				 System.out.print("*");	
			}
			for(k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
				sp=sp+2;
			for(j=1;j<=i;j++)
			{
				 System.out.print("*");	
			}
		System.out.print("\n");
		}
		sp=sp-2;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				 System.out.print("*");	
			}
			for(k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
				sp=sp-2;

			for(j=1;j<=i;j++)
			{
				 System.out.print("*");	
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