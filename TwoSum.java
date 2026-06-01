package Java_trin;

public class TwoSum {
	  public static void main(String[] args) {

	        int[] arr1 = {1, 3, 1, 2, 5};
	        int target = 5;

	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = i + 1; j < arr1.length; j++) {

	                if (arr1[i] + arr1[j] == target) {
	                    System.out.println("Indices: " + i + ", " + j);
	                    return;
	                }
	            }
	        }

	        System.out.println("No pair found");
	    }
	}