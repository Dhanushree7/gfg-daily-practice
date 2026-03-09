class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] na = new int [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            na[i] = nums[i];
        }
        int [] arr = new int [nums.length+na.length];
        int ind = 0;
        for(int i = 0 ; i < nums.length ;i++){
             arr[ind++] = nums[i];

        }
        for(int i = 0 ; i < na.length ;i++){
            arr[ind++] = na[i];
        }
        return arr;
    }
}
