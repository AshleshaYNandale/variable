package collectionuse;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

public static void main(String[] args) {
ArrayList<Object>al=new ArrayList<>();

System.out.println(al);
al.add("Hi");
al.add(9);
al.add('M');
al.add("Hi");
al.add(true);
al.add(12.23f);
al.add(null);
al.add(null);
System.out.println(al);
al.add(2,9);
System.out.println(al);
al.clear();
System.out.println(al);
//Object al1=al.clone();//clone=creates new object & copies all the methods associated with the object
//System.out.println(al1);
//System.out.println(al.contains("Pune"));
//System.out.println(al.equals(al1));
//System.out.println(al.size());
Iterator it=al.iterator();
while (it.hasNext())
{
System.out.println(it.next());
}
	
}


}
