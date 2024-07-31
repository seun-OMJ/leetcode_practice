public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;
        int end = 0;
        int str_len = s.length();
        
        result = str_len;
        for(int i = 0; i< str_len; i++){
            int j = i+1;
            int recurr = 0;
            int slideRecurr = 0;
            while(j<str_len && recurr == 0){
                for(int k = i;k<j;k++){
                    if(s.charAt(k) == s.charAt(j)){
                        slideRecurr = 1;
                        recurr = 1;
                    }
                }
                    if((s.charAt(i) != s.charAt(j)) && slideRecurr ==0){
                        if ((j-i)> (end - start)){
                            end = j;
                            start = i;
                        }
                        j++;
                }
                    else{
                        recurr = 1;
                }
                }
            }
        result = end + 1 - start;
        return result;
    }
}
