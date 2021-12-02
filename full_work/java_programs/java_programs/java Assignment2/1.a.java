class A{
  int z=100;
A(){  
System.out.println("class A is invoked");  
} 
void res(){
    System.out.println(z);
   
}
}  
 
public class B extends A{  
    int a,x;
B(int a){  
 
this.a=a;
System.out.println(x);
}  
 
{ x=12;}  
void disp(){
    System.out.println(a);
   
}
 
public static void main(String args[]){  
B b2=new B(10);  
b2.disp();
b2.res();

}  
} 
