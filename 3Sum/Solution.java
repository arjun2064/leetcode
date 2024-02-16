package 3Sum;

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        /*
            nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
            nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
            nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        */

        //analysis
            //1. Find 3 numbers with sum as zero
            //2. Find 2 sum with a target
        Arrays.sort(nums);    
        int target = 0;

        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                //-4, -1, -1, 0,1,2
                if(nums[i]+nums[j]+nums[k]==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                
                while(j<k && nums[j]==nums[j-1])j++;
                while(j<k && nums[k]==nums[k+1])k--;
            }
               else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }
                
            }
        }

        return result;
    }
}