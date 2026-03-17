class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int j=0;
        double sum=0;
        int m,n;
        for(int i=0; i<nums1.length; i++){
            arr[j]=nums1[i];
            j++;}
        for(int i=0; i<nums2.length; i++){
        arr[j]=nums2[i];
            j++;
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            m=arr.length/2;
            n=m+1;
            m=arr[m-1];
            n=arr[n-1];
            sum=(m+n)/2.0;
            return sum;
            }    
        else{
            m=(arr.length)/2;
            return arr[m];
        }
    }
}