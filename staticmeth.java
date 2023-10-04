class Alpha
{
  static void display()
  {
    System.out.println("Iam static method of alpha class!!");
  }
}
class MainClass
{
  public static void main(String[] args)
  {
    Alpha.display();
    MainClass.show();
  }
  static void show()
  {
      System.out.println("Iam static method of main class!!");
    
  }
}