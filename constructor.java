class Sample
{
  Sample()
  {
    System.out.println("Iam no args constructor");
  } 
  Sample(int x)
  {
    System.out.println("Iam one args constructor:"+x);
  } 
  Sample(int x,int y)
  {
    System.out.println("Iam two args constructor:"+x+" "+y);
  } 
}
class MainClass
{
  public static void main(String[] args)
  {
    Sample s=new Sample();
    Sample s1=new Sample(10);
    Sample s2=new Sample(100,200);
  }
}
