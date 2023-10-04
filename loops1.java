class Sample
{
  public static void main(String[] args)
  {
    int n=Integer.parseInt(args[0]);
    int sum=0;
    int i=1;
    while(sum<=n)
    {
      System.out.print(sum+" ");
      sum=sum+i;
      i++;    }
  }
}