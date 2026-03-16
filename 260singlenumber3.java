class Solution {
    public int[] singleNumber(int[] nums) {
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);}
        }
        int[] arr=new int[2];
        for(int key:map.keySet())
        { if(map.get(key)==1){
                arr[i]=key;
                i++;
              }
        }
        return arr;
    }
}