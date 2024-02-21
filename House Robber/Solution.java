package House Robber;

public class Solution {

    int max= 0;

    public int rob(int[] nums) {

        return helper(nums, 0);
    }

    public  int helper(int[] nums, int x){
        if(x>=nums.length) return 0;
        max = Math.max(nums[x]+ helper(nums, x+2),helper(nums, x+1)) ;
                System.out.println(x+" "+max);

        return max;


    }
}
