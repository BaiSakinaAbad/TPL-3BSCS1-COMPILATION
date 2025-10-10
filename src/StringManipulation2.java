import java.util.Scanner;

public class StringManipulation2 {
    public static void main(String[] args) {
        String word = "";
        int count = 0;
        char find;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        word = sc.nextLine();
        word = word.toLowerCase();

        System.out.print("Enter letter: ");
        find = sc.next().charAt(0);
        find = Character.toLowerCase(find);

        for(int x = 0; x <= word.length() -1 ; x++) {
            if(word.charAt(x) == find) {
                count++;
            }
        }
        System.out.println("The letter '" + find + "' occured " + count + " time/s");

    }
}


