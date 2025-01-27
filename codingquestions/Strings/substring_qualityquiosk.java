package Strings;

class substring_q {

    public static void main(String[] args) {
        String s1 = "college";
        String s2 = "ole";

        int index = s1.indexOf(s2);

        // If it is a substring, return the index of the first character of s2 in s1
        if (index != -1) {
            System.out.println(index);// The starting index of the substring
        } else {
            // If not, return the sum of lengths of s1 and s2
            System.out.println(s1.length() + s2.length());
        }
    }

}
