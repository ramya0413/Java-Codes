class Alpha
{
  private int x,y,z;
  private Alpha()
  {
    x=10;
    y=20;
    System.out.println("Iam constructor");
  }
  static Alpha getAlphaInstance()//static factory method
  {
    Alpha a=new Alpha();
    return a;
  }
  void add()
  {
    z=x+y;
  }
  void printData()
  {
    System.out.println("x:"+x);
    System.out.println("y:"+y);
    System.out.println("z:"+z);
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    //Alpha a=new Alpha();error
    Alpha a=Alpha.getAlphaInstance();
    a.add();
    a.printData();
  }
}