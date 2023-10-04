class Sample
{
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
		super(5);
		System.out.println("Iam no args constr of SubSample");
	}

}
class MainClass
{
	public static void main(String[] args)
	{
		SubSample s=new SubSample();
	}
}