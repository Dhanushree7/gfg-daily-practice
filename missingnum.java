class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        // code here
        if(arr[0] != 1){
            return 1;
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] - arr[i-1] > 1 ){
               return arr[i-1] + 1;
            }
        }
         return arr[arr.length-1] + 1;
    }
}
