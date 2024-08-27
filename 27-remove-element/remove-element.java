class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        int len = nums.length;
        
        for(int i = 0; i <  len ; i++){
            if(nums[i] != val){
                nums[pointer] = nums[i];
                pointer += 1;

        }
        }
        return  pointer;
         /*int[] copyArray = new int[len-1];
  
        for(int i = 0, k=0; i<= len; i++){
            if(nums[i] == val){
                continue;
            }
            
            copyArray[k++] = nums[i];
            }   
        return copyArray.length ; */
        
    }
}