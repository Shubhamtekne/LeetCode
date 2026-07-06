class Solution {
    public int[] plusOne(int[] digits) {

        // Start checking from the last digit because that's where addition begins.
        for (int i = digits.length - 1; i >= 0; i--) {

            // If the current digit is not 9, simply increase it and we're done.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and the carry moves to the left.
            digits[i] = 0;
        }

        // If we reach here, every digit was 9 (e.g., 999 -> 1000).
        // Create a new array with one extra space and put 1 at the beginning.
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}