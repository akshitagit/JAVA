import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/*
 * You have a list of integers and need to find out the number of duplicates in it.
 * Example:-
 * {1,2,2,3,3,4,5,6,1}
 * output:-3
 * 
 * In the given list 1,2,3 are 3 integer which repeat itself
 */

public class CountDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ArrayList<Integer>();
		System.out.println("Number of elements in ArrayList");
		int size=sc.nextInt();
		for (int i = 0; i < size; i++) {
			li.add(sc.nextInt());
		}
		System.out.println(duplicates(li,size));

	}

	private static int duplicates(List<Integer> li, int size) {
		int count=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			if(map.containsKey(li.get(i))) {
				map.put(li.get(i), map.get(li.get(i))+1);
			}else
				map.put(li.get(i), 1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>count)
				count++;
		}
		return count;
	}

}
