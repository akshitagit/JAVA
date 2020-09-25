class StringCompression {

	void printCompressedString(String s)
	{
		int n = s.length();
		for (int i = 0; i < n; i++) {
			int count = 1;
			while (i < n - 1 && 
				s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
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
