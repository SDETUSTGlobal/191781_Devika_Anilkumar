class Const
{
String w,p,q,y,z,t;
int f=10,e=20,s,sum,i,o,l,r;
 Const(int j)
 {
 o=e-j;
 t="Difference: ";
 }
Const(int d,String l)
 {
 y=l;
 r=d/f;
 }
 Const()
 {
 s=f*e;
 z="product :";
 }
 Const(int a, int b, int c,String w)
 {
 p=w;
 sum=a+b+c;
 
 }
void addition()
{

System.out.println(p+" "+sum);
}  
void subtraction()
  {
  
  System.out.println(t+" "+o);
  }  
void multiplication()
  {
  System.out.println(z+" "+s);
  }  
void division()
  {
  System.out.println(y+" "+r);
  }  
   
    public static void main(String args[]){  
    Const s1 = new Const();  
    Const s2 = new Const(5);  
	Const s3 = new Const(60,"Quoient:");  
    Const s4 = new Const(2,3,4,"sum:");  
	
    s1.multiplication();  
    s2.subtraction();  
	s3.division();  
    s4.addition();  
   }  

}