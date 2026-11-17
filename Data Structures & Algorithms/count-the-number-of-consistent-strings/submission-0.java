class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        Set<Character> set = new HashSet<>();

        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        int count  = 0;
        for(String str : words){
            boolean consistent = true;

            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    consistent = false;
                    break;
                }
            }
            if(consistent == true){
                count++;
            }
        }
        return count;
    }
}