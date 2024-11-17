// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String s = args[0].toUpperCase();
            
            int reps = Integer.parseInt(args[1]);

            for(int i = 0; i < s.length(); i++){

                String word = "a ";

                if(s.charAt(i) == 'A' || 
                s.charAt(i) == 'E' || 
                s.charAt(i) == 'F' || 
                s.charAt(i) == 'H' || 
                s.charAt(i) == 'I' || 
                s.charAt(i) == 'L' ||
                s.charAt(i) == 'M' ||
                s.charAt(i) == 'N' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'R' ||
                s.charAt(i) == 'S' ||
                s.charAt(i) == 'X'){
                        word = "an";
                }
                System.out.println("Give me " + word + " " + s.charAt(i) + ": " + s.charAt(i) + "!");

            }

            System.out.println("What does that spell?");

            for(int i = 0; i < reps; i++){
                System.out.println(s.toUpperCase() + "!!!");
            }

        }
}
