package doublyLL;


public class Global {
	Node head;

	public Node addFirst(int d){
		Node newNode=new Node(d);
		if(head==null){
			head=newNode;
			return head;
		     }
		
		   newNode.next=head;
		   head.prev=newNode;
		   head=newNode;
		return head;
	}
	public Node insertAfter(Node prevNode,int data){
		Node NewNode=new Node(data);
		if(prevNode==null){
			System.out.println("previous node can not be null");
			return head;
		}
		NewNode.next=prevNode.next;
		prevNode.next=NewNode;
		NewNode.prev=prevNode;
		NewNode.next.prev=NewNode;
		return head;
	}
	
	public Node AddLast(int data){
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		return head;
	}
	
	public void reversedll(){
		Node temp=null;
		Node current=head;
		while(current!=null){
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp!=null)
			head=temp.prev;
	}
	
	public Node BtreeTolist(Node root){
		if(root==null)
			return null;
		Node left=BtreeTolist(root.prev);
		Node right=BtreeTolist(root.next);
		root.prev=root.next=root;
		
		return concatenate(concatenate(left,root),right);
	}
	
	 private Node concatenate(Node leftlist, Node rightlist) {
		// TODO Auto-generated method stub
		return null;
	}
	void printList(Node head){
		System.out.println();
		 if(head==null)
			return;
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Global dll=new Global();
dll.addFirst( 10);
dll.addFirst(20);
dll.addFirst(30);
//dll.insertAfter(dll.head.next, 25);
dll.AddLast(50);
dll.printList(dll.head);
dll.reversedll();
dll.printList(dll.head);

	}

}
