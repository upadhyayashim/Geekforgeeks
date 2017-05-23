package algo;

public class BinarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={1,2,3,4,5,6,7};
int x=6;
//int n=binarysearch(arr,x,0,arr.length-1);
int n=iterBinarySearch(arr,x);
if(n>0)
	System.out.println(x+" found at index " +n);
else System.out.println("not found");
	}

	private static int iterBinarySearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		int L=0,R=arr.length-1;
		
		while(L<=R){
			int mid=L+(R-L)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				L=mid+1;
			else
				R=mid-1;
		}
		
		return -1;
	}

	private static int binarysearch(int[] arr, int x, int L, int R) {
		// TODO Auto-generated method stub
		if(R>=L){
		int mid=L+(R-L)/2;
		if(x==arr[mid])
			return mid;
		if(x>mid)
		return	binarysearch(arr, x, mid+1, R);
		return binarysearch(arr, x, L, mid-1);
		}
		return 0;
	}

}
