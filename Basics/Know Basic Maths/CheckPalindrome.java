class CheckPlaindrome {
    public boolean isPalindrome(int x) {
        int n=x;
        int re=0;
        while(n>0){
            int r = n%10;
            re = re*10+r;
            n=n/10;
        }

        if(x==re){
            return true;
        }

        return false;
        
    }
}