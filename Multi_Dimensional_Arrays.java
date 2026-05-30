package Java_trin;

import java.util.Scanner;

public class Multi_Dimensional_Arrays {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("row");
		int r=s.nextInt();
		System.out.println("col");
		int c=s.nextInt();
		
		int[][]arr=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("matrix");
		int sum=0;
		for(int i=0;i<r;i++) {
			sum=0;
			for(int j=0;j<c;j++) {
				sum+=arr[i][j];
				
				//System.out.println(sum);
			
				//System.out.println("all matrix");
			System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
			System.out.println("dignal");
			for(int i=0;i<r;i++) {
				System.out.println(arr[i][i]+"");
				
			}
		
	}

}
