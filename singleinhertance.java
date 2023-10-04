class Sample//extends java.lang.Object
{
	int x=10,y=20,z;
	void add()
	{
		z=x+y;
		System.out.println("adddition is:"+z);
	}
}
class SubSample extends Sample
{
	void sub()
	{
	  z=x-y;
	  System.out.println("subtraction is:"+z);
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		//Sample s=new Sample();
		//s.add();
		
		subSample ss=new SubSample();
		ss.add();
		ss.sub();
	}
}
