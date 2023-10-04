class Sample
{
	void pattern(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j==1||j==n||i==1||i==n)
				 System.out.print("*");
				else
				 System.out.print(" ");			
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