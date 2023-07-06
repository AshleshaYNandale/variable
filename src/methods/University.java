package methods;

public class University{
public static void main(String[] args)
{
studentInfo();//calling static method from same class
studentInfo();//calling static method from same class
studentInfo("Tina",'F',1324,84.4f);
studentInfo(",Meena",'F',3452,92);
studentInfo("Ram",'M',8723,72.7f);
}

public static void studentInfo()//method without parameter
{
String studentName="Mohini";		
char gender='F';
int rollno= 3112;
float marks=70.21f;
System.out.println("Student Name is"+studentName);
System.out.println("Student gender is"+gender);
System.out.println("Student rollno is"+rollno);
System.out.println("Student marks are"+marks);
}

public static void studentInfo(String name,char gender,int rollno,float marks)//method with parameter
{
System.out.println("Student name is"+name);
System.out.println("Student gender is"+gender);
System.out.println("Student rollno is"+rollno);
System.out.println("Student marks are"+marks+"%");
}
}