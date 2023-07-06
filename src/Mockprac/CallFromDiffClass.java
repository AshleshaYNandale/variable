package Mockprac;

public class CallFromDiffClass {

public static void main(String[] args) {
Static_Nonstatic.studentInfo();//static method from diff class
Static_Nonstatic s1= new Static_Nonstatic();//object created for non static method from diff class
s1.studentInfo1();//classname.methodname
}
public static void addition()
{
	int a;
	int b;
	int sum;
	a=55;
	b=67;
	sum=a+b;
	System.out.println("Addition of a and b is "+sum);
}

public void substraction()
{
	int p;
	int q;
	int sub;
	p=100;
	q=47;
	sub=p-q;
	System.out.println("Substraction of p abd q is "+sub);
}

}
