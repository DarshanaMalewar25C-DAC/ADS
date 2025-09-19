/*
14. Write a Java program to add, update, remove, and display books using
HashMap.
TestCases:
Input: Basic add & sorted display
ADD 205 Refactoring
ADD 101 Clean_Code
ADD 150 Effective_Java
DISPLAY
Output: {101=Clean_Code, 150=Effective_Java, 205=Refactoring}
Input: Update, remove, and verify
ADD 1 Alpha
ADD 2 Beta
UPDATE 2 Beta_2nd_Ed
REMOVE 1
DISPLAY
Output: true
true
{2=Beta_2nd_Ed}
*/
import java.util.*;
/*
class CRUD14{
	public static void main(String args[]){
		HashMap<Integer,String> list = new HashMap<>();
		list.put(205,"Refactoring");
		list.put(101,"Clean_Code");
		list.put(150,"Effective_Java");
		System.out.println(list);
	}
}
*/

class CRUD14{
	public static void main(String args[]){
		HashMap<Integer,String> list = new HashMap<>();
		list.put(1,"Alpha");
		list.put(2,"Beta");
		System.out.println(list);
		
		//update
		boolean updated = false;
		if(list.containsKey(2)){
			list.put(2,"Beta_2nd_Ed");
			updated = true;
		}
		System.out.println(updated);
		
		boolean removed = list.remove(1)!=null;
		System.out.println(removed);
		System.out.println(list);
	}
}
		