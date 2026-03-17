class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
        if(nums[i]==target){
                list.add(i);
                count++;
            }
        }
        if(list.size()==0){
            return new int[]{-1,-1};
        }
        else if(list.size()==1)
        {  int num=list.get(list.size()-1);
            list.add(num);
            int num3=list.get(0);
            int num4=list.get(1);
            return new int[]{num3,num4};
        }
        else{
        int num7=list.get(0);
        int num8=list.get(list.size()-1);
        return new int[]{num7,num8}; 
        }   
    }
}