class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0 ; 
        while(i < nums.length){
            int correct = nums[i]-1;
            // if(nums[i] > 0 && nums[i]!=nums[correct] && nums[i] <= nums.length)
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp ;
                temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }

        }
        //case 1
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j]!= j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
