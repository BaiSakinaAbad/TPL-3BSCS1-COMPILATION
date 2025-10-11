public class StringManipulation3_asterisk {
    public static void main(String[] args) {
        String word = "Gusto ko ng kape";
        word = word.toLowerCase().trim();

        //solution 1
        String cleaned = word.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Solution 1\n" + cleaned + "\n\nSolution 2");

        //Solution 2
        String result = "";
        for (int i = 0; i < cleaned.length(); i++) {
           // System.out.print(cleaned.charAt(i));
            if(result.equals('a') || result.equals('e')
                    || result.equals('i')|| result.equals('o')
                    || result.equals('u')) {
                result += "*";
            }
            else {
                result += cleaned.charAt(i);
            }
        }
        System.out.println(result);

    }
}
