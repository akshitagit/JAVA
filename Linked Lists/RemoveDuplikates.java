/*
'removeDuplikates' method is removing values that are repated 'i' times.
For instance:
    removeDuplicates(4, 1, 2, 2, 2, 5, 6, 4, 6), 2);
    it should return only 4 and 6. But not 2 which is repeated 3 times.
In map as a key there are elements from a list, and as a values there are how many times this value is repeated.
 */

import java.util.*;

class RemoveDuplikates{

    public static List<Integer> removeDuplikates(List<Integer> arr, int i){
        Map<Integer, Integer> map = new HashMap();

        for(Integer el : arr){
            if(!map.containsKey(el)){
                map.put(el,1);
            } else{
                map.put(el, map.get(el) + 1);
            }
        }

        for(Integer el : map.keySet()){
            if(map.get(el) == i){
                arr.remove(el);
            }
        }
        return arr;
    }
}
