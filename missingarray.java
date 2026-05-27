package Java_trin;
import java.util.Arrays;

public class missingarray {
	public static void main(String[] args) {
		int[] arr= {9,6,4,2,3,5,7,0,1};
		int n = arr.length;
        boolean found = false;
		Arrays.sort(arr);
		for(int i=0; i<n;i++) {
			if(arr[i]!=i) {
				System.out.println(i);
				found=true;
				break;
				}
		}
		if(!found) {
			System.out.println(n);			
		}
	}

}
