package Java_trin;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="Manik";
		String n=new String();
		for(int i=m.length()-1;i>=0;i--) {
			n+=m.charAt(i);
		}
		System.out.println(n);
		

	}

}
