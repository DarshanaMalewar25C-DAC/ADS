/*
18.Count the total number of nodes in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: Total nodes: 4
*/

class CountLL{
	 Node head;
	 static class Node{
		 int data;
		 Node next;
		 
		 Node(int d){
			 data=d;
			 this.next=null;
		 }
	 }
	 void append(int new_data){
		 Node new_node = new Node(new_data);
			if(head == null){
				head = new_node;
				return;
			}
			Node last = head;
			while(last.next != null){
			   last = last.next;
			}
		last.next = new_node;
		}
		 
		void display(){
			Node n = head;
		    while(n!= null) {
				System.out.print(n.data);
			    if (n.next != null)
					 System.out.print(", ");
			    n=n.next;
				}
		 }
		 int counter(){
			 int count = 0;
			 Node temp = head;
			 while(temp!= null){
				 count++;
				 temp = temp.next;
			 }
			 return count;	
		 }			 
		 public static void main(String args[]){
			 CountLL l1 = new CountLL();
			 
				l1.append(10);
                l1.append(20);
                l1.append(30);
                l1.append(40);
				l1.display();
				
				System.out.println("\nTotal Nodes: " + l1.counter());
		 }
}
