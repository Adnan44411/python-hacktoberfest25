class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         return isPalindrome(s ,0 ,s.length()-1);
    }
    public boolean isPalindrome(String s ,int si , int ei) {
        if(si>=ei){
            return true;
        }
        
        if(s.charAt(si)!=s.charAt(ei)){
            return false;
        }
        
        return isPalindrome(s, si+1 ,ei-1);
    }
}
