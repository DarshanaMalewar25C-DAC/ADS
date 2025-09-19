
//Fibonacci Seies
class Demo{
	static int fibonacci(int n){
		if(n<=1){
			return 1;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);  //Recursive condition
		}
	}
		public static void main(String args[]){
			int n=25;
			for(int i=1;i<=n;i++){
				System.out.println("Series="+fibonacci(i)+"");
			}
		}
}
			

