class Sample
{
  Sample()
  {
    System.out.println("Iam no args constructor");
  } 
  Sample(int x)
  {
    this();
    System.out.println("Iam one args constructor:"+x);
  } 
  Sample(int x,int y)
  {
    this(10);
    System.out.println("Iam two args constructor:"+x+" "+y);
  } 
}
class MainClass
{
  public static void main(String[] args)
  {
    Sample s=new Sample(100,200);
  }
}