class Rectangle
{
  int length,breadth,area;
  void getDim(int length,int breadth)
  {
    this.length=length;
    this.breadth=breadth;
  }
  int findArea()
  {
    area=length*breadth;
    return area;
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter length and breadth:");
    int length=sc.nextInt();
    int breadth=sc.nextInt();
   
    Rectangle r=new Rectangle();
    r.getDim(length,breadth);
    //int res=r.findArea();
    //System.out.println("area is:"+res);
    System.out.println("area is:"+r.findArea());
  }
}