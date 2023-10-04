//import java.util.*;
//import 
class student
{
  public static void main(String[] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    
    System.out.print("Enter sno:");
    int sno=sc.nextInt();

    sc.nextLine();//it reads the enter character
    
    System.out.print("Enter student name:");
    //String sname=sc.next();
    String sname=sc.nextLine();

    System.out.print("Enter avg:");
    float avg=sc.nextFloat();
 
    System.out.println("sno:"+sno);
    System.out.println("sname:"+sname);
    System.out.println("avg:"+avg);

 }
}