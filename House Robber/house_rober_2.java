package House Robber;

import java.util.*;
class Solution {

    int max= 0;
    int memo[];
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int m1= helper(nums, 0, nums.length-1);
        Arrays.fill(memo, -1);
        int m2= helper(nums, 1, nums.length);
        return Math.max(m1,m2);
    }

    public  int helper(int[] nums, int x, int end){
        if(x>=end) return 0;
        if(memo[x]!=-1) return memo[x];
        memo[x] = Math.max(nums[x]+ helper(nums, x+2,end),helper(nums, x+1,end)) ;
                System.out.println(x+" "+max);

        return  memo[x];


    }
}