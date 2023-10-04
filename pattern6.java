class Sample
{
	void pattern(int n)
	{
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			  System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
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