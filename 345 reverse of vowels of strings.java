class Solution {
    public String reverseVowels(String s) {
        int left=0,right=s.length()-1;
       char temp='-';
        char[] arr=s.toCharArray();
        while(left<right)
        {
            while(left<right)
          {
               
            if(arr[left]=='A'||arr[left]=='a'||arr[left]=='E'||arr[left]=='e'||arr[left]=='I'||arr[left]=='i'||arr[left]=='O'||arr[left]=='o'||arr[left]=='U'||arr[left]=='u')
            {
                break;
            }
           left++;
          }
          while(left<right)
          {
               
            if(arr[right]=='A'||arr[right]=='a'||arr[right]=='E'||arr[right]=='e'||arr[right]=='I'||arr[right]=='i'||arr[right]=='O'||arr[right]=='o'||arr[right]=='U'||arr[right]=='u')
            {
                break;
            }
             right--;
          }
                 temp=arr[left];
                 arr[left]=arr[right];
                 arr[right]=temp;
             left++;
             right--;
        }
        String str=String.valueOf(arr);
        return str; 
    }
}