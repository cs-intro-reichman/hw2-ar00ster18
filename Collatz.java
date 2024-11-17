// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int input = Integer.parseInt(args[0]);
		String s = args[1];
		if (s.equals("v") && input > 0){
		for(int i = 0; i < input; i++){
			int num = i + 1;
			String output = num + " ";
			int count = 1;
			do {
				if(num%2 == 0){
					num = num/2;
					output += num + " ";
					count++;
				} else {
					num = (num*3) + 1;
					output += num + " ";
					count++;
				}
			} while(num != 1);

			System.out.println(output + "(" + count + ")");

			}
			System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
		} else if(s.equals("c") && input > 0){
			System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
		} else if(s != "v" || s != "c" || input <= 0) {
			System.out.println("Please enter a valid input");
		}
	}
}
