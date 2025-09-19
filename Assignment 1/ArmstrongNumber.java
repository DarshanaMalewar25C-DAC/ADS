/*
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong
number.
Test Cases:
Input: 153
Output: true
Input: 123
Output: false
*/

/*
FlowChart:- 
          +--------------------------+
          |    Start Program         |
          +--------------------------+
                     |
                     v
       +-----------------------------+
       |  Read input number (n)      |
       +-----------------------------+
                     |
                     v
   +-----------------------------------------+
   | Count number of digits (let's say 'd')  |
   +-----------------------------------------+
                     |
                     v
   +-----------------------------------------+
   | Set temp = n, result = 0                |
   +-----------------------------------------+
                     |
                     v
   +-------------------------+
   | Is temp > 0 ?           |------------
   +-------------------------+           |
            |Yes                         |No
            v                            v
+------------------------------+     +-----------------------------+
| digit = temp % 10            |     | Is result == n ?            |
| result += digit^d            |     +-----------------------------+
| temp = temp / 10             |              |Yes           |No
+------------------------------+              v              v
            |                               +----------+   +-----------+
            +------------------------------>+ Print true|  |Print false|
                                            +----------+   +-----------+
                                                  |             |
                                                  v             v
                                          +--------------------------+
                                          |     End Program          |
                                          +--------------------------+
										  */

/*
//Method 1 : Iteration
public class ArmstrongNumber{ 
   public static boolean isArmstrong(int n){
	int originalNum = n;
	int d = String.valueOf(n).length();
	int result = 0;
	 while(n>0){
		 int digit = n%10;
		 result += Math.pow(digit,d);
		 n /= 10;
	 }
	 return result == originalNum;
   }
   public static void main(String args[]){
	System.out.println(isArmstrong(153));
	System.out.println(isArmstrong(123));
	System.out.println(isArmstrong(1634));
   }
}
*/
	

//Method 2: Recursion
public class ArmstrongNumber{
	public static int armstrong(int n , int pow){
		if(n==0){
		return 0;
		}
		int digit = n%10;
		return(int) Math.pow(digit,pow)+ armstrong(n/10,pow);
	}
	public static boolean isArmstrong(int n){
	int d = String.valueOf(n).length();
	int sum = armstrong(n,d);
    return sum == n;
	}
	public static void main(String args[]){
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(123));
		System.out.println(isArmstrong(1634));
	}
}

