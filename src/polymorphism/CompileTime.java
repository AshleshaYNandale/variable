package polymorphism;

public class CompileTime {

public static void main(String[] args)
{
CompileTime c=new CompileTime();
c.addition();
c.addition(22, 12);
c.addition(5, 7f);
c.addition(34, 11, 12);
}
public void addition()
{
int a=20;
int b=40;
int sum=a+b;
System.out.println("addition is "+sum);
}

public void addition(int a,int b)
{
int sum=a+b;
System.out.println("addition is "+sum);
}

public void addition(int a,float b)
{
float sum=a+b;
System.out.println("addition is "+sum);
}

public void addition(int a,int b,int c)
{
int sum=a+b+c;
System.out.println("addition is "+sum);
}
}