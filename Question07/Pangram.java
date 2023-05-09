package Question07;

public class Pangram {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";

		System.out.println(ispangram(s));

	}

	private static String ispangram(String s) {
		if (s.length() < 26) {
			return "not pangram";
		} else
			for (char ch = 'a'; ch <= 'z'; ch++) {

				if (s.indexOf(ch) < 0) {

					return "not pangram";
				}
			}

		return "pangram";
	}
}
