package hackerrank;

import java.util.Scanner;

public class FindDigit {
private static Scanner sc;


public static void main(String args[]){
sc = new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++){
	int count = 0;
	int n=sc.nextInt();
	String str=Integer.toString(n);
	int l=str.length();
	int array[]=new int[l];
	for(int j=0;j<l;j++){
		array[j]=Integer.parseInt(str.substring(j, j+1));
		if((array[j]!=0)&&(n%array[j]==0))
			count++;
	}
	System.out.println(count);
}
}
}
