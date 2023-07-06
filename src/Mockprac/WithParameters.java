package Mockprac;

public class WithParameters {

public static void main(String[] args)
{
WithParameters p= new WithParameters();
p.mul( 6,7);	
CallFromDiffClass c= new CallFromDiffClass();
c.addition();
c.substraction();
}

public void mul(int a,int b)	
{
int mul;
mul=a*b;
System.out.println("Multiplication is "+mul);

}

}
