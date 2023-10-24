package faceprep;

public class LongestCollatzSequence {

	public static void main(String[] args) {

		int limit = 000;

		int sequencenumbers = 2;

		int maxlength = 0;
		
		int maxnumber=0;

		for (int i = 2; i <= limit; i++) {

			sequencenumbers = getCollatzSequenceNumbers(i);
			
			System.out.println("the total length for " +i+ " is "+ sequencenumbers);

			if (sequencenumbers > maxlength) {
				maxlength = sequencenumbers;
				maxnumber=i;

			}

		}
		System.out.println(maxlength+("maxlength") + "------winner---------"+maxnumber+("maximum number"));

	}

	static int getCollatzSequenceNumbers(int n) {

		int length = 1;
		System.out.print(n + " -> ");
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			
			length++;
			if (n != 1) {
				System.out.print(n + " -> ");
			} else {
				System.out.println(n);
			}
		}
		return length;
	}
}