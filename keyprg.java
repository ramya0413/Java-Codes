
class Test
{
int findKey(int input1,int input2,int input3)
{
int x=input1/1000;
int y =input2/100%10;
int small=10;
while(input3!=0)
{
int r=input3%10;
if(r<small)
small=r;
input3=input3/10;
}
int key =x*y+small;
return key;
}
}
class MainClass
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
Test t=new Test();
System.out.println("key is :"+t.findKey(x,y,z));
}
}
