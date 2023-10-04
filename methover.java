//method overloading
class Gaama
{
   void add(int x,int y)
   {
     int z=x+y;
     System.out.println("Int addition is:"+z);
   }
   void add(double x,double y)
   {
     double z=x+y;
     System.out.println("double addition:"+z);
   }
   public static void main(String[] args)
   {
      Gaama g=new Gaama();
      g.add(10,20);
      g.add(10.0,20.0);
  }
}