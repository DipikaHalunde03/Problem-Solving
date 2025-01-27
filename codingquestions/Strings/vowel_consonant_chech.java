package Strings;

public class vowel_consonant_chech {
    public static void main(String[] args) {

        String s = "dipika";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                System.out.println(s.charAt(i) + "    is vowel");
            } else {
                System.out.println(s.charAt(i) + "    is consonant");

            }

        }

    }

}
