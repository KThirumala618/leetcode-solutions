class Solution {
    public int maximumProduct(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        int firstmin1=Integer.MAX_VALUE;
        int secondmin2=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>=first)
            {
                third=second;
                second=first;
                first=nums[i];
            }
            else if(nums[i]>=second&&nums[i]!=first)
            {
                third=second;
                second=nums[i];
            }
            else if(nums[i]>=third&&nums[i]!=first&&nums[i]!=second)
            {
                third=nums[i];
            }


            if(nums[i]<=firstmin1)
            {
               secondmin2=firstmin1;
               firstmin1=nums[i];
            }
            else if(nums[i]<=secondmin2)
            {
                
                secondmin2=nums[i];
            }
           
        }
        return Math.max(first*second*third, first*firstmin1*secondmin2);
    }
}