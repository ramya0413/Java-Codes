class Sample
{
	void pattern(int n)
	{
 	int i,j,len;
	len=2*n-1;//n=3 len=5
	for(i=0;i<len;i++)
	{
		for(j=0;j<len;j++)
		{
			int min=i<j?i:j;
			min=min<len-i?min:len-i-1;
			min=min<len-j?min:len-j-1;
			 System.out.print(" "+(n-min));
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