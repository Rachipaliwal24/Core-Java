package in.co.exercise414;

public class reverseNo5 {
	public static void main(String[] args) {
		int number = 1234, rev = 0;
		while (number != 0) {

			int reminder = number % 10;
			rev = rev * 10 + reminder;
			number = number / 10;

		}
		System.out.println(rev);

	}
}
