class Solution {
    public int strStr(String haystack, String needle) {
        //kmp algorithm used
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen < nlen){
            return -1;
            }
            for (int i = 0; i <= hlen-nlen; i++){
                int j = 0;
                while (j < nlen && (haystack.charAt(i+j) == needle.charAt(j) ))
                    j++ ;
                    if(j==nlen){
                        return i ;
                    }
                }
                
            
            return -1;
    }
}
