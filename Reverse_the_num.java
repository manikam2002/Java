package Java_trin;

public class Reverse_the_num {
	public static void main(String[] args) {
		int num=12345;
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		System.out.println(reverse);
	}

}
