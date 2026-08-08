class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num : nums){
        map.put(num, map.getOrDefault(num,0)+1);
      }
    //   create a list of frequency
    List<Integer> list = new ArrayList<>(map.keySet());
    // sorting
    list.sort((a,b) -> map.get(b) - map.get(a));
    int []result = new int[k];
    int index = k-1;
    for(int i = 0;i<k;i++){
        result[index] = list.get(i);
        index--;
      }
    return result;
    }
}
