class Student11
{
	String name,p;
	int r;
	static String college;
	
    Student11(String s)
	
	{
	name=s;
	 
	}
	static void college( String q)
	{
		college = q;
	}
	
	void disp(int rol)
	{
		r=rol;
		System.out.println("Name : " +name);
		System.out.println("College : " +college);
		System.out.println("Rollno : " +r);
	}
	public static void main(String[] args)
	{
		
		
	     Student11.college("Rajagiri");
		Student11 s1 = new Student11("james");
		Student11 s2 = new Student11("mary");
		Student11 s3 = new Student11("Ann");
		Student11 s4 = new Student11("Smith");
		Student11 s5 = new Student11("joe");
		
		
		s1.disp(3);
		s2.disp(6);
		s3.disp(8);
		s4.disp(1);
		s5.disp(2);
		
		
	}
}
