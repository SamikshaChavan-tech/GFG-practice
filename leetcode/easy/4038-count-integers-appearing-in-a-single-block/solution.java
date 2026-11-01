class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        return count;
    }
}