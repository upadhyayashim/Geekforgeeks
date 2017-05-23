package hackerrank;


import java.util.Scanner;

public class Location {


public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int k=0;k<T;k++){
	int N=sc.nextInt();
	Long x[]=new Long[N];
	Long y[]=new Long[N];
boolean flag =false;
	for(int i=0;i<N;i++){
		x[i]=sc.nextLong();
		y[i]=sc.nextLong();
	}
	for(int i=0;i<N;i++){
		for(int j=0;j<N;j++){
			if(x[i]==y[j]){
				if(y[i]==x[j]){
					flag =true;
				}
				else{
					flag=false;
				}
			}
		}
	}
	if(flag==true)
	System.out.println("Yes");
	else
		System.out.println("No");
	}
	}
}
