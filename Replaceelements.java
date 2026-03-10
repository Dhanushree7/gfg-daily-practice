class Solution {
    public int[] replaceElements(int[] arr) {

       int[] na = new int[arr.length];
       int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            na[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
       return na;
    }
}
