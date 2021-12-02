package javanew;

public class Calculator {

	int b;
	float f;
	public int add(int n,int m)
	{
	b=n+m;
	return b; }
	public int mul(int n, int m) {
	b=n*m;
	return b;}
	public int sub ( int n, int m)  {
	b= n - m;
	return b;}
	public float div( int n, int m)  {
	return f=(float)n/m;
	}
}

class CalculatorMain {
public static void main(String args[])  {
Calculator c = new Calculator();
int res;
float f;
res=c.add(5,10);
System.out.println("Sum =" + res);
res=c.mul(5,10);
System.out.println("product =" + res);
res=c.sub(5,10);
System.out.println("diff =" + res);
f=c.div(5,10);
System.out.println("Division =" + f);

}}