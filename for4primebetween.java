class Sample
{
  public static void main(String[] args)
  {
   long n1=Long.parseLong(args[0]);
   for(int n=1;n<=n1;n++)
   {
     int i,flag=0;
     for(i=2;i<=Math.sqrt(n);i++)
     {
       if(n%i==0)
       {
        flag=1;
        break;
       }
    }
    if(flag==0)
      System.out.print(n+" ");
   }  
    
  }
}