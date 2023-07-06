package methods;

public class Mathoperatio {

public static void main(String[] args)
{
Mathoperatio mo= new Mathoperatio();//object for nonstatic method
mo.addition();//nonstatic method call
substraction();//static method call
}
public void addition()//nonstatic method
{
int a;
int b;
int sum;
a=10;
b=20;
sum=a+b;
System.out.println("Addition of a and b "+sum);
}
public static void substraction()//static method
{
int p;
int q;
int sub;
p=100;
q=80;
sub=p-q;
System.out.println("Substraction of p and q is "+sub);
}
}
