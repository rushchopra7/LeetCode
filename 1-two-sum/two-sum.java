class Solution {
    public int[] twoSum(int[] nums, int target) {
        int newArray[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                // If the sum of nums[i] and nums[j] equals the target, return their indices
                if(nums[i] + nums[j] == target){
                    newArray[0] = i;
                    newArray[1] = j;
                    return newArray;
    }
}
}
return new int[0];
}
}