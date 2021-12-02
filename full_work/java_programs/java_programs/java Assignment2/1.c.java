class A
{
    final int a=100;
   public void methodA()
   {
      System.out.println("method of Class A");
       System.out.println(a);
   }
}
class B extends A
{
    static int c;
   final public void methodB()
   {
      System.out.println("method of Class B");
   }
   static public void count(int d)
   {
       c=d;
       System.out.println(c);
   }
}
final class C extends A
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
  
}

public class Hierarchical
{
  public static void main(String args[])
  {   B.count(20);
     B obj1 = new B();
     C obj2 = new C();
     
     obj1.methodA();
     obj2.methodA();
     obj1.methodB();
     obj2.methodC();
  }
}