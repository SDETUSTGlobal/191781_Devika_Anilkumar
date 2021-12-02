public class Overloading2
{
int m;

 double s;
    void result(int a,int b)
    {   
       s=(a+b);
		 System.out.println("sum "+s);
    }
    void result(int a, int b,double c)
    {
        s=(a+b+c);
		System.out.println("sum: "+ s);
    }
   
  void result(int a, int b, int c)
    {
        m=a+b+c;
      System.out.println("sum: "+m);  
    }
   
    public static void main(String[] args) 
    {   
    	Overloading2 c = new Overloading2();
    
       
        
        c.result(60,70,45);
        c.result(10, 20);
	    c.result(80,75,65.5);
    }
}