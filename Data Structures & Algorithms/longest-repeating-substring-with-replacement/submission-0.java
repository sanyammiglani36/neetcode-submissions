class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap();

       for(int i=0;i<n;i++){
        char ch = s.charAt(i);

        map.put(ch,map.getOrDefault(ch,0)+1);

        max = Math.max(max,map.get(ch));
        while((i-left+1) - max >k){
            char  leftChar = s.charAt(left);
            map.put(leftChar,map.get(leftChar)-1);
            left++;
        }
        count = Math.max(count,i-left+1);
       }
       return count;
    }
}
