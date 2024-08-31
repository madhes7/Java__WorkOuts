

public class SLL_Reverse {
	public class Node{
		int data;
		Node next;

		public  Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void Insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
		  tail.next=newNode;
		  tail=newNode;
		}
	}
	public void  Display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public void Reverse() {
		Node cur=head,pre=null,next;
		while(cur!=null){
			next=cur.next;
			cur.next=pre;
			pre=cur;
			cur=next;
			
			
		}
		head=pre;
	
	}
	public static void main(String[] args) {
		SLL_Reverse obj=new SLL_Reverse();
		int n=0;
		while(n<=10) {
			obj.Insert(n++);
			
		}
		obj.Display();
		obj.Reverse();
		System.out.println("\n After\n");
		obj.Display();

	}

}
