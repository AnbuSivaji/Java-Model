


public class primenumber {
	public static void main(String args[]) {

         int num = 8;
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 1 ? "Prime Number" : "Not Prime Number");

		
	}

}