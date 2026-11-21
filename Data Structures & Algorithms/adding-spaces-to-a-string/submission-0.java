class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(j<n &&  i == spaces[j]){
                ans.append(" ");
                j++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}