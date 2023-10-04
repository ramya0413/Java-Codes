class Sample
{
  public static void main(String[] args)thro
  {
   try
   {
    int i=0;
    int a=args.length;
    if(a==0)
    {
      System.out.println("No values");
    }
    for(i=0;i<=a;i++)
    {
      System.out.print(args[i]+",");
    }
    }
   catch(ArrayIndexOutOfBoundsException)
   {
    
   }
  }
}