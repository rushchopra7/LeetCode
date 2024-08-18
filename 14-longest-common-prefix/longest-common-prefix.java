class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        int len = word.length();
        for (int i = 1 ; i < strs.length; i++){
            String s = strs[i] ;
            while(len > s.length() || !word.equals(s.substring(0, len))){
                len-- ;
                if(len == 0) {
                    return "" ;
                }
                word = word.substring(0,len);
            }
        }
        

         return word;

        }
       
        
    }
