/*
12. Write a Java program to add, search, remove, and display elements using
HashSet.
Testcase:
Input: Add duplicates ignored
ADD A
ADD A
ADD B
DISPLAY
Output: [A, B]
Input: Search present vs absent
ADD A
ADD B
SEARCH A
SEARCH C
Output: true
False
*/
import java.util.*;

class CRUD12{
	public static void main(String args[]){
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add("A");
		System.out.println(set);
		
		System.out.println(set.contains("A"));
		System.out.println(set.contains("C"));
		
		
	}
}
		