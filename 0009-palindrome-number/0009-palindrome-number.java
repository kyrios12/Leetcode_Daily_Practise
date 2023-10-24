class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x!=0&&x%10==0)){
            return false;
        }
        int remain=0;
        while(x>remain){
            remain = remain *10+x%10;
           x/=10;            
        }
        return (x==remain)||(x==remain/10);
    }
}