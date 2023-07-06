package Mockprac;

public class SwitchCase {

	public static void main(String[] args) {
	String season;
	season= "winter";
	switch(season)
	{
	case"summer":
	{
System.out.println("its too hot");
break;
}
	case"winter":
	{
	System.out.println("its cold");
	break;
	}
	case"rainy":
	{
		System.out.println("its raining");
		break;
	}
	default:
	{
		System.out.println("Please enter valid seasons");
	}
	}
	}
}
