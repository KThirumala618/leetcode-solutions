class Solution {
    public int removeDuplicates(int[] nums) {
     int left=0,right=1,i,k=0;
     int[] arr=new int[nums.length];

     if(nums.length==right)
     {
        return nums[left]=right;
     }
        while(left<right)
        {
            if((nums[left]!=nums[right]))
            {
            nums[k]=nums[left];
            k++;
            
            left=right;
            }
            if(nums.length-1==right)
            {
                nums[k]=nums[right];
                break;
            }
            right++;
        }
     return k+1;
    }
}