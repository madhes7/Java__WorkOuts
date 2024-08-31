
public class Single_Linked_List_Insert_infirst {
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
	public void  Display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

	public static void main(String[] args) {
		Single_Linked_List_Insert_infirst obj=new Single_Linked_List_Insert_infirst();
		obj.Insert_First(1);
		obj.Insert_First(2);
		obj.Insert_First(3);
		obj.Display();
		

	}

}
