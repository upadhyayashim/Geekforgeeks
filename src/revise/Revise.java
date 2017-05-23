package revise;

public class Revise {
	static Node head;
    static Node head1;
    static Node fast;
	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public Node insert(int d){
		Node nnode=new Node(d);
		Node temp=head;
		if(temp==null){
			temp=nnode;
			head=temp;
			return head;
		}
		nnode.next=temp;
		temp=nnode;
		head=temp;
		return head;
	}
	boolean identical(Node head,Node head1){
		while(head!=null && head1!=null){
			if(head.data!=head1.data)
			return false;
			head=head.next;
			head1=head1.next;
			
		}
		return (head==null && head1==null);
	}
	public Node insert1(int d){
		Node nnode=new Node(d);
		Node temp=head1;
		if(temp==null){
			temp=nnode;
			head1=temp;
			return head1;
		}
		nnode.next=temp;
		temp=nnode;
		head1=temp;
		return head1;
	}
	
	public void PrintList(Node head){
		Node temp1=head;
		if(temp1==null)
			System.out.println("no data ");
		while(temp1!=null){
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}
	public int DetactLoop(Node head){
		Node slow=head;
		fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow){
				//removeLoop(slow,head);
				return 1;
			}
		}
		return 0;
	}
	public Node LoopAtNode(Node node, Node fast){
		Node slow=node;
		Node res=null;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		res=slow;
		return res;
	}
	
	public void recReverse(Node node){
		if(node==null)
			return;
		recReverse(node.next);
		
		System.out.print(node.data+" ");
		
	}
	
	public static void main(String args[]){
		
		Revise revise=new Revise();
		Revise revise2=new Revise();
		revise.insert(10);
		revise.insert(4);
		revise.insert(15);
		revise.insert(20);
		revise.insert(50);
		//head.next.next.next.next.next=head.next;
		//revise2.insert1(1);
		revise2.insert1(10);
		revise2.insert1(5);
		//revise.PrintList(head);
		System.out.println();
		//revise.PrintList(head1);
		
		//System.out.println(revise.identical(head, head1));
		if(revise.DetactLoop(head)==1)
		System.out.println("loop found");
		else
			System.out.println("Not found");
		//System.out.println("loop found At Node "+revise.LoopAtNode(head,fast).data);
		revise.recReverse(head);
	}

}
