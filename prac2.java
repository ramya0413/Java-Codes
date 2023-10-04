class Sample
{
  public static void main(String[] args)
  {
    int n=Integer.parseInt(args[0]);
    int sum=0;
    int i=1;
    while(i<=10)
    {
      sum=sum+(n*i);
      i++;
    }
   System.out.print(sum); 
  }
}