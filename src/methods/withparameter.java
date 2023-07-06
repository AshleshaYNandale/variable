package methods;

public class withparameter {

public static void main(String[] args) {
withparameter p1= new withparameter();
p1.addition(76, 88);
p1.substraction(44, 5);
}

public void addition(int a,int b)
{
	int sum;
	sum=a+b;
	System.out.println("addition of a+b "+sum);
}
public void substraction(int p,int q)
{
	int sub;
	sub=p-q;
	System.out.println("substraction of p and+ q "+sub);
}
}



