//O(n^2)
/*class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max_area=0;
        for(int i = 0; i < n-1; i++){
            if(height[i]*(n-i-1)<max_area) continue;
            for(int j = i+1; j < n; j++){
                int area = Math.min(height[i],height[j])*(j-i);
                if(area>max_area) max_area = area;
            }
        }
        return max_area;
    }
}*/

//two pointers - optimised solution O(n)
class Solution {
    public int maxArea(int[] height) {
        int pointer_1 = 0;
        int pointer_2 = height.length-1;
        int max_area=0;
        while(pointer_1<pointer_2){
            if(height[pointer_1]<height[pointer_2]){
                max_area = Math.max(max_area, height[pointer_1]*(pointer_2-pointer_1));
                pointer_1++;
            }
            else{
                max_area = Math.max(max_area, height[pointer_2]*(pointer_2-pointer_1));
                pointer_2--;
            }
        }
        return max_area;
    }
}
