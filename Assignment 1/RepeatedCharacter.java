/*
7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.
Test Cases:
Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']
*/
/*
//Method 1 : Iteration
class RepeatedCharacter {
	public static void main(String args[]){
		String input="programming";
		
		for(int i = 0;i<input.length();i++){
			char c = input.charAt(i);
			int count = 0;
			
			for(int j = 0;j<input.length();j++){
				if(c==input.charAt(j)){
					count++;
				}
			}
			if(count > 1 && input.indexOf(c)==i){
				System.out.print(c + ",");
			}
		}
	}
}

*/


//Method 2 : Recursion
class RepeatedCharacter{
	static void isRepeats(String str, int i){
		if(i==str.length())
			return;
		char c = str.charAt(i);
		int count = 0;
		
		for(int j = 0; j<str.length();j++){
			if(str.charAt(j)==c){
				count++;
			}
		}
		if(count>1 && str.indexOf(c)==i){
			System.out.println(c + " ");
		}
		isRepeats(str,i+1);
	}
	
	public static void main(String args[]){
		String str = "hello";
		isRepeats(str,0);
	}
}