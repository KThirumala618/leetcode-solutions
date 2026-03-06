class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0; i<s.length(); i++)
        {
            int num=s.charAt(i);
            int num1=122-num+1;
            i++;
            sum=sum+num1*i;
            i--;
        }
        return sum;
    }
}