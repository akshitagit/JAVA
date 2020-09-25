// Complexity of this algorithm is of linear time.
import java.util.*; 
class RemoveDuplicates {

	void removeDuplicates(String s){
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i = 0;i < s.length(); i++){
			lhs.add(s.charAt(i));
		}

		for(Character ch: lhs){
			System.out.print(ch);
		}
	}
		public static void main(String[] args) {
			String s = "hhhaackkktobbbeerr";
			RemoveDuplicates rd = new RemoveDuplicates();
			rd.removeDuplicates(s);
		}
}

