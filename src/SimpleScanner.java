import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Source Language: ");
        String input = scan.nextLine().trim();

        if (input.isEmpty()) {
            System.out.print("NO INPUT");
            return;
        }

        // Replace semicolons with space-separated to treat as tokens
        input = input.replace(";", " ; ");

        String[] lexemes = input.split("\\s+");

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
                token = "<identifier>";  // Swapped logic: identifiers match this pattern
            } else {
                token = "<value>";  // e.g., numbers, strings, etc.
            }

            System.out.print(token + " ");
        }
    }
}