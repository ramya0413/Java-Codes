class Sample
{
  int x=10,y=20,z;
}
class MainClass
{
  public static void main(String[] args)
  {
    Sample s1=new Sample();
    System.out.println(s1);
    Sample s2=null;
    s2=new Sample();
    System.out.println(s2);
  }
}