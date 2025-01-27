package Accenture_coding_q;

// reverse string
public class reverse_string {

    public static void main(String[] args) {

        String name = "madam";
        String reversed = "";
        int index = 0;

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);

        }

        if (reversed.equals(name)) {
            System.out.println("strin is palindrome");
        }
    }

}
