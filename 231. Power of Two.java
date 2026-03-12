class Solution {

    public boolean isPowerOfTwo(int n) {

        if(n <= 0) {
            return false;
        }

        for(long i = 0; i <= 31; i++) {

            long sum = (long)Math.pow(2, i);

            if(sum == n) {
                return true;
            }
        }

        return false;
    }
}