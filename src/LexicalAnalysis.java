import java.util.Scanner;

public class LexicalAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Source Language: ");
        String input = scan.nextLine().trim();

        if (input.isEmpty()) {
            System.out.print("NO INPUT");
            return;
        }

        // add space to ; so it can be read as tokens
        input = input.replace(";", " ; ");

        String[] lexemes = input.split(" ");

        for (String lexeme : lexemes) {
            if (lexeme.isEmpty()) continue;

            String token;
            if (lexeme.equals("int") || lexeme.equals("double") ||
                    lexeme.equals("char") || lexeme.equals("String")) {
                token = "<data_type>";
            } else if (lexeme.equals("=")) {
                token = "<assignment_operator>";
            } else if (lexeme.equals(";")) {
                token = "<delimiter>";
            } else if (lexeme.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                token = "<identifier>";
            } else {
                token = "<value>";  //numbers, strings, etc.
            }

            System.out.print(token + " ");
        }
    }
}