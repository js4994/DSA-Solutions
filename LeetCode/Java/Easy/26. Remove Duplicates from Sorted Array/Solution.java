class Solution {
    public int removeDuplicates(int[] nums) {
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                a[i]=arr[i];

            }
            return a[i];
        }

        
    }
}