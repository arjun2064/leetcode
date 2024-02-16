class Solution {
    public int search(int[] nums, int target) {

        //using binary search
        /**
            1. Choose left, right and middle
            2. number is with in left of right
            3. l>r left is increasing sequence
            4. check if your number is in between and apply binary search
            5. r>l right part is increasing sequence
            6. check if your number is in between and apply binary search
         */


        int left =0;
        int right = nums.length-1;
       
        while(left<=right){ // check for less then and equal to, to reach the single point that matches the target [4,5,6,7,8,1,2,3]

            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[left]<=nums[mid]){
                //left sorted

                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                } else{
                    left =mid+1;
                }


            }else{
                //right sorted
                if(target>nums[mid] && target<=nums[right]){
                    left=mid+1;
                } else{
                    right=mid-1;
                }

                
            }
            System.out.println(mid);


        }
        return -1;
        
    }

   
}
