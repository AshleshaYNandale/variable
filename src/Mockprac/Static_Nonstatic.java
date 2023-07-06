package Mockprac;

public class Static_Nonstatic {

public static void main(String[] args) {

studentInfo();//static method from same class
Static_Nonstatic s= new	 Static_Nonstatic();//non static method from same class
s.studentInfo1();//objectname.methodname
}
public static void studentInfo() {
String Name="Ashlesha";
char Div='A';
int Rollno=123;
float Marks=70.5f;
	
System.out.println("student Name is " +Name);
System.out.println("student Div is "+Div);
System.out.println("student Rollno is "+Rollno);
System.out.println("student Marks are "+Marks);
}

public void studentInfo1() {

String Name="Ashlesha";
char Div='A';
int Rollno=123;
float Marks=70.5f;
    
System.out.println("student Name is "+Name);
System.out.println("student Div is "+Div);
System.out.println("student Rollno is "+Rollno);
System.out.println("student Marks are "+Marks);
}










}
