//{ Driver Code Starts
import java.util.*;


class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMax(int[] arr, int n) 
    {
        // Your code here

        int [] result = new int[n];
        
                
        for(int i = 0; i<arr.length;i++){
            result[i] = maxSlidingWindowOptimized(arr, i);
        }
        return result;
        
    }
    
        private static int maxSlidingWindowOptimized(int[] nums, int k) {
       
        Deque<Integer> dq = new ArrayDeque<>();
        PriorityQueue<Integer> res = new PriorityQueue<>();

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
        return res.poll();
    }

    public static void main(String arg[]){
        System.out.println("Hello World");

        int [] input= {10, 20, 30, 50, 10, 70, 30};
        int [] ans = maxOfMax(input , 7);

        for(int i: ans){
            System.out.println("i");
            System.out.println(i);
        }
    }


}