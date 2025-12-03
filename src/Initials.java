public class Initials{
    public static void main(String[] args) {
        String name = "Alan Mido Kaichou";
        // Expected output : "A.M.K."
        String[] lex = name.split(" ");
        String initials = "";
        for(int i=0; i<lex.length; i++){
            if(lex[i].length() > 0){
                char ini = lex[i].charAt(0);
                initials += ini + ".";
            }
        }
        char[] initial = initials.toCharArray();

   for(char abbre: initial){
       System.out.print(abbre);
   }
    }
}
