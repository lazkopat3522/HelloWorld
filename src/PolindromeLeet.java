class PolindromeLeet {
    public boolean isPalindrome(String x) {
        int i=0,j=x.length()-1,c=0;
        while(j>=0)
        {
            if(x.charAt(i)==x.charAt(j)){
                    c++;
                }
            i++; j--;
        }
        if(c==x.length()/2){
            return true;

        } else return false;
    }
}

