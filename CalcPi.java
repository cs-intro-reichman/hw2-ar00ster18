// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int input = Integer.parseInt(args[0]);
		double denom = 3;
		double sum = 1;
		System.out.println("pi according to Java: " + Math.PI);

		for(int i = 0; i < input - 1; i++){

			if(i % 2 == 0){
				sum = sum - (1/denom);
				denom += 2;
			} else{
				sum = sum + (1/denom);
				denom += 2;
			}
		}

		double out = 4*sum;

		System.out.println("pi, approximated:     " + out);
	}
}
