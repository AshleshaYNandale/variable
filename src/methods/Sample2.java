package methods;

public class Sample2 
{
public static void main(String[] args) 
{
//nonstatic method from diff class
Sample2 s2=new Sample2();//object created for sample2 class
s2.m();
s2.m1();
Sample s=new Sample();//object created for diff class i.e.sample class
s.display();
s.test();
}
public void m()
{
System.out.println("Method m non-static from sample2");
}
public void m1()
{
System.out.println("Method m1 non-static from sample2");
}

}
