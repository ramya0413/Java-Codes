class Circle
{
  float radius,area,perimeter,pi=3.14f;
  void getRadius(float radius)
  {
    this.radius=radius;
  }
  float findArea()
  {
    area=(pi*(radius*radius));
    return area;
  }
  float findPeriMeter()
  {
    perimeter=(2*pi*radius);
    return perimeter;
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter radius:");
    int radius=sc.nextInt();
   
    Circle r=new Circle();
    r.getRadius(radius);
    System.out.println("area is:"+r.findArea());
    System.out.println("perimeter is:"+r.findPeriMeter());
  }
}