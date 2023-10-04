class Sample
{
  public static void main(String[] args)
  {
    int num;
    java.util.Scanner sc=new java.util.Scanner(System.in);
    num=sc.nextInt();
    if(num%2==0)
    {
      System.out.println("Given number is Even");
    }
    else
    {
      System.out.println("Given number is Odd");
    }
  }
}