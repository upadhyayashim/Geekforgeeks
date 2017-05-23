package array;

public class ReverseArray {

	public static void revers(int[] array, int start, int end)
	{
		int temp;
		while(start<end){
			temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}
	public static void secondMethodReverse(int[] array, int start, int end){
		int temp;
		if(start>=end)
			return;
		temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		secondMethodReverse(array, start+1, end-1);
	}
	public static void main(String args[]){
		int array[]={2,3,1,4,5};
		int start=0,end=array.length;
		
	/*	System.out.println("Before reverse array");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
		revers(array,start,end-1);
		System.out.println("");
		System.out.println("After reverse array");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
*/
		
		System.out.println("");
		System.out.println("Before reverse array");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
		secondMethodReverse(array,start,end-1);
		System.out.println("");
		System.out.println("After reverse array");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
		
	}
}
