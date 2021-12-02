class Overloading
{
int m;

 double s;
    void result(int a,double b,double c)
    {   
       s=((a+b+c)/300)*100;
		 System.out.println("Percentage is: "+s+"%");
    }
    void result(int a, int b,double c)
    {
        s=(a+b+c)/3;
		System.out.println("Average: "+ s);
    }
    void result(int a, int b, int c, int d)
    {
        
		System.out.println("Median: "+(a+b+c+d)/2);
		
    }
  void result(int a, int b, int c)
    {
        if (a >= b && a >= c)
        m= a;
        else if (b >= a && b >= c)
        m=b;
        else
        m= c;
      System.out.println("Maximum: "+m);  
    }
    void result(int a, int b)
    {
        if(a<=b)
        m=a;
        else 
         m=b;
		 System.out.println("Minimum: "+m);
         
    }
    public static void main(String[] args) 
    {   
    	Overloading c = new Overloading();
    
       
        c.result(66,34.5,76.5);
        c.result(60,70,45);
        c.result(10, 20);
		c.result(10,15,20,25);
	    c.result(80,75,65.5);
    }
}