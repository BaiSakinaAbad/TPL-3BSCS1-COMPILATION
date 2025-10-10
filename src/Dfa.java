import java.util.Scanner;

public class Dfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";
        String state = "q0";

        System.out.print("Enter a number ending with `01`: ");
        input = sc.nextLine();

        for(int x = 0; x < input.length(); x++){
            if(state == "q0" && input.charAt(x) == '0' ){
                state = "q1";
            } else if (state == "q0" && input.charAt(x) == '1' ) {
                state = "q0";
            } else if (state == "q1" && input.charAt(x) == '0' ) {
            state = "q1";
            } else if (state == "q1" && input.charAt(x) == '1' ) {
            state = "q2";
            } else if (state == "q2" && input.charAt(x) == '0' ) {
            state = "q1";
            } else if (state == "q2" && input.charAt(x) == '1' ) {
                state = "q0";
            } else if (state == "q2" && input.charAt(x) == '0' ) {
                state = "q1";
            } else{
                System.out.println("Invalid input.. Exiting automaton");
                break;
            }
        }
        if(state == "q2" ){
            System.out.println(input + " is a VALID input, ending with `01`");
        } else {
            System.out.println(input + " is not a VALID input, not ending with `01`");
        }
    }
}
