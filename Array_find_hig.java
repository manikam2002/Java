package Java_trin;

public class Array_find_hig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {96,83,55,1000};
		int hig=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=hig) {
				hig=arr[i];
			}
		}
System.out.println(hig);
	}

}
