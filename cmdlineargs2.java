class Sample
{
  public static void main(String[] args)
  {
    System.out.println("no of cmd line args:"+args.length);
 
    int i,sum=0;
    for(i=0;i<args.length;i++)
    {
      sum=sum+Integer.parseInt(args[i]);
    }
    System.out.println("sum:"+sum);
    
   /*"for each loop"
    for(Stringx:args)
    {
      sum=sum+Integer.parseInt(x);
    }
    System.out.println("sum:"+sum);   */
  }
}
    