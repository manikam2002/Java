package Java_trin;

public class NoN_repeat_cha {

    public static char repeat(String a) {
        for (int i = 0; i < a.length(); i++) {
            boolean count = true;
            for (int j = 0; j < a.length(); j++) {
                if (i!=j && a.charAt(i) == a.charAt(j)) {
                    count = false;
                    break;
                }
            }
            if (count) {
                return a.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(repeat("aabbc"));
    }
}