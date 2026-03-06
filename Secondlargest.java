class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;;
        for(int i= 0 ; i < arr.length ; i++){
            if(arr[i] != max && arr[i] > smax){
                smax = arr[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
}
