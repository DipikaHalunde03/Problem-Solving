package Strings;

class string_palindrome {
    public static void main(String[] args) {

        String s = "Madam";
        String ans = "";
        // char[] name = new char[s.length()];
        // name = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);

        }

        if (ans.equals(s)) {
            System.out.println(ans + "  is a palidrome");
        }

    }

}
