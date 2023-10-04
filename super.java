class Sample
{
	Sample()
	{
		System.out.println("Iam nonargs constr of Sample");
	}
	Sample(int x)
	{
		//super();
		System.out.println("Iam one args constr of Sample:"+x);	
	}
}
class SubSample extends Sample
{
	SubSample()
	{
		//super();
		System.out.println("Iam no args constr of SubSample");
	}
	SubSample(int x)
	{
		super(10);
		System.out.println("Iam one args constr of Sample:"+x);
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		SubSample ss=new SubSample();
		SubSample ss1=new SubSample(10); 
	}
}