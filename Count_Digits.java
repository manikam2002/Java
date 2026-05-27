package Java_trin;

public class Count_Digits {
	public static void main(String[] args) {
		int digits=223539000;
		int count=0;
		while(digits>0) {
			digits=digits/10;
			count++;	
		}
		System.out.println(count);
	
	}
}
