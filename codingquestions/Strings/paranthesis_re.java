package Strings;

public class paranthesis_re {
    public static void main(String[] args) {

        String s = "(()())(())";
        String ans = "";

        // remove outermost paranthesis ( -40 )-41
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 41) {
                j--;
            }
            if (j != 0) {
                ans = ans + s.charAt(i);
            }
            if (s.charAt(i) == 40) {
                j++;
            }
        }

        System.out.println(ans);

    }

}
