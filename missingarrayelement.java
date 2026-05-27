package Java_trin;
import java.util.Arrays;

public class missingarrayelement {

	public static void main(String[] args) {
		
	int[] arr= {34,5,44,77,77};

	
	 Arrays.sort(arr);
	 for(int i= arr.length-2;i>=0;i--) {
		 if(arr[i]==arr[i+1]) {
			 System.out.println(arr.length-3);
		 }else { System.out.println(arr[i]);
		 }
	 }
	}

}
