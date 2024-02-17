package Combination Sum;
class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        helper(candidates, target, 0, new ArrayList<>());

        return lists;
    }

    public void helper(int[] candidates, int target, int index, List<Integer> list){

        if(target==0) {
            lists.add(new ArrayList(list));
        }
        if(target<0) {
            return;
        }

        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            helper(candidates, target-candidates[i], index++,list );
            list.removeLast();
        }
       

    }
}
