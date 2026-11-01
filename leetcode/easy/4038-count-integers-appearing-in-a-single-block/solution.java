class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1)return 1;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        return count;
    }
}