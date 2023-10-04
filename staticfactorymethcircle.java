class Circle
{
  float radius,area,pm,pi=3.14f;
  private Circle(float radius)
  {
    this.radius=radius;
    
    System.out.println("Radius is:"+radius);
 
  }
  static Circle getCircleInstance()
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.print("Enter radius:");
    float a=sc.nextFloat();
    Circle c=new Circle(a);
    return c;
  }
  float findArea()
  {
    area=(pi*(radius*radius));
    return area;
  }
  float findPm()
  {
    pm=(2*pi*radius);
    return pm;
  }
  
}
class MainClass
{
  public static void main(String[] args)
  {
    Circle c=Circle.getCircleInstance();
    System.out.println("Area is:"+c.findArea());
    System.out.println("Perimeter is:"+c.findPm());

  }
}