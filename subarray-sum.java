
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
         ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            sum += arr[i];
            
            if(sum == target){
                result.add(1);
                result.add(i + 1);
                return result;
            }
            
            if(map.containsKey(sum - target)){
                result.add(map.get(sum - target) + 2);
                result.add(i + 1);
                return result;
            }
            
            map.put(sum, i);
        }
        
        result.add(-1);
        return result;
    }
}
