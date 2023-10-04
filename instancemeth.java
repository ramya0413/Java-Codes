class Alpha
{
  void display()
  {
    System.out.println("Iam instance method of alpha class!!");
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    Alpha a=new Alpha();
    a.display();
    //show(); 
    MainClass m=new MainClass();
    m.show();
  }
  void show()
  {
      System.out.println("Iam instance method of main class!!");
    
  }
}