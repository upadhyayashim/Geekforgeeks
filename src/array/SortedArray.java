package array;

public class SortedArray {
 public static int insertItem(int[] array, int end,  int key1){
	int counter=-1;
	for(int i=0;i<array.length;i++){
		if(array[i]!=0)
			counter++;
		}
	//counter=counter-1;
	int noe=counter;
	if(counter==end)
		return -1;
	else{
	while(key1<array[counter] && counter>=0){
		array[counter+1]=array[counter];
		counter--;
	}
	array[counter+1]=key1;
	noe++;
	}
	return noe+1;
	
	 
 }
 public static int searchItem(int[] array, int key,int start,int end){
	 if(end<start){
		 return -1;
	 }
	 int mid=(start+end)/2;
	 if(key==array[mid])
		 return mid;
	 if(key>array[mid])
		 return searchItem(array, key,mid+1,end);
	 return searchItem(array, key,start,mid-1);
	 
 }
 public static int DeleteItem(int[] array, int key1){
	 int size=array.length;
	int pos=searchItem(array, key1, 0, size);
	if(pos==-1)
		System.out.println("not found");
	int count=0;
	for(int i=pos;i<array.length-1;i++){
		array[i]=array[i+1];
	      count=i;
	}
	 return count;
	 
 }
 
 public static void main(String args[]){
	 int array[]=new int[10];
	 array[0]=10;
	 array[1]=20;
	 array[2]=30;
	 array[3]=40;
	 array[4]=50;
	 array[5]=60;
	 array[6]=65;
	 //array[7]=70;
	 //array[8]=80;
	 //array[9]=90;
	 int key=30,key1=45;
	 System.out.println(array.length);
	 int end=array.length,start=0;
	 
	 int n=searchItem(array,key,start,end);
	 if(n==-1)
		 System.out.println(key+" not found in array");
	 else
		 System.out.println(key+"  found at position "+(n+1)+" in array");
	 
	 System.out.println("Before Insertion element in array");
	 for(int i=0;i<7;i++)
		 System.out.print(" "+array[i]);
	 int n1=insertItem(array,end,key1);
	 if(n1==-1)
		 System.out.println("no space");
	 else{
	 System.out.println();
	 System.out.println("After Insertion element in array");
	 for(int i=0;i<n1;i++)
		 System.out.print(" "+array[i]);
	 }
	 int n2=DeleteItem(array,key1);
	 System.out.println(" ");
	 System.out.println("Before delete the element");
	 for(int i=0;i<array.length;i++)
		 System.out.print(" "+array[i]);
	 System.out.println("");
	 System.out.println("After delete the element");
	 for(int i=0;i<n2-1;i++)
		 System.out.print(" "+array[i]);
 }
}
