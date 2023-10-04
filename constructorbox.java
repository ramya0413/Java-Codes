import java.util.Scanner;
class Box
{
  int width,height,depth,volume;
  Box(int width,int height,int depth)
  {
    this.width=width;
    this.height=height;
    this.depth=depth;
  }
  int findVolume()
  {
    volume=width*height*depth;
    return volume;
  }
}
class MainClass
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter values:");
    int w=sc.nextInt();
    int h=sc.nextInt();
    int d=sc.nextInt(); 
    Box b=new Box(w,h,d);
    System.out.println("volume:"+b.findVolume());
  }
}