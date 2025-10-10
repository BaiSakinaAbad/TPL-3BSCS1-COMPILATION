import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // test cases: race car, nurses run, Rotator, Never odd or even, We panic in pew, Ma is a nun, as I am, Don't nod

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter word or phrase: ");
                String original = sc.nextLine();

                String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();

                String reversed = "";
                for (int i = cleaned.length() - 1; i>=0; i--) {
                    reversed += cleaned.charAt(i);
                }
               Boolean palindrome = true;
               for (int i = 0; i < cleaned.length(); i++) {
                   if (cleaned.charAt(i) != reversed.charAt(i)) {
                       palindrome = false;
                       break;
                   }
               }
                    System.out.println("Original: " + original);
                    System.out.println("Cleaned: " + cleaned);
                    System.out.println("Reversed: " + reversed);
               if (palindrome) {
                   System.out.println( original + " is a palindrome");
               }
               else {
                   System.out.println(original + " is not a palindrome");
               }

        }
    }
