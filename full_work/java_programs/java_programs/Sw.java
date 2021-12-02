public class Sw
{
    public static void main(String[] args)
    {
        String str = "f";
        switch(str)
        {
            case "a":
			        System.out.println("Odd no:s from 1-100");
                    for(int i=1;i<=100;i++)
                    {
                    if(i%2!=0)
                    System.out.println(i);
                    }
                    break;
            case "b":
			        System.out.println("Even no:s from 1-100");
                    for(int i=1;i<=100;i++)
					{
                    if(i%2==0)
                    System.out.println(i);
                    }
                     break;
            case "c":
			        System.out.println("Perfect Sqaure");
			         int num=49,sq;
                     sq=(int)Math.sqrt(num);
                     if(sq*sq==num)
                     System.out.println(num+" is perfect Square");
                     else
                      System.out.println(num+" is not Perfect Square");
                     break;
            case "d":
			        System.out.println("Positive or Negative no");
                    int num1=10;
                    if(num1>=0)
                    System.out.println(num1 +" is positive no");
                    else
                    System.out.println(num1 +" is negative no");
                    break;
            case "e":
			        System.out.println("Largest No");
                    int a=70,b=90,c=30,m;
                    if (a >= b && a >= c)
                     m= a;
                    else if (b >= a && b >= c)
                     m=b;
                     else
                     m= c;
                    System.out.println("Largest no: "+m);  
                     break;
            case "f":
			        System.out.println("Reverse");
                     int num2=561,r=0,d,no;
					 no=num2;
                     while(num2!=0){
                     d=num2%10;
                     r=r*10+d;
                     num2=num2/10;
                     }
                     System.out.println("Reverse of "+no+" is :" +r);
                     break;
            default:
                     System.out.println("not found");
        }
    }
}