package methods;

public class StaticMethodFromDiffClass {

	public static void main(String[] args)
	{
	test();

	StaticMethodCallFromSameClass.Name();
	}

	public static void test()
	{
		System.out.println("Static Method From Diff Class--> is Running");
	}
	
	
	
}
