class Solution {
    public int maximumWealth(int[][] accounts) { int s=0, q =0 ;
    for (int i = 0 ;i< accounts.length;i++){ 
      for (int j = 0 ; j < accounts[i].length;j++){
            s = s + accounts[i][j] ;
            

      } if (s>q){q=s;}
      s=0 ;
    }
        return q ; 
    }
}