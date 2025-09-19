/*
13. Write a Java program to insert, delete, and display employee names in sorted
order using TreeSet.
TestCases:
Input: Basic insert, sorted display, and delete
INSERT Zara
INSERT Aman
INSERT Neha
DISPLAY
DELETE Neha
DISPLAY
Output: [Aman, Neha, Zara]
true
[Aman, Zara]
Input: Duplicates ignored & case sensitivity
INSERT Meera
INSERT meera
INSERT Arjun
INSERT Arjun
DISPLAY
DELETE Rahul
DELETE Meera
DISPLAY
Output: [Arjun, Meera, meera]
false
true
[Arjun, meera]
*/
import java.util.*;
/*
class CRUD13{
	public static void main(String args[]){
		Set<String> set = new TreeSet<>();
		//insert values
		set.add("Zara");
		set.add("Aman");
		set.add("Neha");
		System.out.println(set);
		
		//delete element(Neha)
		boolean removed = set.remove("Neha");
		System.out.println(removed);
		System.out.println(set);
	}
}
*/
class CRUD13{
	public static void main(String args[]){
		Set<String> set = new TreeSet<>();
		//insert values
		set.add("Meera");
		set.add("meera");
		set.add("Arjun");
		set.add("Arjun");
		System.out.println(set);
		
		boolean removed1 = set.remove("Rahul");
		boolean removed2 = set.remove("Meera");
		System.out.println(removed1);
		System.out.println(removed2);
		System.out.println(set);
		
		
	}
}