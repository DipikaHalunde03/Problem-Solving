import java.util.Scanner;
// funny string 
// abbccc= 1-2-3

public class frequencycharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        char arr[] = new char[size];

        for (int i = 0; i < size; i++) {
            String input = sc.nextLine();
            // Read the whole line
            if (input.length() > 0) {
                arr[i] = input.charAt(0); // Take the first character
            }
        }

        int visitedarr[] = new int[26]; // daabbccc

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 'a'; // Calculate the index for the character
            if (index >= 0 && index < 26) {
                visitedarr[index]++;
            }
        }

        boolean isFunny = true;
        for (int i = 0; i < visitedarr.length; i++) {
            if (visitedarr[i] != 0 && visitedarr[i] != i + 1) { // Check if frequency matches the position (1-based
                                                                // index)
                isFunny = false;
                break;
            }
        }
        if (isFunny) {
            System.out.println("The string is funny.");
        } else {
            System.out.println("The string is not funny.");
        }

        System.out.println("Characters with frequency matching their position:");
        for (int i = 0; i < visitedarr.length; i++) {
            if (visitedarr[i] == i + 1) {
                char c = (char) (i + 'a');
                System.out.println(c + " : " + visitedarr[i]);
            }
        }

    }
}
