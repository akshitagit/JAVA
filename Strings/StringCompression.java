public class StringCompression {

	void printCompressedString(String input) {
		String compressedWord = "";
		boolean areTheySame = false;
		int counter = 1;

		for (int index = 0; index < input.length(); index++) {
			final char letter = input.charAt(index);
			if (index < input.length() - 1) {
				final char nextLetter = input.charAt(index + 1);
				if (letter == nextLetter) {
					counter++;
					areTheySame = true;
				} else if (areTheySame) {
					compressedWord += String.valueOf(letter) + counter;
					counter = 1;
					areTheySame = false;
				} else {
					compressedWord += String.valueOf(letter) + counter;
				}
			} else {
				compressedWord += String.valueOf(letter) + counter;
			}
		}
		System.out.println(compressedWord);
	}


	public static void main(String[] args) {
		StringCompression compression = new StringCompression();
		String input = "hhhaaaccckkktttooobbbeeerrr";
		compression.printCompressedString(input);
	}
}
