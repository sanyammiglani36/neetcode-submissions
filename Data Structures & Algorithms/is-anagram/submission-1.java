class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()){
            return false;
        }
        
        char [] sss = s.toCharArray();
        char [] ttt = t.toCharArray(); 
        Arrays.sort(sss);
        Arrays.sort(ttt);

        int n = sss.length;
        int m = ttt.length;

        for(int i = 0;i<n;i++){
            if(sss[i] != ttt[i]){
                return false;
            }
        }
        return true;
    }
}
