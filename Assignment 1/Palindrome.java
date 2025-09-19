/*9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.
Test Cases:
Input: 121
Output: true
Input: -121
Output: false
*/

/*
//Method 1 : Iteration
class Palindrome {
	 public static void main(String[] args) {
        int x = -121; 

        if (x < 0) {
            System.out.println("false");
            return;
        }

        int originalValue = x;
        int reverseValue = 0;

        while (x != 0) {
            int digit = x % 10; 
            reverseValue = reverseValue * 10 + digit;
            x = x / 10;
        }

        boolean isPalindrome = (originalValue == reverseValue);
        System.out.println(isPalindrome);
    }
}

*/


//Method 2 : Recursion
class Palindrome{
	public static boolean isPalindrome(int x){
		String s = String.valueOf(x);
		return isPalindromeRecursive(s, 0, s.length() - 1);
		}
		private static boolean isPalindromeRecursive(String s, int left,int right){
			if (s.charAt(0) == '-')
				return false;
			if(left >= right)
				return true;
			if(s.charAt(left)!= s.charAt(right))
				return false;
			return isPalindromeRecursive(s,left+1,right-1);
		}
		public static void main(String args[]){
			int input1 = 121;
			int input2 = -121;
			
			System.out.println(isPalindrome(input1));
			System.out.println(isPalindrome(input2));
		}
}
		