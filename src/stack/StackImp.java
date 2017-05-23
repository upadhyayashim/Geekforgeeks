package stack;

public class StackImp {
	int arr[]=new int[10];
	int top=-1;
	
	public void push(int a){
		if(isEmpty()){
			top++;
			arr[top]=a;
		}
		else{
			top++;
			arr[top]=a;
		}
		
	}
	public int pop(){
		if(top<0){
			System.out.println("underflow");
			return 0;
		}
		else{
		int x= arr[top--];
		return x;
		}
		
	}
	public int peek(){
		if(top<0){
			System.out.println("no item to peek");
			return 0;
		}
		else{
		return arr[top];
		}
	}
	  public boolean isEmpty(){
		  return top==-1;
	  }
	  public static void main(String args[]){
		  StackImp stack=new StackImp();
		  stack.push(10);
		  stack.push(20);
		  stack.push(30);
		  stack.push(40);
		  stack.push(50);
		  System.out.println(stack.peek());
		  stack.pop();
		  stack.pop();
		  stack.pop();
		  stack.pop();
		  stack.pop();
		  System.out.println(stack.peek());
	  }

}
