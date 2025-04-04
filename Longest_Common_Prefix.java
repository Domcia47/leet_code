class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for(int j = 1; j < strs.length; j++ ){
            for(int i = 0; i < strs[j].length() && i < common.length(); i++){
               
                if(strs[j].charAt(i) !=common.charAt(i)){
                    if(i!=0){
                        common = strs[j].substring(0,i);
                    }
                    else{
                        return "";
                    }
                }
               
            }
            if(common.length() > strs[j].length()){
                int idx =  strs[j].length();
                common = common.substring(0,idx);
            }
        }
        return common;
    }
}