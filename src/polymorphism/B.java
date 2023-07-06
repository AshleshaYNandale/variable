package polymorphism;

public class B extends A
{
public static void main(String[] args)
{
A a=new A();
B b=new B();
b.sample();
a.sample();
}
public void sample()
{
System.out.println("B's test");
}
}
