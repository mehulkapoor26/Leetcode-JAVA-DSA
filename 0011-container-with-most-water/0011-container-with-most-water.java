class Solution {
    public int maxArea(int[] height) {
        int h = height.length;
        int left=0;
        int right=h-1;
        int max=0;
        while(left<=right){
            int area = (right-left) * Math.min(height[left],height[right]);

            max = Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}