//example for static variables
class Alpha
{
  static int x,y,z;
}
class MainClass
{
  public static void main(String[] args)
  {
     Alpha.x=10;
     Alpha.y=20;
     Alpha.z=Alpha.x+Alpha.y;
     System.out.println("x:"+Alpha.x);
     System.out.println("y:"+Alpha.y);
     System.out.println("z:x+y="+Alpha.z);
     
  }
}