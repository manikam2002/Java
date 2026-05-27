package Java_trin;

import java.util.Scanner;



public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=55;
		int guess = 0;
		do {
			guess=sc.nextInt();
			if(guess<num) {
				System.out.println("hadw");
			}
			if(guess>num) {
				System.out.println("small");
			}
		}
		while(guess!=num) ;
		System.out.println("correct");

	}

}
