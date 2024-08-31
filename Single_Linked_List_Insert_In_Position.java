import java.util.Scanner;

public class Single_Linked_List_Insert_In_Position {
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
	public void Insert_First(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void Insert_In_Position(int data,int pos) {
		if((--pos)==0) {
			Insert_First(data);
		}
		else {
		pos--;
		
		Node current=head;
		 while(pos!=0) {
			 current=current.next; pos--;}
		 Node newNode=new Node(data);
		 if(current==null) {  Insert(data);
		 System.out.println("No");}
		 else {
		 newNode.next=current.next;
		 current.next=newNode;}
		 
	}}
	public void  Display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Single_Linked_List_Insert_In_Position obj=new Single_Linked_List_Insert_In_Position();
	   int n=0;
		while(n<=50) {
			n++;
			
		obj.Insert(n);
		
		}
		obj.Display();
		System.out.println("\nEnter the position of the element should be inserted");
		obj.Insert_In_Position(s.nextInt(), s.nextInt());
		obj.Display();
		s.close();

	}

}


