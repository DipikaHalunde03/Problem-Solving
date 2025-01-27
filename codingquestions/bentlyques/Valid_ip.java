package bentlyques;

public class Valid_ip {
    public static void main(String[] args) {

        String ip = "110.230.172.2";

        boolean ans = validip(ip);
        if (ans == true) {
            System.out.println(" it is a valid ip ");
        } else {
            {
                System.out.println(-1);
            }
        }
    }

    public static boolean validip(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return false;

        }

        for (String part : parts) {
            int val = Integer.parseInt(part);

            if (val < 0 || val > 255) {
                return false;

            }

        }

        return true;
    }

}
