/*
8. First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string.
Test Cases:
Input: "stress"
Output: 't'
Input: "aabbcc"
Output: null
*/


/*
//Method 1 : Iteration
class NonRepeatCharacter {
	public static void main(String args[]){
		String input = "stress";
		Character result = null;
		for(int i = 0; i<input.length();i++){
			char c = input.charAt(i);
			int count = 0;
			for(int j = 0; j<input.length();j++){
				if(input.charAt(j)==c){
					count++;
				}
			}
			if(count==1){
				result = c;
				break;
			}
		}
		System.out.println(result);
	}
}
*/			
			




//Method 2 : Recursion
class NonRepeatCharacter {
	static Character charFind(String str,int index){
		if(index>= str.length())
			return null;
		char c = str.charAt(index);
		if (str.indexOf(c) == str.lastIndexOf(c))
			return c;
		return charFind(str, index + 1);
	}
	public static void main(String args[]){
		String str1 = "stress";
		String str2 = "aabbcc";
		
		System.out.println( charFind(str1,0));
		System.out.println( charFind(str2,0));
	}
}