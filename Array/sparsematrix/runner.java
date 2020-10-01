package sparsematrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList; 

public class runner {
	static File file = new File("/home/antish/eclipse-workspace/sparsematrix/src/sparsematrix/sparseMatrix.txt");
	static File file1 = new File("/home/antish/eclipse-workspace/sparsematrix/src/sparsematrix/sparseTriplet.txt");
	private static int row=0,col=0;
	private static int[][] matrix;
	private static int numNonZero=0;
	private static int[][] resultMatrix;//stores matrix in triplet form
	
	//function for counting rows and columns
	public static void countRowCol(){
	 String line="";
	 row=0;
	 col=0;
     try{
         Scanner reader = new Scanner(file);
         while(reader.hasNextLine()){
            row++;
            line=reader.nextLine();
         }
         reader.close();
     }catch (FileNotFoundException e) {
    	 e.printStackTrace();
     }
     String[] seperatedRow = line.split("\t");
     col=seperatedRow.length;
	}
	
	//Function to create array sparse matrix(read from file);
	public static void createsparse() {
		matrix=new int[row][col];
		String sparseRow="";
		
		try{
	        Scanner reader = new Scanner(file);
	        int counter=0;
	        while(reader.hasNextLine()){
	           sparseRow=reader.nextLine();
	           String[] seperatedRow = sparseRow.split("\t");
	           for(int i=0;i<seperatedRow.length;i++) {
	        	   matrix[counter][i]=Integer.parseInt(seperatedRow[i]);
	           }
	           counter++;
	        }
	        reader.close();
	    }catch (FileNotFoundException e) {
	   	 e.printStackTrace();
	    }
	}
	
	//function to print sparsematrix and count non-zero
	public static void printSparse(){
		int NonZero=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
				if(matrix[i][j]!=0) {
					NonZero++;
				}
			}
			System.out.println();
		}
		numNonZero=NonZero;
	}
	
	//generating triplet form matrix from sparse matrix
	public static void generatetripletmatrix() {
		resultMatrix = new int[3][numNonZero];

	    // Generating result matrix
	    int k = 0;
	    for (int ro = 0; ro < row; ro++) {
	        for (int column = 0; column < 6; column++) {
	            if (matrix[ro][column] != 0)
	            {
	                resultMatrix[0][k] = ro;
	                resultMatrix[1][k] = column;
	                resultMatrix[2][k] = matrix[ro][column];
	                k++;
	            }
	        }
	    }
	    
	}
	
	//Generating sparseTriplet.txt
	public static void generatefiletriplet() {
		
		try {
	        FileWriter writer = new FileWriter(file1);
	        for (int ro=0; ro<3; ro++){
		        for (int column = 0; column<numNonZero; column++) {
		            writer.write(resultMatrix[ro][column]+"\t");
		        	
		        }
		        writer.write("\n");
		    }
	        writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		
	}
	
	
	//Writing in original sparse matrix
	public static void writesparse() {
		
		try {
	        FileWriter writer = new FileWriter(file);//emptying the file
	        
	        for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
			            writer.write(matrix[i][j]+"\t");
				}
		            writer.write("\n");
			}
	        
	        writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		
	}
	
	//Display sparse triplet
	public static void displaysparse() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<numNonZero;j++) {
				System.out.print(resultMatrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	//Main function
	public static void main(String[] args) {
		countRowCol();//counts total rows and columns(note has file acces for previous insertions
		
		createsparse();//generating sparsematrix array
		
		printSparse();//printing and counting number of non-zero(s)

		generatetripletmatrix();//generate result matrix from matrix

		generatefiletriplet();//generate sparseTriplet.txt from constituted matrix
	    
		System.out.println();
		
		while(true) {
			System.out.println("Options : ");
			System.out.println("1. Store and Display SparseTriplet.txt");
			System.out.println("2. Insertion and deletion");
			System.out.println("3. Exit");
			
			System.out.println("Insert option : ");
			Scanner sc = new Scanner(System.in);
	        int option = sc.nextInt();
			
	        switch(option) {
	        case 1:
	        		System.out.println("Sparse triplet representation");
	        		generatetripletmatrix();//generating matrix
	        		generatefiletriplet();//generating file
	        		displaysparse();//displaying from matrix
	        		break;
	        case 2:
	        		printSparse();
	        		System.out.println("Input selection :");
	        		System.out.println("1. Insert value.");
	        		System.out.println("2. Delete value.");
	        		int selection = sc.nextInt();
	        		
	        		if(selection==1) {
	    	        	System.out.println("Input value :");
	    	        	int value = sc.nextInt();
	    	        	System.out.println("Input Row :");
	    	        	int rowselected = sc.nextInt();
	    	        	System.out.println("Input Column :");
	    	        	int colselected = sc.nextInt();
	    	        	if(rowselected>=0&&rowselected<row) {
	    	        		if(colselected>=0&&colselected<col) {
	    	        			matrix[rowselected][colselected]=value;
	    	        			writesparse();
	    	        			countRowCol();
	    	        			createsparse();
	    	        			printSparse();
	    	        			generatetripletmatrix();
	    		        		generatefiletriplet();
		    	        	}
	    	        	}
	        		}
	        		else if(selection==2) {
	        			System.out.println("Input Row :");
	    	        	int rowselected = sc.nextInt();
	    	        	System.out.println("Input Column :");
	    	        	int colselected = sc.nextInt();
	    	        	if(rowselected>=0&&rowselected<row) {
	    	        		if(colselected>=0&&colselected<col) {
	    	        			matrix[rowselected][colselected]=0;
	    	        			writesparse();
	    	        			countRowCol();
	    	        			createsparse();
	    	        			printSparse();
	    	        			generatetripletmatrix();
	    		        		generatefiletriplet();
		    	        	}
	    	        	}
	        		}
	        		break;
	        case 3:
	        		return;
	        default:
	        		break;
	        }
	    
		
		}
	    
	}
	
}
