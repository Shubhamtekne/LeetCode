class Solution {
    public int lengthOfLastWord(String s) {
        String[] parts = s.trim().split(" ");
        String temp = parts[(parts.length)-1];
        return temp.length();
    }
}