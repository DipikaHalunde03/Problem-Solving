public class reverse_string {
    public static void main(String[] args) {

        String s = "hello";

        int left = 0;

        StringBuilder sb = new StringBuilder();

        sb.append(s);

        String s1 = sb.reverse().toString();

        System.out.println(s1);

    }

}
