class Solution {
    public boolean isPalindrome(String s) {
        int i=0; 
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            int charS= s.charAt(i);
            int charE=s.charAt(j);
            if (!((charS>=48&&charS<=57)||(charS>=97&&charS<=122))){
                i++;
                continue;
            }
            if (!((charE>=48&&charE<=57)||(charE>=97&&charE<=122))){
                j--;
                continue;
            }
            if(charS!=charE){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
