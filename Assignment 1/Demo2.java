//sum[10] = 10+9+8+7+.......+1=?

class Demo2{
	static int sum(int n){
		//Base condition
		if(n>0){
			return n+sum(n-1);
		}
		return 0;
	}
	public static void main(String args[]){
		int num= sum(10);
		System.out.println("Sum in reverse= "+num);
	}
}