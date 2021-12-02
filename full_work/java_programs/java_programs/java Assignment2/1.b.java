class A {
    String color="white";  
    void msg() {
        System.out.println("A is called here");
    }
A(){
  System.out.println("A constructor is invoked");
}
}

class B extends A {
   
    String color="black";  
    void msg() {
        super.msg();
        System.out.println("B is called here");
         System.out.println(color);
       System.out.println(super.color);
    }
    B()
{
     super();
 System.out.println("B constructor is invoked");
}
}

public class Main extends B {

    void msg() {
        super.msg();
        System.out.println("C is called here");
    }
     

    public static void main(String args[]) {
        Main cc = new Main();
        cc.msg();
       
    }
}