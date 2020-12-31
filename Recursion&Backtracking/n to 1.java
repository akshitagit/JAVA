/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

	
	static void printToN(int n)
	{
		if(n == 0)
			return;
		
		System.out.print(n+" ");
		
		printToN(n - 1);

	}
    public static void main(String [] args) 
    {
    	int n = 4;

    	printToN(n);
        
    }

}