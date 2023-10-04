import java.util.Scanner;
class Student
{
  private int sno;
  private String sname;
  private float avg;
  public void setSno(int sno)
  {
    this.sno=sno;
  }
  public int getSno()
  {
    return sno;
  }
  public void setSname(String sname)
  {
    this.sname=sname;
  }
  public String getSname()
  {
    return sname;
  }
  public void setAvg(float avg)
  {
    this.avg=avg;
  }
  public float getAvg()
  {
    return avg;
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter sno:");
    int no=sc.nextInt();

    System.out.print("Enter sname:");
    String sname=sc.next();

    System.out.print("Enter avg:");
    float avg=sc.nextFloat();
   
    Student s=new Student();

    s.setSno(no);
    System.out.println("sno:"+s.getSno());

    s.setSname(sname);
    System.out.println("sname:"+s.getSname());

    s.setAvg(avg);
    System.out.println("avg:"+s.getAvg());
  }
  
}