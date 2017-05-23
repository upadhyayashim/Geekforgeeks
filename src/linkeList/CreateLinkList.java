package linkeList;

public class CreateLinkList {
Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	 public static Node insertfirst(Node head,int data){
		 Node temp=new Node(data);
		 if(head==null){
			 head=temp;
			 return head;
		 }
		 temp.next=head;
		 head=temp;
		 return head;
		}
	 public static Node LastInsert(Node head,int data){
		 Node temp=new Node(data);
		 temp.next=null;
		 if(head==null){
			 head=temp;
		 return head;
		 }
		 Node temp1=head;
		 while(temp1.next!=null){
			 temp1=temp1.next;
		 }
		 temp1.next=temp;
		 return head;
	 }
	 public static Node betInsert(Node head,int position,int data){
		 Node temp=new Node(data);
		 temp.next=null;
		 if(head==null){
			 head=temp;
			 return head;
		 }
		 Node temp1=head;
		 for(int i=1;i<position-1;i++){
			 temp1=temp1.next;
		 }
		 Node temp2=temp1.next;
		 temp1.next=temp;
		 temp.next=temp2;
		 return head;
	 }
	public static void main(String args[]){
		CreateLinkList llist=new CreateLinkList();
		llist.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		llist.head.next=second;
		second.next=third;
		Node head=llist.head;
		llist.head=insertfirst(head, 5);
		
		Node temp=llist.head;
		while(temp!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
		llist.head=betInsert(head, 2, 15);
		Node temp1=llist.head;
		while(temp1!=null){
			System.out.print(temp1.data+" - ");
		temp1=temp1.next;}
		
	}
}
