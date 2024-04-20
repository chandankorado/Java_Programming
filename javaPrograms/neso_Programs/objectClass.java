// creating class

public Student
{
	String name;
	int id;
	
	void call() { System.out.println("calling method")}
}
public class Class
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		
		s1.call();
		System.out.println(s1.name);
		System.out.println(s1.id);
	}
}