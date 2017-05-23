package linkeList;

public class LinkList {
	 Node head;
	//private Node temp;
	
	public Node InsertFirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		return head;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	public Node InsertBetween(int data,int position){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return head;
		}
		if(position==0){
		newNode.next=head;
		head=newNode;
		return head;
		}
		Node temp=head;
		for(int i=1;i<position-1;i++){
			temp=temp.next;
		}
		Node temp1=temp.next;
		temp.next=newNode;
		newNode.next=temp1;
		return head;
	}
	public Node InsertLast(int data){
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
		return head;
	}
	public boolean deleteAtpos(Node head,int position){
		Node temp=head;
		if(head==null){
			return false;
		}
		for(int i=1;i<=position-1;i++){
			temp=temp.next;
		}
		Node temp1=temp.next;
		temp.next=temp1.next.next;
		return true;
	}
	public boolean deleteData(Node head,int d){
		int count=0;
		Node temp=head,prev=null;
		if(head==null){
			return false;
		}
		if(temp!=null && temp.data==d){
			head=temp.next;
			return true;
		}
		while(temp.next!=null && temp.data!=d){
			prev=temp;
			temp=temp.next;
		}
		if(temp.next==null) {
			return false;
		}
			
		prev.next=temp.next;
		return true;
	}
	public boolean deleteLinkList(){
		Node temp=head;
		//temp=null;
		temp.next=null;
		temp=null;
		return true;
	}
	public boolean SearchElement(Node head,int data){
		int count=0;
		Node temp=head;
		if(head==null)
			return -1>0;
	while(temp!=null){
		if(temp.data==data){
			return count>0;
					}
		count++;
	}
		return false;
	}
	public boolean searchByrecu(Node head,int data){
		if(head==null)
			return false;
		if(head.data==data)
			return true;
		return searchByrecu(head.next, data);
	}
	public int LengthLList(){
		int count=1;
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public Node swapNode(Node head,int x,int y){
		return head;
	}
	public void printList(Node head){
		Node temp=head;
		//if(temp==null)
			//System.out.println("no element in linklist");
		while(temp!=null){
			System.out.print(temp.data+" - ");
			temp=temp.next;
		}
	}
	
	public int NthNode(int index){
		Node temp=head;
		int count=0;
		while(temp!=null){
			if(count==index)
				return temp.data;
			count++;
			temp=temp.next;
		}
		assert(false);
		return 0;
	}
	public Node reverseList(Node head){
		Node prev=null,next=null;
		Node current=head;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current; 
			current=next;
		}
		head=prev;
		return head;
	}
	public void rotate(int k){
		if(k==0)
			return;
		Node temp = head;
		int count =1;
		while(count<k && temp!=null){
			temp=temp.next;
			count++;
		}
		if(temp==null)
			return;
		Node Kthnode=temp;
		while(temp.next!=null){
			temp=temp.next;
			}
		temp.next=head;
		head=Kthnode.next;
		Kthnode.next=null;
		
	}
	
	public void deleteLastOccur(Node head,int key){
		Node loccur=null;
		Node temp=head;
		while(temp!=null){
			if(temp.data==key)
				loccur=temp;
			temp=temp.next;
		}
		
		if(loccur!=null){
			loccur.data=loccur.next.data;
			temp=loccur.next;
			loccur.next=loccur.next.next;
		}
	}
	public void deleteLastOccur2(Node head,int key){
		Node last=null;
		Node temp=head;
		while(temp!=null){
			if( (temp.next!=null)&&(temp.next.data==key) ){
				last=temp;}
			temp=temp.next;
		}
		if(last!=null){
			temp=last.next;
			last.next=last.next.next;
		}
		else{
			if(head!=null && head.data==key){
				Node temp1=head;
				head=head.next;
				
			}
		}
	}
	public static void main(String args[]){
		LinkList ll=new LinkList();
		//ll.InsertFirst( 10);
		//ll.InsertFirst(5);
		ll.InsertLast( 1);
		ll.InsertLast( 2);
		ll.InsertLast( 3);
		ll.InsertLast( 5);
		ll.InsertLast( 2);
		
		ll.InsertLast( 10);
		
		//ll.InsertBetween( 15, 3);
		
		ll.printList(ll.head);
		System.out.println();
		System.out.print("length of list- ");
		System.out.println(ll.LengthLList());
		/*if(ll.searchByrecu( 15))
			System.out.println("element fount  ");
		else 
			System.out.println("not found");*/
		//ll.deleteLinkList();
		//ll.printList();
		//System.out.println(ll.NthNode(2));
		//Node newh=ll.reverseList(ll.head);
		//ll.rotate(4);
		ll.deleteLastOccur2(ll.head, 10);
		ll.printList(ll.head);
	}
}
