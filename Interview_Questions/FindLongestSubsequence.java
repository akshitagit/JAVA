import java.util.Scanner;
class FindLongestSubsequence{
    public static int FLS(int[] seq){
        int min = seq[0];
        int count =0;
        int last=0;
        for(int i=0;i<seq.length;i++){
            int pointer = seq[i];
            if(min>pointer){
                min=pointer;
                last=pointer;
                count=1;
                continue;
            }
            if(pointer>last){
                count++;
                last = pointer;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int length = sc.nextInt();
        int sequence[] = new int[length];
        for(int i =0;i<length;i++){
           sequence[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(FLS(sequence));
    }
}