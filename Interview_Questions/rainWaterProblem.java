import java.util.*;

public class rainWaterProblem{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the length of the roof (select a non-negative number between 1 and 1,000,000):");
    int roofLength = sc.nextInt();
    while (roofLength < 1 || roofLength > 1_000_000){
      System.err.println("You must select a number between 1 and 1,000,000.Please try again.");
      roofLength = sc.nextInt();
    }
    System.out.println("Please enter the height the height of each block seperated by a space.");
    sc.nextLine();
    String roofHeights = sc.nextLine();
    //while control statement needed
    //converts string to Array
    String [] arr = roofHeights.split(" ", roofLength); 
    //converts string Array to integer Array
    int [] roofHeightsArray = new int[roofLength];  
    for (int index = 0; index < roofHeightsArray.length; index++){
      roofHeightsArray[index] = Integer.parseInt(arr[index]);
    }
    //determines max Height
    int maxHeight = 0;
    for (int index = 0; index < roofHeightsArray.length; index++){
      if (roofHeightsArray[index] > maxHeight){
        maxHeight = roofHeightsArray[index];
      }
    }
    //finds frequency of max height
    int startIndex = 0;
    int endIndex = 0;
    for (int index = 0; index < roofHeightsArray.length; index++){
      if (roofHeightsArray[index] == maxHeight){
        startIndex = index;
        break;
      }
    }
    for (int revIndex = roofHeightsArray.length - 1; revIndex >= 0; revIndex--){
      if (roofHeightsArray[revIndex] == maxHeight){
        endIndex = revIndex;
        break;
      }
    }
    System.out.println("Max Height:" + maxHeight + ", Indexes: " + startIndex + " " + endIndex);
    //determines number of blocks of water from left to right up to max height
    int blocksWaterSaved = 0;
    int currentHeight = 0;
    for (int index = 0; index < roofHeightsArray.length; index++){
      if (roofHeightsArray[index] > currentHeight){
        currentHeight = roofHeightsArray[index];
      }
      if (currentHeight == maxHeight){
        break;
      }
      blocksWaterSaved += (currentHeight - roofHeightsArray[index]);
      System.out.println(blocksWaterSaved);
    }
    System.out.println("new block");
    //reset current height and run in reverse
    currentHeight = 0;
    for (int revIndex = (roofLength-1); revIndex >= 0; revIndex--){
      if (roofHeightsArray[revIndex] > currentHeight){
        currentHeight = roofHeightsArray[revIndex];
      }
      if(currentHeight == maxHeight){
        break;
      }
      blocksWaterSaved += (currentHeight - roofHeightsArray[revIndex]);
      System.out.println(blocksWaterSaved);
    }
    currentHeight = maxHeight;
    for (int index = startIndex; startIndex < endIndex; startIndex++){
      blocksWaterSaved += (currentHeight - roofHeightsArray[startIndex]);
      System.out.println(blocksWaterSaved);
    }

    //Declare blocks of water saved
    System.out.printf("%nThe blocks of water saved = %d.", blocksWaterSaved);
  }
}