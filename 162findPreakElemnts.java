class Solution {
    public int findPeakElement(int[] nums) {
        int num=Integer.MIN_VALUE;
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>num)
            {
                num=nums[i];
                k=i;
            }
        }
        return k;
    }
}