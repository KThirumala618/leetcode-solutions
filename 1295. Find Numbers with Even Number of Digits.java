class Solution {
    public int findNumbers(int[] nums) {
        int count,total=0,num,i;
        for(i=0; i<nums.length; i++)
        {
            num=nums[i];
            count=0;
            while(num!=0)
            {
                count++;
                num=num/10;
            }
            if(count%2==0)
            {
                total++;
            }
        }
        return total;
    }
}

class even{
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        Solution sol=new Solution();
        int size=scan.nextInt();

        int[] arr=new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i]=scan.nextInt();
        }
        
       int result= sol.findNumbers(arr);

       System.out.println(result);
    }
}