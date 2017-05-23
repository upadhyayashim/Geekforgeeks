package array;

public class Arr_Ins {

	public static int SearchItem(int arr[],int n,int key){//this is for search element in array
		
		for(int i=0;i<n;i++)
			if(arr[i]==key)
			
				return i;
			
				
		
		
		return -1;
	}
	
	public static int insertElement(int arr[], int n, int key1, int capcity){ // this is for insert element into array
		if(n>=capcity)
		return n;	
		
		
		arr[n]=key1;
		return n+1;
		
		//return(n+1);
	}
	public static int deleteElement(int arr[],int n,int key){
		
		int posi=SearchItem(arr, n, key);
		if(posi==-1)
		{	System.out.println("element not found");
		return n;
		}
		for(int i=posi;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		return n-1;
	
		}
	
	public static void main(String args[]) {
		Arr_Ins arr=new Arr_Ins();
		int array[]=new int[10];
		 array[0]=10;
		 array[1]=20;
		 array[2]=30;
		 array[3]=40;
		 array[4]=50;
		int n=array.length;
		int capcity=array.length;
		int key=70;
		int key1=70;
		int pos=5;
		System.out.println("Before Insertion");
		for(int i=0;i<n;i++){
			System.out.print(" "+array[i]);
		}
		n=insertElement(array, pos,key1,capcity);
		System.out.println(" ");
		System.out.println("After Insertion");
		for(int i=0;i<n;i++){
			System.out.print(" "+array[i]);
		}
		System.out.println(" ");
		int position=arr.SearchItem(array, n, key);
		if(position==-1){
			System.out.println("number not found");
		}
		else {
			System.out.println(array[position]+" found at position :"+(position+1));
		}
		System.out.println(" ");
		System.out.println("Before Deletion");
		for(int i=0;i<n;i++){
			System.out.print(" "+array[i]);
		}
		int n1=deleteElement(array, n, 30);
		System.out.println(" ");
		System.out.println("After Deletion");
		for(int i=0;i<n1;i++){
			System.out.print(" "+array[i]);
		}
	
	}
	
}
