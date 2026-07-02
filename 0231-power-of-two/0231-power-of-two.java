class Solution {
    public boolean isPowerOfTwo(int n) {
        //ByUsingRec
//         if(n==1) return true;
//         if(n<1 || n%2!=0) return false;
//    return isPowerOfTwo(n/2);
     return n > 0 && (n & (n - 1)) == 0;
    }
}