class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a,b ;
        int count=0;
        a = s.toCharArray();
        b= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length==b.length){
        for(int i = 0;i<s.length()|i<t.length();i++){
            if(a[i]==b[i]){
                count++;
            }
        }}
        if(count==a.length|count==b.length){
            return true;
        }
        else{
            return false;
        }
    }
}