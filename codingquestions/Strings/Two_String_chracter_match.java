package Strings;

public class Two_String_chracter_match {

    public static void main(String[] args) {

        String name1 = "AmitAb";
        String name2 = "Ajitb";

        boolean visited[] = new boolean[name2.length()];
        int count = 0;

        for (int j = 0; j < name1.length(); j++) {

            for (int i = 0; i < name2.length(); i++) {

                if (!visited[i] && name1.charAt(j) == name2.charAt(i)) {
                    if (i == j) {
                        count += 2;

                    } else {
                        count += 1;

                    }

                    visited[i] = true;

                }

            }
        }

        System.out.println(count);
    }

}
