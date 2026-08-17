class Solution {
    public boolean isPalindrome(int x) { int re , ad ,k = 0 ;
        ad = x ;
        while(ad>0) {
 re = ad %10 ;
 k = k*10 + re ;
 ad = ad/10 ;

        }
        if(k == x){
            return true ;
        } else {
            return false ; 
        }
        
    }
}