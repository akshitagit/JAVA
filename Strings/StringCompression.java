public class StringCompression {

	void printCompressedString(String s)
	{
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt((i++) + 1))
				count++;

			System.out.print(s.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		String s = "hhhaaaccckkktttooobbbeeerrr";
		sc.printCompressedString(s);
	}
}
