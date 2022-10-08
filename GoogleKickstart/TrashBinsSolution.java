import java.util.Scanner;
public class TrashBinsSolution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        int case_count=1;
        
        while(t>0){
            
            int N = s.nextInt();
            String str = s.next();
            int res=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='0'){
                   res+= searchNearestOne(i,str);
                }
            }
            
            System.out.println("Case #"+case_count+": "+res);
            case_count--;
            
            t--;
        }
        s.close();
    }
    
    public static int searchNearestOne(int i, String str){
        
        int left=i-1;
        int right=i+1;
        int pos_l=Integer.MAX_VALUE;
        int pos_r=Integer.MAX_VALUE;
        
        while(left>=0 ){
            if(str.charAt(left)=='1'){
                pos_l= left;
                break;
            }   
            left--;
        }

        while(right<str.length()){
            if(str.charAt(right)=='1'){
                pos_r= right;
                break;
            }   
            right++;
        }
        int a =Math.abs((i-pos_l));
        int b =Math.abs((pos_r-i));
        int pos = Math.min(a,b);
        
        return pos;
    }
    
}
