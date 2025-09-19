//Towers of Hanoi

class TOH{
	static void toh(int n, char s,char a,char d){
		if(n==1){
			System.out.println("Disk from "+s+ "to" + d);
		}
		else{
			toh(n-1,s,d,a);
			System.out.println("Disk from "+s+ "to" + d);
			toh(n-1,a,s,d);
			}
		}
		public static void main(String args[]){
			final int n = 3;
			toh(n,'A','B','C');
		}
}		