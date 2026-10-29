class Solution {
    public int frequencyOdd(Map<Character,Integer> map){
        int odd = 0;
        for(int freq : map.values()){
            if(freq % 2 != 0){
                odd = Math.max(freq,odd);
            }
        }
        return odd;
    }

    public int frequencyEven(Map<Character,Integer> map){
        int even = Integer.MAX_VALUE;
        for(int freq : map.values()){
            if(freq % 2 == 0){
                even = Math.min(freq,even);
            }
        }
        return even;
    }

    public int maxDifference(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int odd = frequencyOdd(map);
        int even = frequencyEven(map);

        return odd - even;
    }
}