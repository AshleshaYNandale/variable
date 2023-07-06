package Mockprac;

public class ConstructorTest {
int a;
int b;
int mul;
	
public static void main(String[] args) {
ConstructorTest c=new ConstructorTest();
c.mul();
ConstructorTest c1=new ConstructorTest(6);
c1.mul();
ConstructorTest c2= new ConstructorTest(8,4);
c2.mul();
}
public ConstructorTest()
{
	a=5;
	b=10;
	mul=a*b;
}
public ConstructorTest(int m)
{
	a=m;
	b=30;
	mul=a*b;
}
public ConstructorTest(int x,int y)
{
	a=x;
	b=y;
	mul=a*b;
}
public void mul()
{
	mul=a*b;
	System.out.println("multiplication of a and b is " +mul);
}
}

