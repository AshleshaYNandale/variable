package methods;

public class Sample
{
public static void main(String[] args) 
{
Sample s= new Sample();// creating object for non static method for same class
s.test();//objectname.method name
s.display();//objectname.method name
}
public void test()
{
System.out.println("Non static regular method test-is running");
}
public void display()
{
System.out.println("HI GOOD MORNING");
}
}