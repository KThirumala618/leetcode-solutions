class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0; i<nums.length; i++)
        {
                int sum=0;
                int num1=nums[i];
                if(nums[i]<0)
                {
                    num1=-num1;
                }
                sum=num1*num1;
                nums[i]=sum;
        }
        Arrays.sort(nums);
        return nums;
    }
}