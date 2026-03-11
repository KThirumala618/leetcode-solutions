class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char str:s.toCharArray())
        {
            if(map.containsKey(str))
            { map.put(str,map.get(str)+1);
            }
            else
            {
                map.put(str,1);}}
        int maxvowels =0;
        int maxconstants =0;
        for(char key:map.keySet())
        {if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u'){
            if(map.get(key)>maxvowels)
            {
                maxvowels=map.get(key);}}   else
           {
            if(map.get(key)>maxconstants)
            {
                maxconstants=map.get(key);
            }
            }
        }
        return maxvowels+maxconstants;
    }
}