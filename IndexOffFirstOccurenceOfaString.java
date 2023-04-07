class Solution {
    public int strStr(String haystack, String needle) {
        int hlength=haystack.length();
        int nindex=0;
        int slength=needle.length();
        for(int i=0;i<hlength;i++){
            if(haystack.charAt(i)==needle.charAt(nindex)){
                nindex++;
            }
            else
            {
                i=i-nindex;
                nindex=0;
            }
            if(nindex==slength){
                return i-slength+1;
            }
        }
        return -1;
    }
}
