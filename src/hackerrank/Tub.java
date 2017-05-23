package hackerrank;

import java.util.Scanner;

public class Tub {
public static void main(String args[]){
	Scanner sc=new  Scanner(System.in);
	int N=(int) sc.nextLong();
	Long[] arr=new Long[N];
	long count=0;
	for(int i=0;i<N;i++){
		arr[i]=sc.nextLong();
		count++;
	}
	long result=arr[0]*(count-1);
	System.out.println(result);
	
}
}
