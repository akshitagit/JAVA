package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOccuringChar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0){
            String line = br.readLine().trim();
            MaxOccurance mo = new MaxOccurance();
            System.out.println(mo.getMaxOccurance(line));
        }
    }
}

class MaxOccurance{


    public static char getMaxOccurance(String line){
        int[] arr = new int[256];

        for (int i=0; i<=line.length()-1; i++){
            arr[line.charAt(i)] += 1;
        }

        int max = -1;
        char c = ' ';

        for (int i=0; i<line.length(); i++){
            if (max < arr[line.charAt(i)]){
                max = arr[line.charAt(i)];
                c = line.charAt(i);
            }else if (max == arr[line.charAt(i)]){
                if (line.charAt(i) < c){
                    c = line.charAt(i);
                }
            }
        }
        return c;
    }
}
