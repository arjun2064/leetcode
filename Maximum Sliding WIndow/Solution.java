// package Maximum Sliding WIndow;

import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int l) {

        return maxSlidingWindowBruteForce(nums, l);
        return maxSlidingWindowOptimized(nums, l);
    }

    private int[] maxSlidingWindowOptimized(int[] nums, int l) {
       
                Deque<Integer> dq = new ArrayDeque<>();
                List<Integer> res = new ArrayList<>();
        
                for (int i = 0; i < k; i++) {
                    while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                        dq.pollLast();
                    }
                    dq.offerLast(i);
                }
                res.add(nums[dq.peekFirst()]);
        
                for (int i = k; i < nums.length; i++) {
                    if (dq.peekFirst() == i - k) {
                        dq.pollFirst();
                    }
                    while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                        dq.pollLast();
                    }
        
                    dq.offerLast(i);
                    res.add(nums[dq.peekFirst()]);
                }
                // Return the result as an array.
                return res.stream().mapToInt(i->i).toArray();
    }

    public int[] maxSlidingWindowBruteForce(int[] nums, int l) {


        int i=0;
        int j=i+l-1;
        List<Integer> list = new ArrayList<>();
        while(j<nums.length){
            int local_max= Integer.MIN_VALUE;
            for(int k=i;k<=j;k++){
                            System.out.println(i+" "+j+" k");
                local_max = local_max >nums[k]? local_max:nums[k];
            }
            list.add(local_max);
            i++;
            j++;
        }

        int[] array = new int[list.size()];
        for(int m=0;m<list.size();m++){
            array[m]=list.get(m);
        }
        return array;
    }
}
