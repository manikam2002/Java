package Java_trin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class annagram {

	public static boolean anagram(String a,String b) {
		// TODO Auto-generated method stub
		                            
		//String a="heart",b="earth";
		
		a=a.replaceAll("//s", "").toLowerCase();
		b=b.replaceAll("//s", "").toLowerCase();
		char[] array1=a.toCharArray();
		char[] array2=b.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		
		if(array1.length!=array2.length ) {
			return false ;
		}
		
		return true;
		
	}
		public static void main(String[] args) {
			System.out.println(anagram("heeeatt", "earth"));
			
		}
		
		
	}


