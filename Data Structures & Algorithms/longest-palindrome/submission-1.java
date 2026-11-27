class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int length = 0;
        boolean odd = false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int freq : map.values()){
            if(freq % 2 == 0){
                length = length + freq;
            }
            else{
                length = length + freq - 1;
                odd = true;
            }
        }
        if(odd){
            length = length+1;
        }
        return length;
    }
}