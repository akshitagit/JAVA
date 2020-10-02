
import java.util.StringTokenizer;

/**
 *
 * @author Maduranga
 */
public class Tokenizer {
    
    public static void main(String []args){
    String url="http:/Exercise/java.sun.com/j2se/1.4/docs/api";
    
    StringTokenizer tokenUrl=new StringTokenizer(url,"/");
    
    System.out.println("No of tokens = "+tokenUrl.countTokens());
    
    while(tokenUrl.hasMoreTokens()){
    
    System.out.println(tokenUrl.nextToken());
    
    
    
    }
}
}