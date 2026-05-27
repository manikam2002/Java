package Java_trin;

import java.util.Scanner;

public class arrayevennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int sum=0;
		System.out.println("Enter the input of array");
		for(int i=0; i<n; i++) {
			if(arr[i]/2==0) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			}
		}
		for(int i=n-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	System.out.println(sum);
	}

}
