/*
15. Write a Java program to add, update, remove, and display login details using
LinkedHashMap.
TestCases:
Input: Add, update, display (insertion order preserved)
ADD alice a1
ADD bob b1
UPDATE alice a2
DISPLAY
Output: true
{alice=a2, bob=b1}
Input: Remove, re-add (reinserted at end)
ADD alice a1
ADD bob b1
ADD carol c1
REMOVE bob
ADD bob b2
DISPLAY
Output: true
{alice=a1, carol=c1, bob=b2}
*/
import java.util.*;
/*
class CRUD15{
	public static void main(String args[]){
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		
		map.put("alice","a1");
		map.put("bob","b1");
		System.out.println(map);
		
		boolean updated = false;
		if(map.containsKey("alice")){
			map.put("alice","a2");
			updated = true;
		}
		System.out.println(updated);
		System.out.println(map);
	}
}*/

class CRUD15{
	public static void main(String args[]){
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		
		map.put("alice","a1");
		map.put("bob","b1");
		map.put("carol","c1");
		System.out.println(map);
		
		boolean removed = map.remove("bob")!=null;
		System.out.println(removed);
		System.out.println(map);
		
		map.put("bob","b2");
		System.out.println(map);
	}
}