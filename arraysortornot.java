package Java_trin;

public class arraysortornot {
	public static void main(String[]args) {
		int[] arr= {2,3,4,};
		boolean flag=false;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++)
			if(arr[i]<arr[j]) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("it is not sorted");			
		}else {
			System.out.println("it is sorted");
		}
	}

}
