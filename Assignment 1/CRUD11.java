/*
11. Write a Java program to add, update, remove, and display elements using
LinkedList.
Testcase:
Input: ADD A
ADD B
ADD C
REMOVE 0
DISPLAY
Output: [B, C]
Input: ADD A
ADD B
ADD C
UPDATE 1 X
DISPLAY
Output: [A, X, C]
*/

import java.util.*;

class CRUD11{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		
		//add elements
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//Remove elements
		list.remove(0);
		System.out.println(list);
		
		//update elements
		list.set(1,"X");
		System.out.println(list);
	}
}