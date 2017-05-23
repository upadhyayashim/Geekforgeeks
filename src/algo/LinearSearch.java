package algo;

public class LinearSearch {
 
	public static int search(int arr[],int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,12,3,45,3};
		int x=3;
		int n=search(arr,3);
		if(n>0)
			System.out.println(x+" found at "+n+" index ");
		else{
			System.out.println(x+ " not found in array");
		}

	}

	

}
