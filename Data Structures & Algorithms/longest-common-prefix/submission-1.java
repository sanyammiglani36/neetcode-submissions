class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        String first = strs[0];

        for(int i=0;i<first.length();i++){
            char ch = first.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}