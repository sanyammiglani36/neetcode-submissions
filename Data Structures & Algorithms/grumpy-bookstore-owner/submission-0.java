class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n1 = customers.length;
        int n2 = grumpy.length;
        int sum = 0;
        int j=0;

        for(int i=0;i<n1;i++){
            if(grumpy[i] == 0){
                sum = sum + customers[i];
            }
        }
        int count = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                count = count + customers[i];
            }
        }
        int max = count;
        for(int i=minutes;i<n1;i++){
            if(grumpy[i] == 1){
                count = count + customers[i];
            }
            if(grumpy[i-minutes] == 1){
                count = count - customers[i-minutes];
            }
            max = Math.max(max,count);
        }
        return sum + max;
    }
}