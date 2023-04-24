class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        Boolean dup = false;
        for(int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])){
                dup = true;
                break;
            }
            numbers.add(nums[i]);
        }
        return dup;
    }
}