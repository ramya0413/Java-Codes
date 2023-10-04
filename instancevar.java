class Beta
{
int x,y,z;
}
class MainClass
{
public static void main(String args[])
{
 Beta b=new Beta();
 b.x=10;
 b.y=20;
 b.z=b.x+b.y;
 System.out.println("x:"+b.x);
 System.out.println("y:"+b.y);
 System.out.println("z:x+y="+b.z);
}
}