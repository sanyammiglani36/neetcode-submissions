class Solution {
    public int countCharacters(String[] words, String chars) {
        int n = words.length;
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;

        for(char ch : chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String word : words){
            HashMap<Character,Integer> map2 = new HashMap<>(map);

            boolean valid = true;
            for(char ch : word.toCharArray()){
                if(map2.getOrDefault(ch,0) == 0){
                    valid = false;
                    break;
                }
                map2.put(ch,map2.get(ch) - 1);
            }
            if(valid == true){
                count = count + word.length();
            }
        }
        return count;
    }
}