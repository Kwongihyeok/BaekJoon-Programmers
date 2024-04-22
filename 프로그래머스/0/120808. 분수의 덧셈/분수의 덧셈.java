class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int max = 0;
        int int_denom = denom1*denom2;
        int int_number = (numer1*denom2)+(numer2*denom1);

        for(int i = 1; i<=int_denom && i<=int_number; i++){
            if(int_denom % i ==0 && int_number % i ==0){
                max = i;
            }
        }
        int_denom = int_denom / max;
        int_number = int_number / max;

        int[] answer = {int_number, int_denom};
        
        return answer;
    }
}