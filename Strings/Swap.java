//Input: str = “Java”
//Output: aJva
//Explanation: The given string contains even number of characters. Therefore, we swap every pair of characters.
// Java program to swap pair 
// of characters of a string 

class SwappingPairs { 

	// Function to swap pair of 
	// characters of a string 
	public static String swapPair(String str) 
	{ 

		// Checking if string is null 
		// or empty then return str 
		if (str == null || str.isEmpty()) 
			return str; 

		// Converting the given string 
		// into a character array 
		char[] ch = str.toCharArray(); 

		// Traverse the character array 
		for (int i = 0; i < ch.length - 1; i += 2) { 

			// Swapping the characters 
			char temp = ch[i]; 
			ch[i] = ch[i + 1]; 
			ch[i + 1] = temp; 
		} 

		// Converting the result into a 
		// string and return 
		return new String(ch); 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 

		// Given String str 
		String str = "GeeksForGeeks"; 

		// Print the result 
		System.out.println(swapPair(str)); 
	} 
}
