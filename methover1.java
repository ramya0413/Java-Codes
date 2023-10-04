class Gaama
{
   void add(int x,int y)
   {
     //int z=x+y;
    //System.out.println("Int addition is:"+z);
   }
   void add(double x,double y)
   {
    // double z=x+y;
     //System.out.println("double addition:"+z);
   }
}
class MainClass
{
  public static void main(String[] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    
    System.out.println("Enter two integers:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("Enter two double values:");
    double c=sc.nextDouble();
    double d=sc.nextDouble();

    Gaama g=new Gaama();
      g.add(a,b);
      g.add(c,d);
   }
}
