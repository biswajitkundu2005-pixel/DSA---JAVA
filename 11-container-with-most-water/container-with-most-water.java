class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int maxArea = 0;
        while(lp<rp){
            int w = rp - lp;
            int h = Math.min(height[lp],height[rp]);
            int currentArea = w * h;
            maxArea = Math.max(maxArea, currentArea);

            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxArea;
    }
}