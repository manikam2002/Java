package Java_trin;

public class int_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		String str=String.valueOf(a);
		String[] arr=str.split("");
		int output=0;
		for(int i=0;i<arr.length;i++) {
			output+=Integer.parseInt(arr[i]);
		}
		System.out.println(output);

	}

}
