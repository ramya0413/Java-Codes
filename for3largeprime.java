class Sample
{
  public static void main(String[] args)
  {
    long n=Long.parseLong(args[0]);
    int i,flag=0;
    for(i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
       flag=1;
       break;
    }
    if(flag==0)
      System.out.println("prime");
    else
      System.out.println("not prime");
  }
}