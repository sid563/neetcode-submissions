class Solution {
    public boolean isPalindrome(String s) {
        int i=0; 
        int j=s.length()-1;
        // s=s.toLowerCase();
        // while(i<j){
        //     int charS= s.charAt(i);
        //     int charE=s.charAt(j);
        //     if (!((charS>=48&&charS<=57)||(charS>=97&&charS<=122))){
        //         i++;
        //         continue;
        //     }
        //     if (!((charE>=48&&charE<=57)||(charE>=97&&charE<=122))){
        //         j--;
        //         continue;
        //     }
        //     if(charS!=charE){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        while(i<j){
            char start = s.charAt(i);
            char end = s.charAt(j);
            if (!((start>='0'&&start<='9')||(start>='A'&&start<='Z')||(start>='a'&&start<='z'))){
                i++;
                continue;
            }
            if (!((end>='0'&&end<='9')||(end>='A'&&end<='Z')||(end>='a'&&end<='z'))){
                j--;
                continue;
            }
            if (start>='A'&&start<='Z'){
                start = (char)('a'+(start-'A'));
            }
            if (end>='A'&&end<='Z'){
                end = (char)('a'+(end-'A'));
            }
            
            if(start!=end){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
