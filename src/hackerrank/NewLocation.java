package hackerrank;

import java.util.Scanner;

public class NewLocation {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		boolean flag=false;
		int count=0;
		int temp=0;
		for(int k=0;k<T;k++){
		int N=sc.nextInt();
		int size=2*N;
		Long x[]=new Long[size];
		for(int j=0;j<size;j++)
		    {
			x[j]=sc.nextLong();
			}
		   for(int i=0;i<size-2;i++){
			if((x[i]==x[i+3])&&(x[i+1]==x[i+2]))
			  {
				temp=i+3;
				flag=true;
				}
			else{
				flag =false;
				count++;
			}
			i=temp;
		}
		
		if(flag==true && count==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		}

	}

}
