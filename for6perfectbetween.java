class Sample
{
  public static void main(String[] args)
  { 
   int n1=Integer.parseInt(args[0]);
   for(int n=1;n<=n1;n++)
   {
      int i,sum=0;
     for(i=1;i<=n/2;i++)
     {
      if(n%i==0)
       sum=sum+i;
     }
     if(sum==n)
      System.out.print(n+" ");
   }  
    
  }
}
   


   