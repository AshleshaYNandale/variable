package methods;

public class withoutparameter {

public static void main(String[] args) {
withoutparameter p= new withoutparameter();
p.addition();
p.multiplication();
}
public void addition()//addition without parameter (nonstatic method)
{
int a,b,addition;
a=43;
b=66;
addition=a+b;
System.out.println("addition of a and b is "+addition);
}
public void multiplication()
{
int x,y,mul;
x=77;
y=4;
mul=x*y;
System.out.println("multiplication of x*y is "+mul);
	
}



}
