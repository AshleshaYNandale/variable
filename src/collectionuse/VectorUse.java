package collectionuse;

import java.util.Vector;

public class VectorUse {

public static void main(String[] args) {
Vector<Object>v= new Vector();

v.add("Good");
v.add(12);
v.add(null);
v.add(false);
v.add(12.3d);
v.add("Good");
v.add(1,"Velocity");
v.add(null);

System.out.println(v);

System.out.println(v.capacity());

System.out.println(v.size());

v.add("Pune");
System.out.println(v.capacity());

v.remove(4);
System.out.println(v);

//for each
for (Object f:v)
{
System.out.println(f);	
}
	}


}
