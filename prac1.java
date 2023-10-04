class Sample
{
  public static void main(String[] args)
  {
    int n=Integer.parseInt(args[0]);
    int sum=0;
    int i=0;
    while(i<n)
    {
      sum=sum+(i*i);
      i++;
    }
   System.out.print(sum); 
  }
}