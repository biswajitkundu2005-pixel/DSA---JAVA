class Solution {
    public int maxSubArray(int[] nums) {
        int CurSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int val : nums){
            CurSum += val;
            MaxSum = Math.max(CurSum, MaxSum);
            if(CurSum < 0){
                CurSum = 0;
            }
        }
        return MaxSum;
    }
}