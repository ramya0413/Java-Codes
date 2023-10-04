class Sample
{
	void pattern(int n)
	{
		int i,j,k;
		int x;
		for(i=1;i<=n;i++)
		{
			x=1;
			for(k=1;k<=n-i;k++)
			  System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
			{
				if(j<i)
				 System.out.print(x++);	
				else
				 System.out.print(x--);
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