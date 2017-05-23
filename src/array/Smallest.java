package array;

public class Smallest {
	static void find2Smallest(int arr[]){
		int first,second,length=arr.length;
		if(length<2){
			System.out.println("invalid input");
		}
		first=second=Integer.MAX_VALUE;
		for(int i=0;i<length;i++){
			if(arr[i]<first){
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second && arr[i]!=first){
				second=arr[i];
			}
		}
		if(second==Integer.MAX_VALUE){
			System.out.println("there is no second smallest no");
		}
		else{
			System.out.println("the first smallest no is "+first+ " the second smallest no is "+second);
		}
	}
	
	public static void main(String args[]){
		int arr[]={10,5,2,3,6};
		find2Smallest(arr);
	}

}
