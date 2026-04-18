class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder result = new StringBuilder();

        while (num != 0) {
            result.insert(0, num % 7); // prepend
            num /= 7;
        }

        if (isNegative) result.insert(0, "-");

        return result.toString();
    }
}