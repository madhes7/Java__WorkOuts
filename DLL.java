import java.util.*;
class DLL{
 public  class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
      this.data=data;
      this.next=null;
      this.prev=null;
    }
  }
  Node head=null;
  Node tail=null;
  public void Insert_At_Begining(int data) {
	  Node newNode=new Node(data);
	  if(head==null){
	      
	      head=newNode;
	      tail=newNode;
	      head.prev=null;
	    }
	  else {
		  newNode.prev=null;
		  head.prev=newNode;
		  newNode.next=head;
		  head=newNode;
	  }
  }
  
  public void Insert_At_End(int data){
    Node newNode=new Node(data);
    if(head==null){
      
    	Insert_At_Begining( data);
    }
    else{
      newNode.prev=tail;
      tail.next=newNode;
      tail=newNode;
    }}
    public void Display(){
      Node current=head;
      while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
  }
    public void rDisplay(){
        Node current=tail;
        while(current!=null){
          System.out.print(current.data+" ");
          current=current.prev;
      }
    }
  public static void main(String args[]){
    DLL obj=new DLL();
    Scanner s=new Scanner(System.in);
      while(true){
        int x=s.nextInt();
        if(x==-1) break;
        obj.Insert_At_End(x);
    }
      obj.Display();
      System.out.println("\nInserting 100 in pos 1 \n");
      obj.Insert_At_Begining(100);
    obj.Display();
    System.out.println("\nprinting from back\n");
    obj.rDisplay();
    s.close();
  }
}