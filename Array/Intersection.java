
/**
* Given two arrays, write a function to compute their intersection.
**/

class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        
        for(int i:nums1) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:nums2) {
            if(map.containsKey(i) && map.get(i)>0) {
                arr.add(i);
                map.put(i,map.get(i)-1);
            }  
        }
        
        int [] ret = new int[arr.size()];
        for(int i = 0;i<arr.size();i++) {
            ret[i] = arr.get(i);
        }
        
        
        return ret;
    }
}
