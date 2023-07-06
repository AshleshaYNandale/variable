package Constructor;

public class ConstructorTest {
int a;
int b;
int mul;
public static void main(String[] args) {
ConstructorTest c= new ConstructorTest();
c.mul();
ConstructorTest c1= new ConstructorTest(6);
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
public ConstructorTest(int m,int n)
{
a=m;
b=n;
mul=a*b;
}
public void mul()
{
mul=a*b;
System.out.print("multiplication of a and b is "+mul);
}
}
