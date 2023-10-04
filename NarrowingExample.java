class NarrowingExample
{
  public static void main(String[] args)
  {
    int i=300;
    //byte b=i;(error)
    byte b=(byte)i;
    System.out.println("i:"+i+"\nb:"+b);

    int x=(int)5.7;
    System.out.println("x : "+x);
   
    float f=7.2f; //or (float)7.2
    System.out.println("f: "+f);
  }
}